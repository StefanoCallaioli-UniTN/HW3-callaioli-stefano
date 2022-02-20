<%-- 
    Document   : LoginPage
    Created on : 13-mag-2021, 16.42.27
    Author     : StefanoCallaioli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
        <title>Login</title>
    </head>
    <body>
        <%@include file="Header.jsp" %>
        <div class="container text-center">
            <form action="login" method="post">
                <div class="d-flex flex-column">
                    <div class="p-2">
                        <input type="text" id="username" name="username" placeholder="Username">
                    </div>
                    <div class="p-2">
                        <input type="password" id="password" name="password" placeholder="Password">
                    </div>
                    <div class="p-2"><input type="submit" value="Login"></div>
                </div> 
            </form>
        </div>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script> 
    </body>
</html>
