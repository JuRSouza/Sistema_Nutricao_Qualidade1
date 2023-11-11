/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_nutricao_qualidade.model;

import java.util.Date;

/**
 *
 * @author Juliana
 */
public class Funcionario {
    
     private int id;
    private String nome;
    private String sobrenome;
    private Date data_Nascimento;
    private String email;
    private String telefone;
    private String celular;
    private String rg;
    private String cpf;
    private String crn;
    private Endereco endereco; // AGREGAÇÃO
    private Cadastro_Usuario usuario; // AGREGAÇÃO
    private int enderecoId;

    public Funcionario() {
    }

    public Funcionario(int id, String nome, String sobrenome, Date data_Nascimento, String email, String telefone, String celular, String rg, String cpf, String crn, Endereco endereco, Cadastro_Usuario usuario) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.data_Nascimento = data_Nascimento;
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
        this.rg = rg;
        this.cpf = cpf;
        this.crn = crn;
        this.endereco = endereco;
        this.usuario = usuario;
    }

    public Funcionario (int id, Date data_Nascimento, String rg, String cpf, String crn, String telefone_Residencial, String cargo, Endereco endereco, String nome, String sobrenome, String email, String celular) {
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

    public Date getData_Nascimento() {
        return data_Nascimento;
    }

    public void setData_Nascimento(Date data_Nascimento) {
        this.data_Nascimento = data_Nascimento;
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Cadastro_Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Cadastro_Usuario usuario) {
        this.usuario = usuario;
    }

    public int getEnderecoId() {
        return enderecoId;
    }

    public void setEnderecoId(int enderecoId) {
        this.enderecoId = enderecoId;
    }

    public String ResumoFuncionario() {
        return "Funcionarios{" + "id=" + id + ", data_Nascimento=" + data_Nascimento
                + ", rg=" + rg + ", cpf=" + cpf + ", crn=" + crn
                + ", telefone_Residencial="
                + ", funcao=" + ", endereco=" + endereco + '}';
    }


   
}
