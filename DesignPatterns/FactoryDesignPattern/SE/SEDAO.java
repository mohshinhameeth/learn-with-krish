/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.SE;

import Model.CourseDAO;
import Model.DAO;
import Model.Database;
import Model.IBM.IBM;
import Model.LAW.LAW;
import Model.LAW.LAWDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Muhsin
 */
public class SEDAO implements CourseDAO {
    
    private Connection connection;
    
    public SEDAO(){
        connection=Database.getConnection();
    }
    
    @Override
    public String VerifyUserCourse (SE se)
    {
        String mail = se.getEmail();
        String password = se.getPassword();
        
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement("select email, password,Program from se");
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next())
            {
                String mail1 = rs.getString("email");
                String password1 = rs.getString("password");
                String program=rs.getString("Program");
                
                if (mail.equals(mail1) && password.equals(password1) && program.equals("Software Engineering"))
                {
                    return "Software Engineering";
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
    public String VerifyUserCourse(IBM ibm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
