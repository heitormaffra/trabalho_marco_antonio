/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author heitormaffra
 */
public class DatabaseLocator {
    private static DatabaseLocator instance = new DatabaseLocator();
  public static DatabaseLocator getInstance() {
    return instance;
  }
  /** Creates a new instance of DatabaseLocator */
  private DatabaseLocator() {
  }
  public Connection getConnection() throws SQLException, ClassNotFoundException
  {
      try{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn =
                DriverManager.getConnection("jdbc:derby://localhost:1527/livraria", "administrator", "administrator");
      return conn;
      }catch (Exception ex){
          System.out.println(ex.getMessage());
      }
        return null;
  }
}
