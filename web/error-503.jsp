<%-- 
    Document   : error-404
    Created on : 10 Dec 2022, 5:00:09 am
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error 503...!</title>      
        <link rel="stylesheet" href="${pageContext.request.contextPath}/sources/errorstyles.css">
    </head>
    <body>
        <header>
            <nav class="nav-bar">                
                <a class="toLanding" href="landing.jsp"><img id="site-logo" src="${pageContext.request.contextPath}/sources/basketlogowhite.png"></a>              
            </nav>
        </header>
        
        <main>
            <div class="main-wrapper">
                <div class="left-side">
                    <img id="error-notice" src="${pageContext.request.contextPath}/sources/move.png">
                </div>
                <div class="right-side">
                    <h1>503... An error!</h1>
                    <p class="body-text">It looks like the server <span class="emphasized">can't handle</span> your request right now!</p>
                    <p class="body-text">Maybe it's <span class="emphasized">too busy</span>? Maybe it's <span class="emphasized">offline</span>?</p>
                    <p class="body-text">Either way, you should try again later and see if it's okay!</p>
                </div>
            </div>
        </main>
                
        <footer>
            <div class="footer-text"><p>This website was created in fulfillment of the course requirements for ICS2608.</p></div>
            <div class="footer-text"><p>Made By: Articulo, De Leon, T., Macuja, Robles, J. - 2CSB</p></div>      
        </footer>
    </body>
</html>
