/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.LAW;

import Model.CourseDAO;
import Model.FactoryDAO;
import Model.IBM.IBM;
import Model.SE.SE;
import Model.SE.SEDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Muhsin
 */
public class LAWLogin extends HttpServlet {
    @Override
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    {
         response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        //get the credentials
        String email= request.getParameter("email");
        String password = request.getParameter("password");
        
        LAW law=new LAW(email,password);
        
         CourseDAO userDAO = FactoryDAO.enroleCourse("LAW");
        
        
        
        //LAWDAO dao = new LAWDAO();
        
        String enrole = null;
        

        enrole = userDAO.VerifyUserCourse(law);
            switch(enrole){
                case "LAW":
                        {
                           //create a new session
                            HttpSession session = request.getSession();
                            //Set the responce attribute
                            session.setAttribute("email",email);
                            //setting session attribute
                            response.sendRedirect("LAWHomePage.jsp");
                            break;
                        }  
    }
    }

}
}
