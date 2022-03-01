/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Muhsin
 */
public class SortingModule {
     public void setSortingStrategy(SortingStrategy sortingmethod,HttpServletRequest request, HttpServletResponse response){
        sortingmethod.sort(request, response);
    }
}
