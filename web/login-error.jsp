<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bountiful Basket - Login</title>      
        <link rel="stylesheet" href="${pageContext.request.contextPath}/sources/loginstyles.css">
    </head>
    
    <body>
        
        <header>
            <nav class="nav-bar">                
                <a class="toLanding" href="landing.jsp"><img id="site-logo" src="${pageContext.request.contextPath}/sources/basketlogowhite.png"></a>
            </nav>
        </header>
            
        <main>
            <div class="half-side">
                <img id="site-logo" src="${pageContext.request.contextPath}/sources/basketlogoblack.png">
                <p class="body-text">You’re only one step away from accessing the wonders of our bountiful harvest!</p>
                <p class="body-text">Just enter your <span class="emphasized">username</span> and <span class="emphasized">password</span> on the respective fields provided.</p>
            </div>
            <hr class="line-break">
            <div class="half-side">
                <%-- TODO: add link to servlet handling user login and session management--%>
                <form  method="post">
                    <h2>USERNAME</h2>
                    <input type="text" id="username" name="username" class="text-entry" maxlength="20" required>
                    <div class="spacer"></div>
                    <h2>PASSWORD</h2>
                    <input type="text" id="username" name="username" class="text-entry" maxlength="20" required>
                    <div class="spacer"></div>
                    <input type="submit" class="special-button" value="Check Ticket">
                    <h3 class="error-text">The username or password you entered is either incorrect or is not associated with a registered account. Please try again.</h3>
                </form>
                
            </div>            
        </main>
                
        <footer>
            <div class="footer-text"><p>This website was created in fulfillment of the course requirements for ICS2608.</p></div>
            <div class="footer-text"><p>Made By: Articulo, De Leon, T., Macuja, Robles, J. - 2CSB</p></div>      
        </footer>
                
    </body>    
</html>
