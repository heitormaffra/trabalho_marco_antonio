/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author heitormaffra
 */
public abstract class FormatoEmail {
    
    public abstract String obterMensagemFormatada(String mensagem);
    public abstract String obterFormato();
    
    public String gerarMensagemFormatada (String mensagem) {
        return "Email no formato " + obterFormato() + " = " + 
                obterMensagemFormatada(mensagem);
    }
}