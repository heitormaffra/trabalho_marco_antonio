/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author heitormaffra
 */
public class LivrariaEstadoEmEstoque implements LivrariaEstado {
    public String getEstado(){
        return "Livro sem estoque.";
    }
    public String vender(){
        return "Livro sem estoque.";
    }
}
