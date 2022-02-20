<%-- 
    Document   : Cart
    Created on : 19-mag-2021, 11.53.14
    Author     : StefanoCallaioli
--%>

<%@page import="it.unitn.disi.callaioli.stefano.beans.ProductBean"%>
<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
        <title>Carrello</title>
    </head>
    <body>
        <%@include file="Header.jsp" %>
        <jsp:useBean id="cart" class="it.unitn.disi.callaioli.stefano.beans.ProductDB"  scope="session"/>
        <% if(!cart.getProducts().isEmpty()){%>
        <% for(HashMap.Entry<Integer,ProductBean> product : cart.getProducts().entrySet()){%>
            <div class="card">
              <div class="card-body">
                <h5 class="card-title"><%=product.getValue().getName()%></h5>
                <h6 class="card-subtitle mb-2 text-muted"><%=product.getValue().getCategory()%></h6>
                <p class="card-text"><%=product.getValue().getPrice()%></p>
              </div>
            </div>
        <%}}else{%>
        <h3>Il carrello è vuoto.</h3>
        <%}%>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>
    </body>
</html>
