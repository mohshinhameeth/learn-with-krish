/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freddyexercise;

/**
 *
 * @author Muhsin
 */
public class FreddyCalc {
  private double timeSpent,distanceTravelled=0;

	public void reach(double distance){

		while(distanceTravelled < distance){
		
			distanceTravelled+=5;
			if(distanceTravelled >= distance)
				break;
			timeSpent++;
	
	
			distanceTravelled+=3;
			if(distanceTravelled >= distance)
				break;
			timeSpent+=2;


			distanceTravelled++;
			if(distanceTravelled >= distance)
				break;
			timeSpent+=3.5;
                }

				
	System.out.println("Freddy took: "+timeSpent+" seconds");

	}

}