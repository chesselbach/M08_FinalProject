
import java.util.Scanner;

public class Preserve {
	
	public static void main(String[] args) {
	
	// Create scanner object
			Scanner input = new Scanner(System.in);
	    
		//Prompt user to input vegetable choice
			System.out.print("Enter the vegetable you would like to preserve to find the shelf life. \n(1. Tomatoes, 2. Green Beans, 3. Potatoes, 4. Zucchini, 5. Asparagus): ");
			int vegName = input.nextInt();
			
		if (vegName == 1) {
	    	System.out.print("Vegetable | Frozen | Canned | Dehydrated \nTomatoes  | 12-18m |   18m  |     8m");}
	    	else if (vegName == 2) {
	    	System.out.print("Vegetable  |  Frozen  |  Canned  | Dehydrated \nGreen Beans|  10-12m  |   0-12m  |  10 - 12m");}
	    	else if (vegName == 3)  {      
	    	System.out.print("Vegetable | Frozen | Canned | Dehydrated \nPotatoes  |   12m  |  18m   |   5-10y");}
	    	else if (vegName == 4) {       
	        	System.out.print("Vegetable | Frozen |  Canned  | Dehydrated \nZucchini  |   3m   |  12-18m  |    1-2m");}
	        else if (vegName == 5) {        
	            	System.out.print("Vegetable | Frozen |  Canned  | Dehydrated \nAsparagus |  8-12m |  12-18m  |   3-6m");
	        }
	}
}
