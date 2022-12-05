<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bountiful Basket - Shop</title>      
        <link rel="stylesheet" href="${pageContext.request.contextPath}/sources/shopstyles.css">
    </head>
    
    <body>
        <%
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
            response.setHeader("Expires", "0");            
        %>
        <header>
            <nav class="nav-bar">                
                <a class="toLanding" href="landing.jsp"><img id="site-logo" src="${pageContext.request.contextPath}/sources/basketlogowhite.png"></a>
                <% if (session.getAttribute("userID") != null) { %>
                <form action="UserLogout.do" method="post">                                        
                    <input type="submit" value="Log Out">                    
                </form>
                <% } %>
            </nav>
        </header>
            
        <main>
            <h1>shop</h1>
            <% if (session != null) { %>
            <% } %>
        </main>
                
        <footer>
            <div class="footer-text"><p>This website was created in fulfillment of the course requirements for ICS2608.</p></div>
            <div class="footer-text"><p>Made By: Articulo, De Leon, T., Macuja, Robles, J. - 2CSB</p></div>      
        </footer>
                
    </body> 
</html>
