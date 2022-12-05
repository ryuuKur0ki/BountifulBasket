package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ShopItem;

@WebServlet(name = "LoginServlet", urlPatterns = {"/UserLogin.do"})
public class LoginServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String enteredUN = (String) request.getParameter("username");
        String enteredPW = (String) request.getParameter("password");
        HashMap<String, String> validUsers = loadLoginInfo();
                        
        for (Map.Entry<String, String> pair : validUsers.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            
            if (key.equals(enteredUN) == true) {
                if (value.equals(enteredPW) == true) {
                    HttpSession userSession = request.getSession();
                    ArrayList<ShopItem> cart = new ArrayList<>();
                    double total = 0.0;
                    userSession.setAttribute("userID", enteredUN);
                    userSession.setAttribute("totalCost", total);
                    if (userSession.getAttribute("userCart") == null){
                        userSession.setAttribute("userCart", cart);
                    }                    
                    response.sendRedirect("shop.jsp");
                    return;
                }
                else {
                    response.sendRedirect("login-error.jsp");
                    return;
                }
            }            
        }
        response.sendRedirect("login-error.jsp");
        return;
        }
    
    private HashMap<String, String> loadLoginInfo() {
        HashMap<String, String> users = new HashMap<>();        
        users.put("ryuuKur0ki", "12345");
        users.put("testuser1", "aaaaa");
        users.put("admin1", "qwerty");
        users.put("asdad", "11111");        
        return users;
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
