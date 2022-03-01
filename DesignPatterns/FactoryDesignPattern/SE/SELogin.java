/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.SE;

import Model.CourseDAO;
import Model.DAO;
import Model.FactoryDAO;
import Model.LAW.LAW;
import Model.LAW.LAWDAO;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class SELogin extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        //get the credentials
        String email= request.getParameter("email");
        String password = request.getParameter("password");
        
        SE se=new SE(email,password);
        //SEDAO dao = new SEDAO();
        
        CourseDAO userDAO = FactoryDAO.enroleCourse("Software Engineering");
        
        
        
        String enrole = null;
        
        enrole = userDAO.VerifyUserCourse(se);
            switch(enrole){
                case "Software Engineering":
                        {
                           //create a new session
                            HttpSession session = request.getSession();
                            //Set the responce attribute
                            session.setAttribute("email",email);
                            //setting session attribute
                            response.sendRedirect("SEHomePage.jsp");
                            break;
                        }  
    }
    }

}

