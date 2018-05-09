/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author maple
 */
public class createOrderServlet extends HttpServlet {
    
    private ArrayList<Order> orders = new ArrayList<>();
    private int orderCounts;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletContext sc = getServletContext();
        if(orders == null) {
            orderCounts = 0;
            orders = (ArrayList<Order>) sc.getAttribute("orders");
        } else {
            orderCounts = orders.size();
        }
        
        String nombre, calle, colonia, ciudad, telefono, tacotype;
        int cantidad;
        
        nombre = request.getParameter("nombre");
        calle = request.getParameter("calle");
        colonia = request.getParameter("colonia");
        ciudad = request.getParameter("ciudad");
        telefono = request.getParameter("telefono");
        tacotype = request.getParameter("tacotype");
        cantidad = Integer.parseInt(request.getParameter("cantidad"));

        Taco taco = new Taco(tacotype, cantidad);
        orderCounts++;
        Order order = new Order(orderCounts, nombre, calle, colonia, telefono, ciudad, taco, "En espera");
        
        orders.add(order);
        sc.setAttribute("orders", orders);
        
        response.sendRedirect("orderHub.jsp");
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
