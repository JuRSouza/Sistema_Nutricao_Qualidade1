/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sistema_nutricao_qualidade.model;

/**
 *
 * @author Juliana
 */
import java.util.List;

public interface I_ComandosDAO<T> {

    public int salvar(T o);//criar - create
    T consultar(int id);// pesquisae/ler - reade
   // T consultar(String o);// pesquisar pelo nome
    public int atualizar(T o);//editar - update
    public boolean excluir(int id);// deletar
    public List<T> listar(String o);

}
