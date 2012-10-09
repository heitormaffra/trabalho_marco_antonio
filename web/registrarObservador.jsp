<%-- 
    Document   : registrarObservador
    Created on : 30/09/2012, 21:24:43
    Author     : heitormaffra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <h1>Registro de Observador</h1>
    <form action="FrontController?action=RegistrarObservador" method="post">
      Entre com email do observador:
      <input type="text" name="textEmail"/><br/>
      Entre com o formato de envio do email:
      <select name="optFormatoEmail">
          <OPTION VALUE="Texto">Texto
          <OPTION VALUE="HTML">HTML
      </select><br>
      <input type="submit"/>
    </form>
</html>