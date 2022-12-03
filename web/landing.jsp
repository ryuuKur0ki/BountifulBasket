<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bountiful Basket</title>
        <title>Lucky Rollers - Home</title>        
        <link rel="stylesheet" href="${pageContext.request.contextPath}/sources/homestyles.css">
    </head>
    
    <body>
        
        <header>
            <nav class="nav-bar">                
                <img id="site-logo" src="${pageContext.request.contextPath}/sources/basketlogowhite.png">                
            </nav>
        </header>
            
        <main>
            <div class="main-container">
                <div class="site-greetings">
                    <h2>Welcome to...</h2>
                    <img id="site-logo" src="${pageContext.request.contextPath}/sources/basketlogoblack.png">
                    <h1>Bountiful Basket</h1>
                </div>
                <br>
                <div class="button-holder">
                    <a class="toLogin" href="login.jsp"><button>User Log In</button></a>
                    <a class="toShop" href="shop.jsp"><button>Go to Shopfront</button></a>
                    <a class="toShop" href="${pageContext.request.contextPath}/sources/documentation.pdf" target="_blank"><button>Check Documentation</button></a>
                </div>     
                <br>
                <div class="site-information">
                    <h2>Take part in the Bountiful Harvest!</h2>
                    <p class="body-text">placeholder text whoever reads this u r big gei</p>
                </div>
            </div>
        </main>
                
        <footer>
            <div class="footer-text">
                <p>This website was created in fulfillment of the course requirements for ICS2608.</p>
                <p>Made By: Matthew Articulo, Thomas De Leon, Lorenzo Tzar Macuja, and Joseph Isaac Robles - 2CSB</p>
            </div>
        </footer>
                
    </body>
    
</html>
