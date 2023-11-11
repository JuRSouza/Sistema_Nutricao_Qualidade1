/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_nutricao_qualidade.model;

/**
 *
 * @author Juliana
 */
public class Diretoria {
    private int id;
    private String nome;
    private String sobrenome;
    private String email;
    private String telefone;
    private String celular;
    private Cadastro_Usuario usuario;

    public Diretoria() {
    }

    public Diretoria(int id, String nome, String sobrenome, String email, String telefone, String celular, Cadastro_Usuario usuario) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
        this.usuario = usuario;
    }

    public Diretoria(int id, String cargo, String nome, String sobrenome, String email, String celular) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Cadastro_Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Cadastro_Usuario usuario) {
        this.usuario = usuario;
    }

    public String ResumoDiretoria() {
        return "Diretoria{" + "id=" + id + ", nome" + ", sobrenome" + ", email" + ", celular" + ", cargo=" + '}';
    }

}
