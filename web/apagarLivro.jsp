<%-- 
    Document   : apagarLivro
    Created on : 30/09/2012, 22:55:42
    Author     : heitormaffra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Digite os dados abaixo</h1>
        <form action="FrontController?action=ApagarLivro" method="POST">
            N&uacute;mero ISBN: <input type="text" name="txtIsbn" value="" size="15" />
            <input type="submit" value="Enviar" name="btnEnviar" />
        </form>
    </body>
</html>
