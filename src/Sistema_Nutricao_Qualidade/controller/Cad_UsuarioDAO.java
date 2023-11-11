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
import sistema_nutricao_qualidade.model.I_ComandosDAO;

public class Cad_UsuarioDAO implements I_ComandosDAO<Cadastro_Usuario> {

    Connection conn;
    PreparedStatement st;
    ResultSet rs;

    public Cad_UsuarioDAO() {
        ConexaoDAO conexaoDAO = new ConexaoDAO();
        conn = conexaoDAO.conectar();
    }

    @Override
    public int salvar(Cadastro_Usuario usuario) {

        int status;
        try {
            st = conn.prepareStatement("INSERT INTO usuario (login, senha, confirmar_senha, tipo_acesso,"
                    + " ultimo_Login, id_permissoes)"
                    + " VALUES(?,?,?,?,?,?)");

            st.setString(1, usuario.getLogin());
            st.setString(2, usuario.getSenha());
            st.setString(3, usuario.getConfirmar_Senha());
            st.setString(4, usuario.getTipoAcesso());
            st.setDate(5, (Date) usuario.getUltimo_Login());
            st.setInt(6, usuario.getId_permissoes());

            status = st.executeUpdate();
            return status;

        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }

    }

    @Override
    public Cadastro_Usuario consultar(int id) {

        try {
            Cadastro_Usuario usuario = new Cadastro_Usuario();
            st = conn.prepareStatement("SELECT * from usuario WHERE id = ?");
            st.setInt(1, id);
            rs = st.executeQuery();

            if (rs.next()) {
                usuario.setId(rs.getInt("id"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setTipoAcesso(rs.getString("tipo_acesso"));
                usuario.setConfirmar_Senha(rs.getString("confirmar_senha"));
                usuario.setUltimo_Login(rs.getDate("ultimo_login"));
                usuario.setId_permissoes(rs.getInt("id_permissoes"));
                return usuario;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }

    }

    @Override
    public int atualizar(Cadastro_Usuario usuario) {
        int status;
        try {
            st = conn.prepareStatement("UPDATE usuario SET login = ?, senha = ?, confirmar_senha = ?, tipo_acesso = ?, ultimo_login = ?, id_permissoes = ? where id = ?");

            st.setString(1, usuario.getLogin());
            st.setString(2, usuario.getSenha());
            st.setString(3, usuario.getConfirmar_Senha());
            st.setString(4, usuario.getTipoAcesso());
            st.setDate(5, (Date) usuario.getUltimo_Login());
            st.setInt(6, usuario.getId_permissoes());
            st.setInt(7, usuario.getId());

            status = st.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar Usuário" + ex.getErrorCode() + " " + ex.getMessage());
            return ex.getErrorCode();
        }
    }

    @Override
    public boolean excluir(int id) {
        try {
            st = conn.prepareStatement("DELETE FROM usuario WHERE id = ?");
            st.setInt(1, id);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir Usuário" + ex.getErrorCode());
            return false;
        }
    }

    @Override
    public List<Cadastro_Usuario> listar(String filtro) {
        String sql = "SELECT * FROM usuario";

        if (!filtro.isEmpty()) {
            sql = sql + " where login like ?";
        }

        try {
            st = conn.prepareStatement(sql);

            if (!filtro.isEmpty()) {
                st.setString(1, filtro);
            }
            rs = st.executeQuery();

            List<Cadastro_Usuario> lista = new ArrayList<>();

            while (rs.next()) {
                Cadastro_Usuario usuario = new Cadastro_Usuario();

                usuario.setId(rs.getInt("id"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setConfirmar_Senha(rs.getString("confirmar_senha"));
                usuario.setTipoAcesso(rs.getString("tipo_acesso"));
                usuario.setUltimo_Login(rs.getDate("ultimo_login"));

                lista.add(usuario);
            }
            return lista;

        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }

    }

    public Cadastro_Usuario validarLogin(String login, String senha) {
        try {
            st = conn.prepareStatement("SELECT * FROM usuario WHERE login = ? AND senha = ? ");
            st.setString(1, login);
            st.setString(2, senha);
            rs = st.executeQuery();

            if (rs.next()) {
                Cadastro_Usuario usuario = new Cadastro_Usuario();
                usuario.setId_permissoes(rs.getInt("id_permissoes"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));

                return usuario;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao validar login: " + ex.getMessage());
            return null;
        }
    }

    public Cadastro_Usuario buscarPorId(int id) {
        Cadastro_Usuario usuario = null;
        try {
            st = conn.prepareStatement("SELECT * FROM usuario WHERE id = ?");
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                usuario = new Cadastro_Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setConfirmar_Senha(rs.getString("confirmar_senha"));
                usuario.setTipoAcesso(rs.getString("tipo_acesso"));
                usuario.setUltimo_Login(rs.getDate("ultimo_Login"));
                usuario.setId_permissoes(rs.getInt("id_permissoes"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
        }
        return usuario;
    }

}
