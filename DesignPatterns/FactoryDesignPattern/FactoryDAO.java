/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.IBM.IBMDAO;
import Model.LAW.LAWDAO;
import Model.SE.SEDAO;

/**
 *
 * @author Muhsin
 */
public class FactoryDAO {
    public static SEDAO se = new SEDAO();
    public static IBMDAO ibm = new IBMDAO();
    public static LAWDAO law = new LAWDAO();
    
    public static CourseDAO enroleCourse (String Program)
    {
        if (Program == "Software Engineering")
        {
            return se;
        }
        
        else if (Program == "IBM")
        {
            return ibm;
        }
        
        else if (Program == "LAW")
        {
            return law;
        }
        
        return null;
    }
}


