/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author heitormaffra
 */
public class Livraria {
    private String nomeLivro;
    private LivrariaEstado estado;

    public Livraria() {
        this.estado = new LivrariaEstadoEmEstoque();
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public LivrariaEstado getEstado() {
        return estado;
    }

    public void setEstado(LivrariaEstado estado) {
        this.estado = estado;
    }
    
    public String vender(){
        return estado.vender();
    }  
    
    public String getNomeEstado(){
        return estado.getEstado();
    }
    
    
}
