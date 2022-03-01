/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

import Model.DAO;
import Model.User;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Muhsin
 */
public class RealLoginAccess {
    public String email;
    public String password;

    public RealLoginAccess(String email, String password) {
        this.email = email;
        this.password = password;
    }
            
    public void grantLoginAccess(HttpServletRequest request, HttpServletResponse response) {
        //facade Design pattern
        if("Admin".equals(getRole(email, password))){
           try {
               //create a new HttpSession
               HttpSession session = request.getSession();
               //Set the responce attribute
               session.setAttribute("email",email);
               //session calls the setAttribute
               response.sendRedirect("AdminHP.jsp");
           } catch (IOException ex) {
               Logger.getLogger(ProxyLoginAccess.class.getName()).log(Level.SEVERE, null, ex);
           }
       }else if("Accountant".equals(getRole(email, password))){
            try {
              
               HttpSession session = request.getSession();
           
               session.setAttribute("email",email);
              
               response.sendRedirect("Accountant");
           } catch (IOException ex) {
               Logger.getLogger(ProxyLoginAccess.class.getName()).log(Level.SEVERE, null, ex);
           }
       }else if("Student".equals(getRole(email, password))){
            try {
           
               HttpSession session = request.getSession();
            
               session.setAttribute("email",email);
             
               response.sendRedirect("StudentHP.jsp");
           } catch (IOException ex) {
               Logger.getLogger(ProxyLoginAccess.class.getName()).log(Level.SEVERE, null, ex);
           }  
    }   
    }

    public String getRole(String email, String password) {
        String role =  null;
        try {           
            User user = new User(email, password);
            DAO dao = DAO.getInstance();           
            role = dao.authenticateUser(user);
            return role;
        } catch (SQLException ex) {
            Logger.getLogger(ProxyLoginAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

