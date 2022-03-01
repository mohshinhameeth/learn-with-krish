/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Muhsin
 */
public abstract class  LoginAccess extends HttpServlet{
    public abstract void grantLoginAccess(HttpServletRequest request, HttpServletResponse response);
    public abstract String getRole(String email, String password);
}
