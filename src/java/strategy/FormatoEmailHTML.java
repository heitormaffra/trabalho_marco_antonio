/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author heitormaffra
 */
public class FormatoEmailHTML extends FormatoEmail{
     
    @Override
    public String obterFormato() {
        return "HTML";
    }
    
    
    @Override
    public String obterMensagemFormatada (String mensagem) {
        return "<HTML>" + mensagem + "</HTML>";
    }
}