<%-- 
    Document   : ProductDetail
    Created on : 18-mag-2021, 15.43.00
    Author     : StefanoCallaioli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
        <title>Dettagli Prodotto</title>
    </head>
    <body>
        <%@include file="Header.jsp" %>
        <jsp:useBean id="productDetails" class="it.unitn.disi.callaioli.stefano.beans.ProductBean"  scope="session"/>
        <div class="card">
            <div class="card-body">
                <h5 class="card-title"><jsp:getProperty name="productDetails" property="name" /></h5>
                <h6 class="card-subtitle mb-2 text-muted"><jsp:getProperty name="productDetails" property="price" /></h6>
                <p class="card-text"><jsp:getProperty name="productDetails" property="description" /></p>
                <a href="addToCart" class="btn btn-secondary">Aggiungi al Carrello</a>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>
    </body>
</html>
