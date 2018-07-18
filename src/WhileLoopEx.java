import java.util.Scanner;

public class WhileLoopEx {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);//1st thing
		
		//setting an initial condition that will be true so the while loop with 
		//execute at least one time
		String cont = "y";
		
		while(cont.equalsIgnoreCase("y")) {
			// your code should start here
			
			System.out.println("Do some stuff");
			
			
			
			//this is where your code should stop
			System.out.println("Do you want to continue? (y/n)");
			
			cont = scan.nextLine(); //can reuse the prompt from before - SCOPE
			
		}
		
		System.out.println("goodbye!");
		
		
		scan.close(); //2nd thing
		
		// demostrating how to set up a while loop like a for loop
		int i = 0;
		while(i <= 5 ) {
			System.out.println(i);
			i++;
		}
		

	}

}
