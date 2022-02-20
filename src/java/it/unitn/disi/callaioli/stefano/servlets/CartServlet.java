package it.unitn.disi.callaioli.stefano.servlets;

import it.unitn.disi.callaioli.stefano.beans.ProductBean;
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

public class CartServlet extends HttpServlet {

    /**
     * Aggiunge il prodotto richiesto al carrello, creandone uno nuovo se non
     * esiste già, poi ricarica la pagina
     * 
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession session=request.getSession(true);
        
        if(session.getAttribute("productDetails")!=null){
            if(session.getAttribute("cart")!=null){
                ProductDB newCart = (ProductDB)session.getAttribute("cart");
                newCart.addProduct((ProductBean)session.getAttribute("productDetails"));
                session.setAttribute("cart", newCart);
            }else{
                ProductDB newCart = new ProductDB();
                newCart.addProduct((ProductBean)session.getAttribute("productDetails"));
                session.setAttribute("cart", newCart);  
            }
        }
        
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
