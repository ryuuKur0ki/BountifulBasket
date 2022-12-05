<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bountiful Basket - Home</title>      
        <link rel="stylesheet" href="${pageContext.request.contextPath}/sources/homestyles.css">
    </head>
    
    <body>
        
        <header>
            <nav class="nav-bar">                
                <a class="toLanding" href="landing.jsp"><img id="site-logo" src="${pageContext.request.contextPath}/sources/basketlogowhite.png"></a>               
            </nav>
        </header>
            
        <main>
            <div class="main-container">
                <div class="site-greetings">
                    <h2>Welcome to...</h2>
                    <div class="logo-holder">
                        <img id="site-logo" src="${pageContext.request.contextPath}/sources/basketlogoblack.png">
                        <div class="logo-text-holder"><h1>Bountiful Basket</h1></div>
                    </div>
                </div>    
                <br>
                <div class="button-holder">
                    <a class="toLogin" href="login.jsp"><button class="common-button">User Log In</button></a>
                    <a class="toShop" href="shop.jsp"><button class="common-button">Browse Shop</button></a>
                    <a class="toShop" href="${pageContext.request.contextPath}/sources/documentation.pdf" target="_blank"><button class="special-button common-button">Check Documentation</button></a>
                </div>     
                <hr class="line-break">
                <div class="site-information">
                    <h2>Take part in the Bountiful Harvest!</h2>
                    <p class="body-text"><span class="emphasized">Bountiful Basket</span> is a simple online store which aims to provide an easy and hassle-free way for customers to purchase a
                        variety of fruits and vegetables sourced from local Philippine farmers.</p>
                    <p class="body-text">By shopping at <span class="emphasized">Bountiful Basket</span>, you can extend a helping hand and support our local farmers without having to leave
                        the comfort of your own home!</p>
                    <p class="body-text">We hope you have a wonderful time exploring our large selection of freshly grown and locally-produced fruits and vegetables!</p>
                </div>
            </div>
        </main>
                
        <footer>
            <div class="footer-text"><p>This website was created in fulfillment of the course requirements for ICS2608.</p></div>
            <div class="footer-text"><p>Made By: Articulo, De Leon, T., Macuja, Robles, J. - 2CSB</p></div>      
        </footer>
                
    </body>
    
</html>
