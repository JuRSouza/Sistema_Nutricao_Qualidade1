/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_nutricao_qualidade.model;

/**
 *
 * @author Juliana
 */
public class Cliente {
    
    private int id;
    private String nome_Fantasia;
    private String razao_Social;
    private String cnpj;
    private String categoria;
    private String nome_responsavel_legal;
    private String sobrenome_responsavel_legal;
    private String email_responsavel_legal;
    private String telefone_responsavel_legal;
    private String celular_responsavel_legal;
    private String nome_gerente;
    private String sobrenome_gerente;
    private String email_gerente;
    private String telefone_gerente;
    private String celular_gerente;
    private String nome_subgerente;
    private String sobrenome_subgerente;
    private String email_subgerente;
    private String telefone_subgerente;
    private String celular_subgerente;
    private Endereco endereco; //AGREGAÇÃO

    public Cliente() {
    }

    public Cliente(int id, String nome_Fantasia, String razao_Social, String cnpj, String categoria, String nome_responsavel_legal, String sobrenome_responsavel_legal, String email_responsavel_legal, String telefone_responsavel_legal, String celular_responsavel_legal, String nome_gerente, String sobrenome_gerente, String email_gerente, String telefone_gerente, String celular_gerente, String nome_subgerente, String sobrenome_subgerente, String email_subgerente, String telefone_subgerente, String celular_subgerente, Endereco endereco) {
        this.id = id;
        this.nome_Fantasia = nome_Fantasia;
        this.razao_Social = razao_Social;
        this.cnpj = cnpj;
        this.categoria = categoria;
        this.nome_responsavel_legal = nome_responsavel_legal;
        this.sobrenome_responsavel_legal = sobrenome_responsavel_legal;
        this.email_responsavel_legal = email_responsavel_legal;
        this.telefone_responsavel_legal = telefone_responsavel_legal;
        this.celular_responsavel_legal = celular_responsavel_legal;
        this.nome_gerente = nome_gerente;
        this.sobrenome_gerente = sobrenome_gerente;
        this.email_gerente = email_gerente;
        this.telefone_gerente = telefone_gerente;
        this.celular_gerente = celular_gerente;
        this.nome_subgerente = nome_subgerente;
        this.sobrenome_subgerente = sobrenome_subgerente;
        this.email_subgerente = email_subgerente;
        this.telefone_subgerente = telefone_subgerente;
        this.celular_subgerente = celular_subgerente;
        this.endereco = endereco;
    }

    public Cliente(int id, String nome_Fantasia, String razao_Social, String cnpj, String telefone_fixo, String ramal_Gerente, String categoria, Endereco endereco, String nome, String sobrenome, String email, String celular) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_Fantasia() {
        return nome_Fantasia;
    }

    public void setNome_Fantasia(String nome_Fantasia) {
        this.nome_Fantasia = nome_Fantasia;
    }

    public String getRazao_Social() {
        return razao_Social;
    }

    public void setRazao_Social(String razao_Social) {
        this.razao_Social = razao_Social;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome_responsavel_legal() {
        return nome_responsavel_legal;
    }

    public void setNome_responsavel_legal(String nome_responsavel_legal) {
        this.nome_responsavel_legal = nome_responsavel_legal;
    }

    public String getSobrenome_responsavel_legal() {
        return sobrenome_responsavel_legal;
    }

    public void setSobrenome_responsavel_legal(String sobrenome_responsavel_legal) {
        this.sobrenome_responsavel_legal = sobrenome_responsavel_legal;
    }

    public String getEmail_responsavel_legal() {
        return email_responsavel_legal;
    }

    public void setEmail_responsavel_legal(String email_responsavel_legal) {
        this.email_responsavel_legal = email_responsavel_legal;
    }

    public String getTelefone_responsavel_legal() {
        return telefone_responsavel_legal;
    }

    public void setTelefone_responsavel_legal(String telefone_responsavel_legal) {
        this.telefone_responsavel_legal = telefone_responsavel_legal;
    }

    public String getCelular_responsavel_legal() {
        return celular_responsavel_legal;
    }

    public void setCelular_responsavel_legal(String celular_responsavel_legal) {
        this.celular_responsavel_legal = celular_responsavel_legal;
    }

    public String getNome_gerente() {
        return nome_gerente;
    }

    public void setNome_gerente(String nome_gerente) {
        this.nome_gerente = nome_gerente;
    }

    public String getSobrenome_gerente() {
        return sobrenome_gerente;
    }

    public void setSobrenome_gerente(String sobrenome_gerente) {
        this.sobrenome_gerente = sobrenome_gerente;
    }

    public String getEmail_gerente() {
        return email_gerente;
    }

    public void setEmail_gerente(String email_gerente) {
        this.email_gerente = email_gerente;
    }

    public String getTelefone_gerente() {
        return telefone_gerente;
    }

    public void setTelefone_gerente(String telefone_gerente) {
        this.telefone_gerente = telefone_gerente;
    }

    public String getCelular_gerente() {
        return celular_gerente;
    }

    public void setCelular_gerente(String celular_gerente) {
        this.celular_gerente = celular_gerente;
    }

    public String getNome_subgerente() {
        return nome_subgerente;
    }

    public void setNome_subgerente(String nome_subgerente) {
        this.nome_subgerente = nome_subgerente;
    }

    public String getSobrenome_subgerente() {
        return sobrenome_subgerente;
    }

    public void setSobrenome_subgerente(String sobrenome_subgerente) {
        this.sobrenome_subgerente = sobrenome_subgerente;
    }

    public String getEmail_subgerente() {
        return email_subgerente;
    }

    public void setEmail_subgerente(String email_subgerente) {
        this.email_subgerente = email_subgerente;
    }

    public String getTelefone_subgerente() {
        return telefone_subgerente;
    }

    public void setTelefone_subgerente(String telefone_subgerente) {
        this.telefone_subgerente = telefone_subgerente;
    }

    public String getCelular_subgerente() {
        return celular_subgerente;
    }

    public void setCelular_subgerente(String celular_subgerente) {
        this.celular_subgerente = celular_subgerente;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    
   
    public String ResumoCliente() {
        return "Clientes{" + "id=" + id + ", nome_Fantasia=" + nome_Fantasia
                + ", razao_Social=" + razao_Social + ", cnpj="
                + cnpj + ", telefone_fixo=" + "telefone "
                + ", ramal_Gerente=" + ", categoria="
                + ", endereco=" + endereco + '}';
    }


}
