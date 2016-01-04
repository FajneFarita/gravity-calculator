import java.util.Scanner;


public class raiseToPower {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double base = scan.nextDouble();
		int exp = scan.nextInt();
		int e = exp;
		double b = base;
scan.
			if (exp < 0){
				exp = exp*(-1);
				base = 1/base;
			}
		int count = 0;
		double result = 1.0;
		while (exp != count){
			result = result * base;
			count++;
		}
		scan.close();
		System.out.println(b + "^" + e + "=" + result);

	}
}	


/*
		public static void raiseToPower(double base, int exp){
			int answer = base;
			boolean isNegative = false;
			
			if (exp < 0) {
				isNegative = true;
				exp = exp*-1;
			}
				
			for(int i=0; i<exp; i++){
			answer = answer*base;
			}
			
			if (isNegative){
			answer = 1.0/answer;
			System.out.println("The answer is " + answer);
			}
			else{
			System.out.println("The answer is " + answer);
			}
		}			

*/


	public static int pow(int base, int exponent){
		int result = 1;
		if (exponent == 0){
			return result;
		}
		else{
			return base * pow(base, exponent-1);
		}
		 

	}	
	
	// Returns true if the given string reads the same
	// forwards as backwards.
	// Trivially true for empty or 1-letter strings.
	public static boolean isPalindrome(String s) {
	    if (s.length() < 2) {
	        return true;   // base case
	    } else {
	        char first = s.charAt(0);
	        char last  = s.charAt(s.length() - 1);
	        if (first != last) {
	            return false;
	        }              // recursive case
	        String middle = s.substring(1, s.length() - 1);
	        return isPalindrome(middle);
	    }
	}

	}	
	