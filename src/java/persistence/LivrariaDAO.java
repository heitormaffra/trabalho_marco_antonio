/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import model.Livraria;
import observer.Observado;

/**
 *
 * @author heitormaffra
 */
public class LivrariaDAO extends Observado {
    private static LivrariaDAO instance= new LivrariaDAO();
    private LivrariaDAO() {}
    public static LivrariaDAO getInstance() {
        return instance;
    }
    
    public void save(Livraria livro) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st  = null;
        
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("insert into livro (isbn, nomelivro, nomeautor, edicao, editora, genero)" +
                    " values ('" + livro.getIsbn() + "', '" + livro.getNomeLivro() + "', '" + livro.getNomeAutor() + "', '" +
                    livro.getEdicao() + "', '" + livro.getEditora() + "', '" + livro.getGenero() + "')" );
            setObjetoObservado (livro);
            notificarObservadores();
        } catch(SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }
    
    public void excluir(Livraria livro) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st  = null;
        
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.executeUpdate("delete from livro where isbn = '" + livro.getIsbn() + "'");
            setObjetoObservado (livro);
            notificarObservadores();
        } catch(SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }
    
    
    public void closeResources(Connection conn, Statement st) {
        try {
            if(st!=null) {
                st.close();
            }
            if(conn!=null) {
                conn.close();
            }
            
        } catch(SQLException e) {
            
        }
    }
    
    
}
