/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author heitormaffra
 */
public interface Action {
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
