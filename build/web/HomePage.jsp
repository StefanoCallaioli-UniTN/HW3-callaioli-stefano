<%-- 
    Document   : HomePage
    Created on : 15-mag-2021, 16.08.34
    Author     : StefanoCallaioli
--%>

<%@page import="java.util.HashMap"%>
<%@page import="it.unitn.disi.callaioli.stefano.beans.ProductBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
        <title>Homepage</title>
    </head>
    <body>
        <%@include file="Header.jsp" %>
            <div class="container " style="margin-top:15px; margin-bottom:15px;">
                <form action="search" method="post">
                    <div class="custom-control custom-radio">
                        <input type="radio" id="BiciElettriche" name="category" class="custom-control-input" value="BiciElettriche">
                        <label class="custom-control-label" for="BiciElettriche">Bici Elettriche</label>
                    </div>
                    <div class="custom-control custom-radio">
                        <input type="radio" id="FrigoPortatili" name="category" class="custom-control-input" value="FrigoPortatili">
                        <label class="custom-control-label" for="FrigoPortatili">Frighi Portatili</label>
                    </div>
                    <div class="custom-control custom-radio">
                        <input type="radio" id="TV" name="category" class="custom-control-input" value="TV">
                        <label class="custom-control-label" for="TV">Televisori</label>
                    </div>
                    <div>
                        <button type="submit" class="btn btn-dark" >Cerca</button>
                    </div>
                </form>
            </div>
        </div>
        
        <jsp:useBean id="searchedProducts" class="it.unitn.disi.callaioli.stefano.beans.ProductDB"  scope="session"/>

        <% if(!searchedProducts.getProducts().isEmpty()){%>
        <% for(HashMap.Entry<Integer,ProductBean> product : searchedProducts.getProducts().entrySet()){%>
            <div class="card">
              <div class="card-body">
                <h5 class="card-title"><%=product.getValue().getName()%></h5>
                <h6 class="card-subtitle mb-2 text-muted"><%=product.getValue().getCategory()%></h6>
                <p class="card-text"><%=product.getValue().getPrice()%></p>
                <a href="productDetail?id=<%=product.getKey()%>" class="btn btn-secondary">Dettagli</a>
              </div>
            </div>
        <%}}%>
  
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>
    </body>
</html>
