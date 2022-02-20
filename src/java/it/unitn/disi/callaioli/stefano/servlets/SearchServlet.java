package it.unitn.disi.callaioli.stefano.servlets;

import it.unitn.disi.callaioli.stefano.beans.ProductDB;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author StefanoCallaioli
 */

public class SearchServlet extends HttpServlet {

    /**
     * Salva in sessione una HashMap dei prodotti della categoria richiesta e ricarica
     * la pagina
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        
        if(request.getParameter("category")!=null){
            String searchCategory=request.getParameter("category");

            HttpSession session=request.getSession(true);

            session.setAttribute("searchedProducts", new ProductDB(session,searchCategory));
        }

        RequestDispatcher rd=request.getRequestDispatcher("/HomePage.jsp");  
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
