/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_nutricao_qualidade.model;

import java.sql.Date;

/**
 *
 * @author Juliana
 */
public class Cadastro_Usuario {
    private int id;
    private String login;
    private String senha;
    private String confirmar_Senha;
    private String tipoAcesso;
    private Date ultimo_Login;
    private int id_permissoes;

    public Cadastro_Usuario() {
    }

    public Cadastro_Usuario(int id, String login, String senha, String tipoAcesso, Date ultimo_Login, int id_permissoes) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.tipoAcesso = tipoAcesso;
        this.ultimo_Login = ultimo_Login;
        this.id_permissoes = id_permissoes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmar_Senha() {
        return confirmar_Senha;
    }

    public void setConfirmar_Senha(String confirmar_Senha) {
        this.confirmar_Senha = confirmar_Senha;
    }

    public String getTipoAcesso() {
        return tipoAcesso;
    }

    public void setTipoAcesso(String tipoAcesso) {
        this.tipoAcesso = tipoAcesso;
    }

    public Date getUltimo_Login() {
        return ultimo_Login;
    }

    public void setUltimo_Login(Date ultimo_Login) {
        this.ultimo_Login = ultimo_Login;
    }

    public int getId_permissoes() {
        return id_permissoes;
    }

    public void setId_permissoes(int id_permissoes) {
        this.id_permissoes = id_permissoes;
    }

    
}
