/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_nutricao_qualidade.model;

/**
 *
 * @author Juliana
 */

    
    public class Documentos_Clientes extends Cliente {
    private int id;
    private String descricao;
    private byte tipo_Documentos;

    public Documentos_Clientes() {
    }

    public Documentos_Clientes(String descricao, byte tipo_Documentos) {
        this.descricao = descricao;
        this.tipo_Documentos = tipo_Documentos;
    }

    public Documentos_Clientes(String descricao, byte tipo_Documentos, int id, String nome_Fantasia, String razao_Social, String cnpj, String categoria, String nome_responsavel_legal, String sobrenome_responsavel_legal, String email_responsavel_legal, String telefone_responsavel_legal, String celular_responsavel_legal, String nome_gerente, String sobrenome_gerente, String email_gerente, String telefone_gerente, String celular_gerente, String nome_subgerente, String sobrenome_subgerente, String email_subgerente, String telefone_subgerente, String celular_subgerente, Endereco endereco) {
        super(id, nome_Fantasia, razao_Social, cnpj, categoria, nome_responsavel_legal, sobrenome_responsavel_legal, email_responsavel_legal, telefone_responsavel_legal, celular_responsavel_legal, nome_gerente, sobrenome_gerente, email_gerente, telefone_gerente, celular_gerente, nome_subgerente, sobrenome_subgerente, email_subgerente, telefone_subgerente, celular_subgerente, endereco);
        this.descricao = descricao;
        this.tipo_Documentos = tipo_Documentos;
    }

    public Documentos_Clientes(int id, String nome_Fantasia, String razao_Social, String cnpj, String telefone_fixo, String ramal_Gerente, String categoria, Endereco endereco, String nome, String sobrenome, String email, String celular) {
    }


    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public byte getTipo_Documentos() {
        return tipo_Documentos;
    }

    public void setTipo_Documentos(byte tipo_Documentos) {
        this.tipo_Documentos = tipo_Documentos;
    }

   
    }
      

