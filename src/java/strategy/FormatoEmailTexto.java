/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author heitormaffra
 */
public class FormatoEmailTexto extends FormatoEmail {
    
    @Override
    public String obterFormato() {
        return "Texto";
    }
    
    @Override
    public String obterMensagemFormatada (String mensagem) {
        return "'" + mensagem + "'";
    }
}
