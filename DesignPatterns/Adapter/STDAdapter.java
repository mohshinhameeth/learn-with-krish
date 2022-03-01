/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import Model.DAO;
import Model.User;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Muhsin
 */
public class STDAdapter implements STDManagementSystem{

    @Override
    public void convertDateToString(int rollno, String fName, String lName, String email, String password, String role, String Address,
            String MobileNo, SimpleDateFormat simpleDateFormat,
            String program, String SubmissionFee, String paymentmethod, String latepayment) {
                String DateJoined = null;
         Date date = new Date();
        DateJoined = simpleDateFormat.format(date);
        User user= new User(rollno, fName, lName, email, password, role, Address, MobileNo, DateJoined, program, SubmissionFee, paymentmethod, latepayment);
        User rolee= new User(email,password,"Student");
        
        DAO dao=DAO.getInstance();
         dao.addStudent(user);
        dao.enrole(rolee);
        
       
    }  
}
