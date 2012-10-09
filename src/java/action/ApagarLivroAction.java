/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package action;
import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Livraria;
import persistence.LivrariaDAO;
/**
 *
 * @author heitormaffra
 */
public class ApagarLivroAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String isbn = request.getParameter("txtIsbn");
        
        if(isbn.equals("")) {
            response.sendRedirect("index.jsp");
        }
        
         else {
            Livraria livro = new Livraria();
            livro.setIsbn(isbn);
            try {
                LivrariaDAO.getInstance().excluir(livro);
                response.sendRedirect("livroSucesso.jsp");
            } catch (SQLException ex) {
                response.sendRedirect("livroErro.jsp");
                Logger.getLogger(ApagarLivroAction.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ApagarLivroAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
}
