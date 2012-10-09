<%-- 
    Document   : gravarLivro
    Created on : 30/09/2012, 21:24:26
    Author     : heitormaffra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Livraria</title>
    </head>
    <body>
        <h1>Cadastro de Livros</h1>
        <form action="FrontController?action=GravarLivro" method="post">
            ISBN: <input type="text" name="txtIsbn" value="" /><br>
            Nome do livro: <input type="text" name="txtNomeLivro" value="" /><br>
            Nome do autor: <input type="text" name="txtNomeAutor" value="" /><br>
            Edi&ccedil;&atilde;o: <input type="text" name="txtEdicao" value="" /><br>
            Editora: <input type="text" name="txtEditora" value="" /><br>
            G&ecirc;nero: <input type="text" name="txtGenero" value="" /><br>
            <input type="reset" value="Limpar" /> <input type="submit" value="Enviar" />
        </form>
    </body>
</html>
