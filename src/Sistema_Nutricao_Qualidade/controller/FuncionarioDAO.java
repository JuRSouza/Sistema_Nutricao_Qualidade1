/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_nutricao_qualidade.controller;

/**
 *
 * @author Juliana
 */
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sistema_nutricao_qualidade.conexao.ConexaoDAO;
import sistema_nutricao_qualidade.model.Cadastro_Usuario;
import sistema_nutricao_qualidade.model.Endereco;
import sistema_nutricao_qualidade.model.Funcionario;
import sistema_nutricao_qualidade.model.I_ComandosDAO;
import java.sql.Statement;

public class FuncionarioDAO implements I_ComandosDAO<Funcionario> {

    Connection conn;
    PreparedStatement st;
    ResultSet rs;

    public FuncionarioDAO() {
        ConexaoDAO conexaoDAO = new ConexaoDAO();
        conn = conexaoDAO.conectar();
    }

    @Override
    public int salvar(Funcionario func) {
        int status;
        int enderecoId = func.getEndereco().getId(); // pega ID do endereço do funcionário

        if (enderecoId == 0) { // Se o ID do endereço for zero, o endereço ainda não foi salvo
            enderecoId = salvarEndereco(func.getEndereco()); // Salva o endereço e recebe o IDque foi gerado
            func.getEndereco().setId(enderecoId); // Define o ID do endereço no objeto func
        }
        try {
            st = conn.prepareStatement("INSERT INTO Funcionarios (nome, sobrenome, data_nascimento, email, "
                    + "telefone, celular, rg, cpf, crn, Endereco_id, Usuario_id) VALUES (?,?,?,?,?,?,?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);

            st.setString(1, func.getNome());
            st.setString(2, func.getSobrenome());
            st.setDate(3, new java.sql.Date(func.getData_Nascimento().getTime()));
            st.setString(4, func.getEmail());
            st.setString(5, func.getTelefone());
            st.setString(6, func.getCelular());
            st.setString(7, func.getRg());
            st.setString(8, func.getCpf());
            st.setString(9, func.getCrn());
            st.setInt(10, func.getEndereco().getId());
            st.setInt(11, func.getUsuario().getId());

            status = st.executeUpdate();
            if (status == 1) {
                ResultSet generatedKeys = st.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int funcionarioId = generatedKeys.getInt(1);
                    return funcionarioId;
                } else {
                    throw new SQLException("Falha ao obter o ID do funcionário salvo.");
                }
            } else {
                return -1; // ou outro valor de erro, se necessário
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }

    }

    @Override
    public Funcionario consultar(int usuarioId) {

        try {
            Funcionario func = new Funcionario();
            st = conn.prepareStatement("SELECT * FROM Funcionarios JOIN Usuario ON Funcionarios.Usuario_id = Usuario.id WHERE Usuario.id = ?");
            st.setInt(1, usuarioId);
            rs = st.executeQuery();

            if (rs.next()) {
                func.setId(rs.getInt("id"));
                func.setNome(rs.getString("nome"));
                func.setSobrenome(rs.getString("sobrenome"));
                func.setData_Nascimento(rs.getDate("data_nascimento"));
                func.setEmail(rs.getString("email"));
                func.setTelefone(rs.getString("telefone"));
                func.setCelular(rs.getString("celular"));
                func.setRg(rs.getString("rg"));
                func.setCpf(rs.getString("cpf"));
                func.setCrn(rs.getString("crn"));
                func.setEmail(rs.getString("email"));

                int enderecoId = rs.getInt("Endereco_id");
                Endereco end = receberEndereco(enderecoId);
                func.setEndereco(end);

                Cadastro_Usuario usuario = receberUsuario(usuarioId);
                func.setUsuario(usuario);

                return func;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }

    }

    /*  public Funcionarios consultar(String nome) {

        try {
            Funcionarios func = new Funcionarios();
            st = conn.prepareStatement("SELECT * FROM Usuario WHERE nome = ?");
            st.setString(1, nome);
            rs = st.executeQuery();

            if (rs.next()) {
                func.setId(rs.getInt("id"));
                func.setData_Nascimento(rs.getDate("data_nascimento"));
                func.setRg(rs.getString("rg"));
                func.setCpf(rs.getString("cpf"));
                func.setCrn(rs.getString("crn"));

                int enderecoId = rs.getInt("Endereco_id");
                Endereco end = receberEndereco(enderecoId);
                func.setEndereco(end);

                int usuarioId = rs.getInt("usuario_id");
                Cadastro_Usuario usuario = receberUsuario(usuarioId);
                func.setUsuario(usuario);
                return func;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }

    }*/
    @Override
    public int atualizar(Funcionario func) {

        int status;
        try {
            st = conn.prepareStatement("UPDATE Funcionarios SET nome = ?, sobrenome = ?, data_nascimento = ?, email = ?, "
                    + "telefone = ?, celular = ?, rg = ?, cpf = ?, crn = ?,  Endereco_id = ?,"
                    + " Usuario_id = ? where id = ?");

            st.setString(1, func.getNome());
            st.setString(2, func.getSobrenome());
            st.setDate(3, (Date) func.getData_Nascimento());
            st.setString(4, func.getEmail());
            st.setString(5, func.getTelefone());
            st.setString(6, func.getCelular());
            st.setString(7, func.getRg());
            st.setString(8, func.getCpf());
            st.setString(9, func.getCrn());
            st.setInt(10, func.getEndereco().getId());
            st.setInt(11, func.getUsuario().getId());
            st.setInt(12, func.getId());

            status = st.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar Funcionário" + ex.getErrorCode() + " " + ex.getMessage());
            return ex.getErrorCode();
        }
    }

    @Override
    public boolean excluir(int id) {
        try {
            st = conn.prepareStatement("DELETE FROM Funcionarios WHERE id = ?");
            st.setInt(1, id);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir Funcionário" + ex.getErrorCode());
            return false;
        }
        // VERIFICAR SE É NECESSÁRIO FAZER OUTRO MÉTODO EXCLUIR PELO NOME
    }

    @Override
    public List<Funcionario> listar(String filtro) {

        String sql = "SELECT * FROM Funcionarios";

        if (!filtro.isEmpty()) {
            sql = sql + " where nome like ?";
        }

        try {
            st = conn.prepareStatement(sql);

            if (!filtro.isEmpty()) {
                st.setString(1, filtro);
            }
            rs = st.executeQuery();

            List<Funcionario> lista = new ArrayList<>();

            while (rs.next()) {
                Funcionario func = new Funcionario();

                func.setId(rs.getInt("id"));
                func.setNome(rs.getString("nome"));
                func.setSobrenome(rs.getString("sobrenome"));
                func.setData_Nascimento(rs.getDate("data_nascimento"));
                func.setEmail(rs.getString("email"));
                func.setTelefone(rs.getString("telefone"));
                func.setCelular(rs.getString("celular"));
                func.setRg(rs.getString("rg"));
                func.setCpf(rs.getString("cpf"));
                func.setCrn(rs.getString("crn"));
                func.setEmail(rs.getString("email"));

                int enderecoId = rs.getInt("Endereco_id");
                Endereco end = receberEndereco(enderecoId);
                func.setEndereco(end);

                int usuarioId = rs.getInt("Usuario_id");
                Cadastro_Usuario usuario = receberUsuario(usuarioId);
                func.setUsuario(usuario);

                lista.add(func);
            }
            return lista;

        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }

    }

    private int salvarEndereco(Endereco end) {
        try {
            st = conn.prepareStatement("INSERT INTO Endereco (rua, numero, bairro, cep, cidade, estado, complemento) VALUES (?,?,?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);

            st.setString(1, end.getRua());
            st.setInt(2, end.getNumero());
            st.setString(3, end.getBairro());
            st.setString(4, end.getCep());
            st.setString(5, end.getCidade());
            st.setString(6, end.getEstado());
            st.setString(7, end.getComplemento());

            st.executeUpdate();

            int enderecoId;

            ResultSet generatedKeys = st.getGeneratedKeys();
            if (generatedKeys.next()) {
                enderecoId = generatedKeys.getInt(1);
            } else {
                throw new SQLException("Falha ao obter o ID do endereço salvo.");
            }

            return enderecoId;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public Endereco receberEndereco(int enderecoId) {
        try {
            st = conn.prepareStatement("SELECT * FROM Endereco WHERE id = ?");
            st.setInt(1, enderecoId);
            rs = st.executeQuery();

            if (rs.next()) {
                Endereco end = new Endereco();
                end.setId(rs.getInt("id"));
                end.setRua(rs.getString("rua"));
                end.setNumero(rs.getInt("numero"));
                end.setBairro(rs.getString("bairro"));
                end.setCep(rs.getString("cep"));
                end.setCidade(rs.getString("cidade"));
                end.setEstado(rs.getString("estado"));
                end.setComplemento(rs.getString("complemento"));

                return end;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao receber endereço: " + ex.getMessage());
            return null;
        }
    }

    public Cadastro_Usuario receberUsuario(int usuarioId) {
        try {
            st = conn.prepareStatement("SELECT * FROM Usuario WHERE id = ?");
            st.setInt(1, usuarioId);
            rs = st.executeQuery();

            if (rs.next()) {
                Cadastro_Usuario usuario = new Cadastro_Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setConfirmar_Senha(rs.getString("confirmar_senha"));
                usuario.setUltimo_Login(rs.getDate("ultimo_login"));

                return usuario;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao receber usuário: " + ex.getMessage());
            return null;
        }
    }
}
