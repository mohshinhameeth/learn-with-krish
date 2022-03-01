package JavaPractice;

/**
 *
 * @author Muhsin
 */
class Emp{
int eid;
int salary;
static String ceo; // will be same for all the object, will not load into the heap memory
//will be loaded into the class loader memory. Class loader memory executes first



// class loads first then only the object
static{ //excuets when yu load a class only once
    ceo = "Larry";
    System.out.println("in static");
    
}
public Emp(){ //executes when you create an object
    
    eid = 1;
    salary= 3000;
    System.out.println("in const");
  
}

public void show(){
    System.out.println(eid + " : " +
            salary + ":" + ceo);
}

}
public class StaticDemo {
    public static  void main (String[] args){
        
        Emp emp= new Emp ();
//        emp.eid = 1;
//        emp.salary = 25000;
//        emp.ceo = "Mohshin";
        
        Emp emp1= new Emp ();
//        emp1.eid = 2;
//        emp1.salary = 35000;
//        emp1.ceo = "Aqthar";
        
//        Emp.ceo = "Hameeth";// To access a static variable we dont need object 
                
        emp.show();
        emp1.show();
        
        
        
        
        
        
    }
    
}
