/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.IBM.IBM;
import Model.LAW.LAW;
import Model.SE.SE;

/**
 *
 * @author Muhsin
 */
public interface CourseDAO {
     public String VerifyUserCourse (LAW law);
     
         public String VerifyUserCourse (IBM ibm);
         
           public String VerifyUserCourse (SE se);
         
         
}
