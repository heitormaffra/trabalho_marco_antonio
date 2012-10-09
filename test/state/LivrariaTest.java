/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import junit.framework.TestCase;

/**
 *
 * @author heitormaffra
 */
public class LivrariaTest extends TestCase {
    
    private Livraria livro;
    
    public LivrariaTest(String testName) {
        super(testName);
    }
    
    protected void setUp() throws Exception {
        super.setUp();
        livro = new Livraria();
    }
    
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    public void testLivroEmVenda(){
        livro.setEstado(new LivrariaEstadoEmEstoque());
    }
    
    public void testLivroVendido(){
        livro.setEstado(new LivrariaEstadoVendido());
    }
    
    
}
