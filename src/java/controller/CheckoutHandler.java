/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.*;

/**
 *
 * @author Admin
 */
@WebServlet(name = "CheckoutHandler", urlPatterns = {"/Checkout.do"})
public class CheckoutHandler extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession currentSession = request.getSession();
        
        if (currentSession.getAttribute("userID") == null) {
            response.sendRedirect("landing.jsp");
            return;
        }
        
        String removeCartPressed = request.getParameter("removedItem");
        String wantsBack = request.getParameter("returnShop");
        String wantsProceed = request.getParameter("proceedCheckout");
        ArrayList<ShopItem> cartContents = (ArrayList<ShopItem>) currentSession.getAttribute("userCart");        
        ArrayList<ShopItem> stockList = new ShopInitializer().getStock();
        CartUtils util = new CartUtils();
        double totalCost = 0.0;    
        
        for (ShopItem item : cartContents) {            
            item.setTotal();
            totalCost += item.getTotal();
        }
        currentSession.setAttribute("totalCost", totalCost);
        
        if (removeCartPressed != null) {            
            // Actually for removing items in the cart.
            ShopItem forRemoval = util.retrieveItemByID(stockList, removeCartPressed);
            ShopItem matchedItem = null;
            
            for (ShopItem item : cartContents) {
                if (item.getID().equals(forRemoval.getID())) {
                    matchedItem = item;              
                }
            }
            cartContents.remove(matchedItem);                        
            
            currentSession.setAttribute("userCart", cartContents);
            cartContents = (ArrayList<ShopItem>) currentSession.getAttribute("userCart");
            totalCost = 0.0;
            for (ShopItem item : cartContents) {            
                item.setTotal();
                totalCost += item.getTotal();
            }
            currentSession.setAttribute("totalCost", totalCost);
            response.sendRedirect("checkout.jsp");
            return;
        }  
        
        if (wantsBack != null) {
            response.sendRedirect("shop.jsp");
            return;
        }
        
        if (wantsProceed != null) {
            response.sendRedirect("checkout-success.jsp");
            return;
        }
        
        response.sendRedirect("checkout.jsp");
        return;
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
