/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import controller.Action;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import observer.EmailObservador;
import persistence.LivrariaDAO;
/**
 *
 * @author heitormaffra
 */
public class RegistrarObservadorAction implements Action {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String email = request.getParameter("textEmail");
        String formatoEmail = request.getParameter("optFormatoEmail");
        if(email.equals("")) {
            response.sendRedirect("index.jsp");
        } else {
            EmailObservador observador = new EmailObservador(email, formatoEmail);
            LivrariaDAO.getInstance().adicionarObservador(observador);
            
            //apenas para o caso do observador precisar ver o observado
            observador.setObservado(LivrariaDAO.getInstance());
            
            response.sendRedirect("index.jsp");
        }
    }
    
}
