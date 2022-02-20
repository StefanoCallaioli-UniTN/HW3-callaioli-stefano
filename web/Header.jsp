<%-- Header presente in ogni pagina del sito --%>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="HomePage.jsp">WebMarket</a>
    <div class="collapse navbar-collapse" id="navbarText">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="HomePage.jsp">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="Cart.jsp">Carrello</a>
            </li>
        </ul>
        <jsp:useBean id="logBean" class="it.unitn.disi.callaioli.stefano.beans.LoginBean"  scope="session"/>
        <% if (logBean.getUsername()==null){%>
        <span class="navbar-text">
            <a class="nav-link" href="LoginPage.jsp">Log In</a>
        </span>
        <% }else{%>
        <span class="navbar-text">
            <jsp:getProperty name="logBean" property="username"/>
        </span>
        <span class="navbar-text">
            <a class="nav-link" href="logout">Log Out</a>
        </span>
        <% }%>
    </div>
</nav>