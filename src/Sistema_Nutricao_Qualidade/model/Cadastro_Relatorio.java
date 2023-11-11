/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_nutricao_qualidade.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juliana
 */
public class Cadastro_Relatorio {
    
     private int id;
    private String data;
    private String hora_Entrada;
    private String hora_Saida;
    private String texto_Relatorio;
    List<Cadastro_Relatorio> listaRelatorio = new ArrayList<>();
    // ver se vai precisar do dado de imagem

    
    public Cadastro_Relatorio(int id, String data, String hora_Entrada, String hora_Saida, String texto_Relatorio) {
        this.id = id;
        this.data = data;
        this.hora_Entrada = hora_Entrada;
        this.hora_Saida = hora_Saida;
        this.texto_Relatorio = texto_Relatorio;
    }

    public Cadastro_Relatorio() {
    }

    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = id;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora_Entrada() {
        return hora_Entrada;
    }

    public void setHora_Entrada(String hora_Entrada) {
        this.hora_Entrada = hora_Entrada;
    }

    public String getHora_Saida() {
        return hora_Saida;
    }

    public void setHora_Saida(String hora_Saida) {
        this.hora_Saida = hora_Saida;
    }

    public String getTexto_Relatorio() {
        return texto_Relatorio;
    }

    public void setTexto_Relatorio(String texto_Relatorio) {
        this.texto_Relatorio = texto_Relatorio;
    }

    public List<Cadastro_Relatorio> getListaRelatorio() {
        return listaRelatorio;
    }

    public void setListaRelatorio(List<Cadastro_Relatorio> listaRelatorio) {
        this.listaRelatorio = listaRelatorio;
    }

    @Override
    public String toString() {
        return "Cadastro_Relatorios{" + "id=" + id + ", data=" + data + ", hora_Entrada="
                + hora_Entrada + ", hora_Saida=" + hora_Saida
                + ", texto_Relatorio=" + texto_Relatorio + '}';
    }

}
