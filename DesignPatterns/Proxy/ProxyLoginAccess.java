/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

import Model.DAO;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Muhsin
 */
public class ProxyLoginAccess extends LoginAccess{
    private String email;
    private String password;
    private RealLoginAccess objRealIA = null;

    public ProxyLoginAccess(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    @Override
    public void grantLoginAccess(HttpServletRequest request, HttpServletResponse response) {
       if("Admin".equals(getRole(email, password))){
           
          objRealIA = new RealLoginAccess(email, password);
          
          objRealIA.grantLoginAccess(request, response);
          
       }else if("Accountant".equals(getRole(email, password))){
           
          objRealIA = new RealLoginAccess(email, password);
          objRealIA.grantLoginAccess(request, response);
          
       }else if("Student".equals(getRole(email, password))){
           
          objRealIA = new RealLoginAccess(email, password);
          
          objRealIA.grantLoginAccess(request, response);
           try {
               response.setContentType("text/html");
               PrintWriter out = response.getWriter();  
               out.println("Sorry, invalid credentials");
               request.getRequestDispatcher("index.html").include(request, response);
           } catch (ServletException | IOException ex) {
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
    



