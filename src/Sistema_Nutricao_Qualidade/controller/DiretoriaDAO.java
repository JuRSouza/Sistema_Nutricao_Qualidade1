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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sistema_nutricao_qualidade.conexao.ConexaoDAO;
import sistema_nutricao_qualidade.model.Cadastro_Usuario;
import sistema_nutricao_qualidade.model.Diretoria;
import sistema_nutricao_qualidade.model.I_ComandosDAO;

public class DiretoriaDAO implements I_ComandosDAO<Diretoria> {

    Connection conn;
    PreparedStatement st;
    ResultSet rs;

    public DiretoriaDAO() {
        ConexaoDAO conexaoDAO = new ConexaoDAO();
        conn = conexaoDAO.conectar();
    }

    @Override
    public int salvar(Diretoria dir) {
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO Diretoria (nome, sobrenome, email, telefone, celular, Usuario_id)"
                    + " VALUES(?,?,?,?,?,?)");

            st.setString(1, dir.getNome());
            st.setString(2, dir.getSobrenome());
            st.setString(3, dir.getEmail());
            st.setString(4, dir.getTelefone());
            st.setString(5, dir.getCelular());
            st.setInt(6, dir.getUsuario().getId());

            status = st.executeUpdate();
            return status;

        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }

    @Override
    public Diretoria consultar(int id) {
        try {
            Diretoria dir = new Diretoria();
            st = conn.prepareStatement("SELECT * from Diretoria WHERE id = ?");
            st.setInt(1, id);
            rs = st.executeQuery();

            if (rs.next()) {
                dir.setId(rs.getInt("id"));
                dir.setNome(rs.getString("nome"));
                dir.setSobrenome(rs.getString("sobrenome"));
                dir.setEmail(rs.getString("email"));
                dir.setTelefone(rs.getString("telefone"));
                dir.setCelular(rs.getString("celular"));

                int usuarioId = rs.getInt("Usuario_id");
                Cad_UsuarioDAO usuarioDAO = new Cad_UsuarioDAO();
                Cadastro_Usuario usuario = usuarioDAO.consultar(usuarioId);
                dir.setUsuario(usuario);

                return dir;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
    }

    @Override
    public int atualizar(Diretoria dir) {
        int status;
        try {
            st = conn.prepareStatement("UPDATE Diretoria SET nome = ?, sobrenome = ?, email = ?, telefone = ?, celular = ?, Usuario_id = ?  where id = ?");

            st.setString(1, dir.getNome());
            st.setString(2, dir.getSobrenome());
            st.setString(3, dir.getEmail());
            st.setString(4, dir.getTelefone());
            st.setString(5, dir.getCelular());
            st.setInt(6, dir.getUsuario().getId());
            st.setInt(7, dir.getId());

            status = st.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar Diretoria" + ex.getErrorCode() + " " + ex.getMessage());
            return ex.getErrorCode();
        }
    }

    @Override
    public boolean excluir(int id) {
        ConexaoDAO conDao = new ConexaoDAO();
        try {
            int idUsuario = obterIdUsuario(id);

            st = conn.prepareStatement("DELETE FROM Diretoria WHERE id = ?");
            st.setInt(1, id);
            st.executeUpdate();

            if (idUsuario != 0) {
                st = conn.prepareStatement("DELETE FROM Usuario WHERE id = ?");
                st.setInt(1, idUsuario);
                st.executeUpdate();
            }

            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir dados Diretoria" + ex.getErrorCode());
            return false;
        } finally {
            conDao.desconectar();
        }

    }

    private int obterIdUsuario(int idDiretoria) {
        int idUsuario = 0;

        try {
            st = conn.prepareStatement("SELECT Usuario_id FROM Diretoria WHERE id = ?");
            st.setInt(1, idDiretoria);
            rs = st.executeQuery();

            if (rs.next()) {
                idUsuario = rs.getInt("Usuario_id");
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao obter ID do usuário associado à diretoria: " + ex.getErrorCode());
        }

        return idUsuario;
    }

    @Override
    public List<Diretoria> listar(String filtro) {
        String sql = "SELECT * FROM Diretoria";

        if (!filtro.isEmpty()) {
            sql = sql + " where nome like ?";
        }

        try {
            st = conn.prepareStatement(sql);

            if (!filtro.isEmpty()) {
                st.setString(1, filtro);
            }
            rs = st.executeQuery();

            List<Diretoria> lista = new ArrayList<>();

            while (rs.next()) {
                Diretoria dir = new Diretoria();

                dir.setId(rs.getInt("id"));

                int usuarioId = rs.getInt("Usuario_id");
                Cadastro_Usuario usuario = receberUsuario(usuarioId);
                dir.setUsuario(usuario);

                lista.add(dir);
            }
            return lista;

        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }

    }

    private Cadastro_Usuario receberUsuario(int usuarioId) {
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
