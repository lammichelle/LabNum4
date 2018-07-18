import java.util.Scanner;

public class LabNum4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String answer;

		do {
			System.out.println("Enter an integer: ");
			int userInput = scan.nextInt();
			
//for formatting to bring everything to the left
			System.out.printf("%-10s %-10s %-10s%n", "Number", "Squared", "Cube");
			System.out.printf("%-10s %-10s %-10s%n", "=======", "=======", "=======");

			int i = 0;
			for (i = 1; i <= userInput; i++) {
				int area = (int) Math.pow(i, 2); //casting since changing from double to int
				int cube = (int) Math.pow(i, 3);
				System.out.printf("%-10s %-10s %-10s%n", i, area, cube);

			}

			System.out.println("Continue? (yes/no)");
			answer = scan.next(); // takes the next string

			if (answer.equalsIgnoreCase("no")) {
				System.out.println("Bye!"); //ending the program
				break;
			}

		} while (answer.equalsIgnoreCase("yes")); // continues looping
	}

}
