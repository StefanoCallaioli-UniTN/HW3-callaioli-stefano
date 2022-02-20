package it.unitn.disi.callaioli.stefano.servlets;

import it.unitn.disi.callaioli.stefano.beans.ProductDB;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author StefanoCallaioli
 */

public class ProductDetailServlet extends HttpServlet {

    /**
     * Salva in sessione il prodotto richiesto dall'id specificato nella url
     * e porta alla pagina che ne mostrerà i dettagli
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String id = request.getQueryString().split("=")[1];
        
        HttpSession session=request.getSession(true);
        ProductDB products = (ProductDB)session.getAttribute("searchedProducts");
        session.setAttribute("productDetails", products.getProducts().get(Integer.parseInt(id)));
        
        
        RequestDispatcher rd=request.getRequestDispatcher("/ProductDetail.jsp");
        rd.forward(request, response);
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
