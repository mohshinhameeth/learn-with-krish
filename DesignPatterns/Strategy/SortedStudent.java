/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import Model.DAO;
import Model.User;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Muhsin
 */
public class SortedStudent implements SortingStrategy{
    @Override
     public void sort(HttpServletRequest request, HttpServletResponse response) {        
        try {
            DAO dao = DAO.getInstance();
            
           List<User> user=dao.getAllStudents();
            
            Collections.sort(user, Comparator.comparingInt(User::getRollno).reversed());
            
            request.setAttribute("STD_LIST", user);
            RequestDispatcher dispatcher = request.getRequestDispatcher("Admin1.jsp");
            dispatcher.forward(request, response);
            
        } catch (ServletException ex) {
            Logger.getLogger(SortedStudent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SortedStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}

    

