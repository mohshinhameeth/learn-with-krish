/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freddyexercise;

import java.util.Scanner;


/**
 *
 * @author Muhsin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
                       
		System.out.print("Enter the distance : ");
		Scanner scanner=new Scanner(System.in);
		double distance=scanner.nextDouble();

		FreddyCalc freddy=new FreddyCalc();
		freddy.reach(distance);
    }
}