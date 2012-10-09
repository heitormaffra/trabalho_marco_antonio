/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Livraria;
import persistence.LivrariaDAO;

/**
 *
 * @author heitormaffra
 */
public class GravarLivroAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String isbn = request.getParameter("txtIsbn");
        String nomeLivro = request.getParameter("txtNomeLivro");
        String nomeAutor = request.getParameter("txtNomeAutor");
        String edicao = request.getParameter("txtEdicao");
        String editora = request.getParameter("txtEditora");
        String genero = request.getParameter("txtGenero");

        if(isbn.equals("") || nomeLivro.equals("")) {
            response.sendRedirect("index.jsp");
        } 

        else {
            Livraria livro = new Livraria();
            livro.setIsbn(isbn);
            livro.setNomeLivro(nomeLivro);
            livro.setNomeAutor(nomeAutor);
            livro.setEdicao(edicao);
            livro.setEditora(editora);
            livro.setGenero(genero);
            
            try {
                
                LivrariaDAO.getInstance().save(livro);
                response.sendRedirect("livroSucesso.jsp");
                
            } catch (SQLException ex) {
                response.sendRedirect("livroErro.jsp");
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }
}
