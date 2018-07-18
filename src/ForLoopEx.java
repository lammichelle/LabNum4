/*
 * @author Michelle Lam
 */
public class ForLoopEx {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10 ; ++i) {
			System.out.println(i + " Hello");
		}
		
		//declared outside of loop to demonstrate accessing after the scope of the for loop
		int i; //global to main method
		for (i =  150; i >= 100; --i) { //is inside of for loop
	System.out.println(i);
		}
		
		System.out.println(i); //can do this bc we declared outside the loop

}
}
