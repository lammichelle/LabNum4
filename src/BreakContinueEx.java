
public class BreakContinueEx {

	public static void main(String[] args) {
		// creating an infinite loop - ex: games
		//execute continuously unless we add some sort of stop condition
		
		while (true) {
			int randomNum = (int)(Math.random()*10); //this will return a num btwn 0 and 9 bc 1 is inclusive
			System.out.println(randomNum);
			
			
			//to break out of loop we need a conditional statement with break keyword
			if(randomNum == 7) {
				System.out.println("The number 7 has been found!");
				break;
			}
			
			
		}

		System.out.println(); //only for formatting and distinction btwn ex
		
		//continue example
		for(int i = 0; i < 5; i++) {
			//bc of scope we can reuse this variable name -- not recommended
			int randomNum = (int)(Math.random()*10);  
			
		if(randomNum > 7) {
				System.out.println("This is an invalid number -- going back to the top of the loop");
				continue;
		}
		System.out.println(randomNum); //will print anything less than or equal to 7
		
		}
		
	}

}
