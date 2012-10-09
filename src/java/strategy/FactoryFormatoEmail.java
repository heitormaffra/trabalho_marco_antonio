/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author heitormaffra
 */
public class FactoryFormatoEmail {
    public static FormatoEmail obterFormatoEmail (String formatoEmail){
    FormatoEmail formatoEmailObject = null;
    String nomeClasse = "strategy.FormatoEmail" + formatoEmail;
    Class classe = null;
    Object object = null;
    
    try {
      classe = Class.forName(nomeClasse);
      object = classe.newInstance();
    } catch (Exception ex) {
      return null;
    }
    
    if(!(object instanceof FormatoEmail)) {
        return null;
    }
    formatoEmailObject = (FormatoEmail) object;
    
    return formatoEmailObject;
  }
}
