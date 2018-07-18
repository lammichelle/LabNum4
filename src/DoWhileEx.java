

public class DoWhileEx {

	public static void main(String[] args) {
		
		
		//DOING A COUNT DOWN FROM 100
		//declare an integer as a starting point
		int counter = 100; //put it outside so the while loop can see it
		
		
		//the do loop will always execute the code btwn the brackets at least once
			do {
				System.out.println("Counter: " + counter); //or counter-- can be placed in here as well
				counter--; 
				
			}while (counter >= 0); //when it gets to 0 it will still run one more time 

			
			
	}

}
