
import java.util.*;

public class Vegetables  {
	
	public static void main(String[] args) {
		
	// Create scanner object
		Scanner input = new Scanner(System.in);
    
	//Prompt user to input vegetable choice
		System.out.print("Enter the vegetable you would like to learn about. \n(1. Tomatoes, 2. Green Beans, 3. Potatoes, 4. Zucchini, 5. Asparagus): ");
		int vegName = input.nextInt();
		
	if (vegName == 1) {
    	System.out.print("Vegetable | Companion |   Foe \nTomatoes  | Asparagus | Cabbage");}
    	else if (vegName == 2) {
    	System.out.print(" Vegetable  | Companion |  Foe \nGreen Beans |  Carrots  | Beets");}
    	else if (vegName == 3)  {      
    	System.out.print("Vegetable | Companion |   Foe  \nPotatoes  |  Lettuce  | Tomatoes");}
    	else if (vegName == 4) {       
        	System.out.print("Vegetable | Companion |   Foe \nZucchini  |   Beans   | Potatoes");}
        else if (vegName == 5) {        
            	System.out.print("Vegetable | Companion |   Foe \nAsparagus | Tomatoes  | Potatoes")					
			 ;}
}



    
   
	
}	
		
	

