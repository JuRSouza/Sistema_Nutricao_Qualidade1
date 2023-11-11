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
import sistema_nutricao_qualidade.model.Cliente;
import sistema_nutricao_qualidade.model.Endereco;
import sistema_nutricao_qualidade.model.I_ComandosDAO;

public class ClienteDAO implements I_ComandosDAO<Cliente> {

    Connection conn;
    PreparedStatement st;
    ResultSet rs;

   /* @Override
    public int salvar(Clientes cl) {
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO clientes (nome_fantasia, razao_social, cnpj, categoria,"
                    + " Pessoas_id, Endereco_id,)"
                    + "VALUES(?,?,?,?,?,?");

            st.setString(1, cl.getNome_Fantasia());
            st.setString(2, cl.getRazao_Social());
            st.setString(3, cl.getCnpj());
            st.setString(4, cl.getCategoria());
          //  st.setString(5, cl.get
            st.setString(6, cl.getSobrenome());
            st.setString(7, cl.getEmail());
            st.setString(8, cl.getTelefone());
            st.setString(9, cl.getCelular());
            st.setInt(10, cl.getEndereco().getId());

            status = st.executeUpdate();
            return status;

        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }

    @Override
    public Clientes consultar(int id) {
        try {
            Clientes cl = new Clientes();
            st = conn.prepareStatement("SELECT * from clientes WHERE id = ?");
            st.setInt(1, id);
            rs = st.executeQuery();

            if (rs.next()) {
                cl.setId(rs.getInt("id"));
                cl.setNome_Fantasia(rs.getString("nome_fantasia"));
                cl.setRazao_Social(rs.getString("razao_social"));
                cl.setCnpj(rs.getString("cnpj"));
                cl.setNome(rs.getString("nome_proprietário"));
                cl.setSobrenome(rs.getString("sobrenome"));
                cl.setEmail(rs.getString("email_proprietario"));
                cl.setTelefone(rs.getString("telefone"));
                cl.setCelular(rs.getString("celular_proprietario"));
                
               

                int enderecoId = rs.getInt("Endereco_id");
                Endereco end = receberEndereco(enderecoId);
                cl.setEndereco(end);

                return cl;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }

    }*/

  /*  @Override
    public int atualizar(Clientes cl) {
        int status;
        try {
            st = conn.prepareStatement("UPDATE clientes SET nome_fantasia = ?, razao_social = ?, cnpj = ?,"
                    + "nome_proprietario = ?, sobrenome = ?, email_proprietario = ?, telefone = ?, celular_proprietario = ?,"
                    + "Gerente_id = ?, Endereco_clientes_id = ?  where id = ?");

            st.setString(1, cl.getNome_Fantasia());
            st.setString(2, cl.getRazao_Social());
            st.setString(3, cl.getCnpj());
            st.setString(4, cl.getNome());
            st.setString(5, cl.getSobrenome());
            st.setString(6, cl.getEmail());
            st.setString(7, cl.getTelefone());
            st.setString(8, cl.getCelular());
          //  st.setInt(9, cl.getGerente().getId());
            st.setInt(10, cl.getEndereco().getId());
            st.setInt(11, cl.getId());

            status = st.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar Clientes" + ex.getErrorCode() + " " + ex.getMessage());
            return ex.getErrorCode();
        }
    }*/

    @Override
    public boolean excluir(int id) {
        try {
            st = conn.prepareStatement("DELETE FROM clientes WHERE id = ?");
            st.setInt(1, id);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir Clientes" + ex.getErrorCode());
            return false;
        }
    }

  /*  @Override
    public List<Clientes> listar(String filtro) {
        String sql = "SELECT * FROM clientes";

        if (!filtro.isEmpty()) {
            sql = sql + " where nome like ?";
        }

        try {
            st = conn.prepareStatement(sql);

            if (!filtro.isEmpty()) {
                st.setString(1, filtro);
            }
            rs = st.executeQuery();

            List<Clientes> lista = new ArrayList<>();

            while (rs.next()) {
                Clientes cl = new Clientes();

                cl.setId(rs.getInt("id"));
                cl.setNome_Fantasia(rs.getString("nome_fantasia"));
                cl.setRazao_Social(rs.getString("razao_social"));
                cl.setCnpj(rs.getString("cnpj"));
                cl.setNome(rs.getString("nome_proprietario"));
                cl.setSobrenome(rs.getString("sobrenome"));
                cl.setEmail(rs.getString("email_proprietario"));
                cl.setTelefone(rs.getString("telefone"));
                cl.setCelular(rs.getString("celular_proprietario"));
                
                

                int enderecoId = rs.getInt("Endereco_funcionarios_id");
                Endereco end = receberEndereco(enderecoId);
                cl.setEndereco(end);

                lista.add(cl);
            }
            return lista;

        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
    }*/

    private Endereco receberEndereco(int enderecoId) {
        try {
            st = conn.prepareStatement("SELECT * FROM endereco WHERE id = ?");
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

    @Override
    public int salvar(Cliente o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cliente consultar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int atualizar(Cliente o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Cliente> listar(String o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  

}
