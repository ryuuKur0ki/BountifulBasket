<%@page import="java.text.NumberFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.*" %>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirm Order</title>      
        <link rel="stylesheet" href="${pageContext.request.contextPath}/sources/checkstyles.css">
    </head>
    <body>
        <%
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
            response.setHeader("Expires", "0");     

            if (session.getAttribute("userID") == null) {
                response.sendRedirect("landing.jsp");
                return;
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
            <div class="big-side">
                <h2>Order Summary</h2>
                <div class="cart-items">
                    <table class="top-table">
                        <tr>
                            <th></th>
                            <th>Item Name</th>
                            <th>Item Price</th>
                            <th>Quantity</th>
                            <th>Subtotal</th>
                            <th></th>
                        </tr>
                        
                        <form action="Checkout.do" method="post">
                        <%                        
                            if (session.getAttribute("userID") == null) {
                                response.sendRedirect("landing.jsp");
                            }
                            
                            NumberFormat formatter = NumberFormat.getInstance();
                            formatter.setMaximumFractionDigits(2);
                            formatter.setMinimumFractionDigits(2);
                            ArrayList<ShopItem> currentCart = (ArrayList<ShopItem>) session.getAttribute("userCart");
                            for (ShopItem cartItem : currentCart) {
                        %>
                        <tr>    
                            <td><img class="smallthumb" src="${pageContext.request.contextPath}/sources/img/<%=cartItem.getPic()%>"></td>
                            <td><h3><%out.print(cartItem.getName());%></h3></td>
                            <td><p>₱<%out.print(cartItem.getPrice());%></p></td>
                            <td><input name="<%=cartItem.getID()%>" type="number" value="<%=cartItem.getQuantity()%>" min="1" max="99" disabled></td>
                            <td><p>₱<%out.print(formatter.format(cartItem.getTotal()));%></p></td>
                            <td><button class="removeCartButton" type="submit" name="removedItem" value="<%=cartItem.getID()%>">Remove from Cart</button></td>
                        </tr>
                        <%
                            }                            
                        %>
                        </form>
                    </table>                    
                </div>
                <div class="after-items">
                    <hr class="line-break">
                    <table class="bottom-table">
                        <tr>
                            <td><h3>Total Order Cost:</h3></td>
                            <td><p>₱<%= formatter.format(session.getAttribute("totalCost"))%></p></td>
                        </tr>                            
                        <tr>
                            <form action="Checkout.do" method="post">
                            <td><button class="common-button" type="submit" name="returnShop" value="capitalism">Cancel Order</button></td>
                            <td><button class="special-button" type="submit" name="proceedCheckout" value="brokenow">Proceed and Place Order</button></td>
                            </form>
                        </tr>
                    </table>
                </div>
            </div>
        </main>
                    
        <footer>
            <div class="footer-text"><p>This website was created in fulfillment of the course requirements for ICS2608.</p></div>
            <div class="footer-text"><p>Made By: Articulo, De Leon, T., Macuja, Robles, J. - 2CSB</p></div>      
        </footer>
    </body>
</html>
