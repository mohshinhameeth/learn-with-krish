/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.IBM;

import Model.CourseDAO;
import Model.DAO;
import Model.Database;
import Model.LAW.LAW;
import Model.SE.SE;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Muhsin
 */
public class IBMDAO implements CourseDAO{
    private Connection connection;
    
    public IBMDAO(){
        connection=Database.getConnection();
    }
    
    @Override
    public String VerifyUserCourse (IBM ibm)
    {
        String mail = ibm.getEmail();
        String password = ibm.getPassword();
        
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement("select email, password,Program from ibm");
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next())
            {
                String mail1 = rs.getString("email");
                String password1 = rs.getString("password");
                String program=rs.getString("Program");
                
                if (mail.equals(mail1) && password.equals(password1) && program.equals("IBM"))
                {
                    return "IBM";
                }
            }
            
        }
        
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        return "Invalid";        
    }

    @Override
    public String VerifyUserCourse(LAW law) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String VerifyUserCourse(SE se) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


