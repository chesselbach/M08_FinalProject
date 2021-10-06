import java.util.Scanner;

import application.Zones;

public class PlantMethod {

	public static void main(String[] args) {
		
		// Create scanner object
				Scanner input = new Scanner(System.in);
		    
			//Prompt user to input vegetable choice
				System.out.print("Enter the vegetable you are planting. \n(1. Tomatoes, 2. Green Beans, 3. Potatoes, 4. Zucchini, 5. Asparagus): ");
				int vegName = input.nextInt();
				
			if (vegName == 1) {
		    	System.out.print("Vegetable | Method | Prior to Season | Transplant ° | Yield per plant \nTomatoes  |  Seed  |  6-8 wks prior  |    65-70°    |     20 lbs \n          |  Plant |       ---       |    65-70°    |     20 lbs  ");}
		    	else if (vegName == 2) {
		    	System.out.print("Vegetable  |   Method    | Ground ° | Yield per plant \nGreen Beans| Direct Seed |    80°   |    1/2 lb");}
		    	else if (vegName == 3)  {      
		    	System.out.print("Vegetable |    Method   | Ground ° | Yield per plant \nPotatoes  | Direct Seed |  59-68°  |    2-3 lbs");}
		    	else if (vegName == 4) {       
		        	System.out.print("Vegetable |    Method    | Ground ° | Yield per plant \nZucchini  | Direct Seed  |  65-70°  |   6-10 lbs \n          |     Seed     |  65-70°  |   6-10 lbs   ");}
		        else if (vegName == 5) {        
		            	System.out.print("Vegetable |    Method   | Ground ° | Yield per plant \nAsparagus | Direct Seed |  77-86°  |    1/2 lb");
		        }
		}
}
