
public class CodeChallenge {

	public static void main(String[] args) {

		/*
		 * Write a short program that prints each number from 1 to 100 on a new line.
		 *
		 * For each multiple of 3, print "Fizz" instead of the number.
		 *
		 * For each multiple of 5, print "Buzz" instead of the number.
		 *
		 * For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of
		 * the number.
		 */

		//use for loop bc we know how many times it loops 
		for (int userNum = 1; userNum <= 100; userNum++) {
			if (userNum % 3 == 0 && userNum % 5 == 0) {
				System.out.println("Fizz Buzz");
			} else if (userNum % 3 == 0) {
				System.out.println("Fizz");
			} else if (userNum % 5 == 0) {
				System.out.println("Buzz");
			}
			else {
					System.out.println(userNum);
				}
			}
		}
	}

