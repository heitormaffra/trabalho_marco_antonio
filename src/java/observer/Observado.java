/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author heitormaffra
 */
public abstract class Observado {
	private ArrayList observadores = new ArrayList();
	private Object objetoObservado;
        
	public void adicionarObservador(Observador observador) {
		observadores.add(observador);
	}

	public void removerObservador(Observador observador) {
		observadores.remove(observador);
	}
	
	public void notificarObservadores(){
		Iterator i = observadores.iterator();
		while(i.hasNext()){
			Observador observador = (Observador) i.next();
			observador.notificar();
		}
	}
        
        public Object getObjetoObservado() {
            return objetoObservado;
        }
        
        public void setObjetoObservado (Object objetoObservado) {
            this.objetoObservado = objetoObservado;
            
        }
}