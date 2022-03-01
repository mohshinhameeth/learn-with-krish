/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.LAW;

/**
 *
 * @author Muhsin
 */
public class LAW {
     private String email,password,Program,details;

    public LAW() {
    }

    public LAW(String email, String password, String Program, String details) {
        this.email = email;
        this.password = password;
        this.Program = Program;
        this.details = details;
    }

    public LAW(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProgram() {
        return Program;
    }

    public void setProgram(String Program) {
        this.Program = Program;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
     
     
}
