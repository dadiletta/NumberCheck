import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		// create a blank array
		int[] myArray = new int[11];
		Scanner s = new Scanner(System.in); // instantiate a scanner
		
		// traverse and populate the array
		for(int i = 0; i < myArray.length; i++) {
			System.out.print("Number, please: ");
			myArray[i] = s.nextInt();
		} // closes loop
		
		if(hasSeven(myArray))
			System.out.println("This array has a seven");
		else
			System.out.println("No seven :-( ");
		
		// no even numbers and all smaller than seven
		if(notEvenSmallerThanSeven(myArray)) {
			System.out.println("All numbers smaller than 7 and odd");
		}else {
			System.out.println("Some numbers bigger than 7 or even");	
		}
	} // CLOSES main

	/**
	 * Checks that the values of the given array are smaller than
	 * 7 and are all odd 
	 * @param someArray
	 * @return true only if values are odd and less than 7
	 */
	public static boolean notEvenSmallerThanSeven(int[] someArray) {
		// traverse the array:
		for(int i = 0; i< someArray.length; i++) {
			// test if it's equal to 7
			if(someArray[i] >= 7 || someArray[i] % 2 == 0)
				return false;
		}
		// after checking the whole array
		return true;
		
		
	} // CLOSES hasSeven

	/**
	 * Checks to see if any values in given array are equal to 7
	 * @param someArray
	 * @return true if it finds a seven
	 */
	public static boolean hasSeven(int[] someArray) {
		// traverse the array:
		for(int i = 0; i< someArray.length; i++) {
			// test if it's equal to 7
			if(someArray[i] == 7)
				return true;
		}
		// after checking the whole array
		return false;
		
		
	} // CLOSES hasSeven

}  // CLOSES CLASS






