import java.util.Arrays;

public class StringPractice {

	public static void main(String[] args) {
		
		int num = 5;
		// System.out.println(num + " hello"); will result in string
		
		String num2 = num + "";
		 //converting to string by using empty ""
		//addin a string to any data type converts it to a string
		
		String hello = "Hello";
		hello += " World";
		System.out.println(hello);
		
		//example using RHS only 
		System.out.println(hello.concat(" Java Students")); //string is added to the end 
		
		//example using LHS and RHS refer to later
		String newString = hello.concat(" Java Students");
		System.out.println(newString);
		
		
		String test = "Michelle";
		String test2 = "Ben";
		
		// if (!test.equals(test2)) { //is NOT EQUAL
			// System.out.println("These are not equal");
		// }
		
		boolean testEqual = test.equalsIgnoreCase(test2);
		System.out.println(testEqual);
		//will print out true or false

		
		String test3 = null;
		
		if (test3 == null) { //not is !=
			System.out.println("it's null");
		}
		
		
		String name = "Michelle";
		char secondLetter = name.charAt(1);
		System.out.println(secondLetter);
		// System.out.println(name.charAt(1));
		
		char firstLetter = name.charAt(0);
		System.out.println(firstLetter);
		
		System.out.println(name.endsWith("lle"));
		System.out.println(name.indexOf("h"));
		System.out.println(name.lastIndexOf("l"));
		
		System.out.println(name.length());
		System.out.println(name.replace("l", " learning java "));
		
		String test4 = "This,is,just,a,test"; //omg review this later****
		String [] testArray = test4.split(",");
		System.out.println(testArray.length); //no () bc it is a field
		System.out.println(testArray);
		System.out.println(Arrays.toString(testArray));
		
		String gC = "Grand Circus";
		System.out.println(gC.substring(0,5).toUpperCase()); //always endIndex - 1
		
		String y = "                   y          ";
		System.out.println(y.length());
		
		// String yTrim = y.trim(); //eliminates leading and trailing whitespace
		// System.out.println(yTrim.length());
		// int yTrim = y.trim().length()); 
		
		System.out.println(y.trim().length());
		
		
	}

}
