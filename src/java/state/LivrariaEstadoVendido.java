/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author heitormaffra
 */
public class LivrariaEstadoVendido implements LivrariaEstado {
    public String getEstado(){
        return "Livro em estoque.";
    }
    public String vender(){
        return "Artigo vendido.";
    }
}
