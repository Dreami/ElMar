<%-- 
    Document   : index
    Created on : May 3, 2018, 4:07:24 AM
    Author     : maple
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=ISO-8859-1" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="stylesheet.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>El mar</title>
    </head>
    <body background-color="black">
        ${wrong}
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="index.jsp"><img width="230px" height="180px" src="images/elmar-logo.png"/></a>
                </div>
              <form action="loginServlet" method="POST" class="navbar-form navbar-right">
                <div class="form-group">
                  <input type="text" class="form-control" name="username">
                  <input type="password" class="form-control" name="pwd">
                </div>
                <button type="submit" class="btn btn-default">Submit</button>
              </form>
            </div>
        </nav>
        <div id="menu" class="container">
            <h1>Menu</h1>
            <div id="pizza-menu">
                <section id="marlin-guisado">
                    <img alt="marlin-guisado" src="images/marlin-guisado.jpg"/><br>
                    <caption>Marlín guisado</caption>
                </section>
                <section  id="camaron-guisado">
                    <img alt="camaron-guisado" src="images/camaron-guisado.jpg"/><br>
                    <caption>Camarón guisado</caption>
                </section>
                <section id="camaron-empanizado">
                    <img alt="camaron-empanizado"src="images/camaron-empanizado.jpg"/><br>
                    <caption>Camarón empanizado</caption>
                </section>
                <section id="filete-pescado">
                    <img alt="filete-pescado"src="images/filete-pescado.jpg"/><br>
                    <caption>Filete de pescado empanizado</caption>
                </section>
                <section id="chile-relleno-marlin">
                    <img alt="chile-relleno-marlin"src="images/chile-relleno-marlin.jpg"/><br>
                    <caption>Chile jalapeño relleno de marlín</caption>
                </section>
            </div>
            <div class="container">
                <small>Disclaimer: Las imagenes fueron obtenidas de google, pero igual cocino asi de chido.</small>
            </div>
        </div>
    </body>
</html>
