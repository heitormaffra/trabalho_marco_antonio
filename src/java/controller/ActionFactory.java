/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author heitormaffra
 */
public class ActionFactory {
    public static Action create(String action){
        Action actionObject= null;
        String nomeClasse = "action." + action + "Action";
        Class classe = null;
        Object object = null;
        
        try {
          classe = Class.forName(nomeClasse);
          object = classe.newInstance();
        } catch (Exception ex) {
          return null;
        }

        if(!(object instanceof Action)) {
            return null;
        }

        actionObject = (Action) object;
        return actionObject;
    }
}
