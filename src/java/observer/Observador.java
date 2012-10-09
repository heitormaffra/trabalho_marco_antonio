/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author heitormaffra
 */

public abstract class Observador {
    private Observado observado;
    
    public abstract void notificar();

    /**
     * @return the observado
     */
    public Observado getObservado() {
        return observado;
    }

    /**
     * @param observado the observado to set
     */
    public void setObservado(Observado observado) {
        this.observado = observado;
    }
}