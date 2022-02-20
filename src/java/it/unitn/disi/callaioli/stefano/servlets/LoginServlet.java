package it.unitn.disi.callaioli.stefano.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;

import it.unitn.disi.callaioli.stefano.beans.LoginBean;
import it.unitn.disi.callaioli.stefano.beans.UserDB;

/**
 *
 * @author StefanoCallaioli
 */

public class LoginServlet extends HttpServlet {

    /**
     * Username e Password passati sono salvati in sessione se sono presenti nel
     * "Database" creato dal file Users.txt, altrimenti l'utente è riportato alla
     * pagina di login
     * 
     * 
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String username=request.getParameter("username");
        String password=request.getParameter("password");
        
        LoginBean login=new LoginBean();
        login.setUsername(username);
        login.setPassword(password);

        ServletContext context=request.getServletContext();
        

        if (context.getAttribute("userDB")==null){
            context.setAttribute("userDB", new UserDB(context,"/WEB-INF/data/Users.txt"));
        }


        
        if(login.auth(context)){
            
            HttpSession session=request.getSession(true);
            session.setAttribute("logBean", login);
            
            RequestDispatcher rd=request.getRequestDispatcher("/HomePage.jsp");  
            rd.forward(request, response); 

        
        } else {
            
            RequestDispatcher rd=request.getRequestDispatcher("/LoginPage.jsp");  
            rd.forward(request, response); 
            
        }
        
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
