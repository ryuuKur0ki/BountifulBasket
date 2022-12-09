<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bountiful Basket - Checkout</title>      
        <link rel="stylesheet" href="${pageContext.request.contextPath}/sources/checkstyles.css">
    </head>
    <body>
        <%
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
            response.setHeader("Expires", "0");     

            if (session.getAttribute("userID") == null) {
                response.sendRedirect("landing.jsp");
            }
        %>
        
        <header>
            <nav class="nav-bar">
                <img id="site-logo" src="${pageContext.request.contextPath}/sources/basketlogowhite.png">                
                <div class="profile-holder">
                    <img id="user-logo" src="${pageContext.request.contextPath}/sources/user.png">
                    <h1>${userID}</h1>
                    <form action="UserLogout.do" method="post">                                        
                        <input type="submit" class="header-button" value="Log Out">                    
                    </form>
                </div>
            </nav>
        </header>

        <main>
        </main>
                    
        <footer>
            <div class="footer-text"><p>This website was created in fulfillment of the course requirements for ICS2608.</p></div>
            <div class="footer-text"><p>Made By: Articulo, De Leon, T., Macuja, Robles, J. - 2CSB</p></div>      
        </footer>
    </body>
</html>
