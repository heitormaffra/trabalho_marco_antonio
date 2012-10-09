/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import model.Livraria;
import strategy.FactoryFormatoEmail;
import strategy.FormatoEmail;

/**
 *
 * @author heitormaffra
 */
public class EmailObservador extends Observador{

    private String email;
    private FormatoEmail formatoMensagem;
    
    public EmailObservador (String email) {
        this.email = email;
    }
    
    public EmailObservador (String livro, String formatoEmail) {
        this.email = livro;
        this.formatoMensagem = FactoryFormatoEmail.obterFormatoEmail(formatoEmail);
    }
     /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void notificar() {
        Livraria livro = (Livraria)getObservado().getObjetoObservado();
        String mensagem = formatoMensagem.gerarMensagemFormatada("Email para: " + email + 
                " - adicionado livro: " + livro.getNomeLivro());
        System.out.println(mensagem);
    }

    /**
     * @return the formatoMensagem
     */
    public FormatoEmail getFormatoMensagem() {
        return formatoMensagem;
    }

    /**
     * @param formatoMensagem the formatoMensagem to set
     */
    public void setFormatoMensagem(FormatoEmail formatoMensagem) {
        this.formatoMensagem = formatoMensagem;
    }
    
}
