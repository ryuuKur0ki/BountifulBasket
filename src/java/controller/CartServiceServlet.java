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
@WebServlet(name = "CartServiceServlet", urlPatterns = {"/CartProcess.do"})
public class CartServiceServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String buttonIDPressed = request.getParameter("selectedItem");
        ArrayList<ShopItem> stockList = new ShopInitializer().getStock();
                
        HttpSession currentSession = request.getSession();        
        ArrayList<ShopItem> cartContents = (ArrayList<ShopItem>) currentSession.getAttribute("userCart");        
        
        ShopItem addedItem = retrieveItemByID(stockList, buttonIDPressed);
        ShopItem oldItem = null;
        
        for (ShopItem item : cartContents) {
            if (item.getID().equals(addedItem.getID())) {
                oldItem = item;
                addedItem.setQuantity(addedItem.getQuantity() + oldItem.getQuantity());                
            }
        }
        
        cartContents.remove(oldItem);        
        cartContents.add(addedItem);
        currentSession.setAttribute("userCart", cartContents);        
        response.sendRedirect("shop.jsp");
        
        /*
        switch (buttonIDPressed) {
            case ("cabbage") :
                
                cartContents.add(addedItem);
                
                break;
                
            case ("carrot") :
                addedItem = retrieveItemByID(stockList, buttonIDPressed);
                cartContents.add(addedItem);
                
                break;
        }
        
        
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CartServiceServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CartServiceServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        */
    }
    
    private ShopItem retrieveItemByID(ArrayList<ShopItem> stock, String ID){
        for (ShopItem item : stock) {
            if (item.getID().equals(ID)) {
                return item;
            }
        }
        return null;
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
