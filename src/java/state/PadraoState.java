/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author heitormaffra
 */
public class PadraoState {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livraria livro = new Livraria();
        
        livro.setNomeLivro("Harry");
        
        livro.setEstado(new LivrariaEstadoVendido());
        
        System.out.println("Livro: " + livro.getNomeLivro() + " está no estado: "
                           + livro.getNomeEstado() + " - " + livro.vender());
        
        livro.setEstado(new LivrariaEstadoEmEstoque());
        
        System.out.println("Livro: " + livro.getNomeLivro() + " está no estado: "
                           + livro.getNomeEstado() + " - " + livro.vender());
    }
}
