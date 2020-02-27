package lesogp;

public class SquareRoot {
	
	/**
	 * returns the square root rounded down of the given number.
	 * @pre the given number is nonnegative.
	 * 		|getal>=0;
	 * @post the square of the result is not greater than the given number.
	 * 		|result*result <= getal
	 */
	public static int squareroot(int getal) {
		int result = 0;
		while (result*result <= getal) 
			result++;
		return result-1;
	}


}
