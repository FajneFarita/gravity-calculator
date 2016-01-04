
public class methods {

	public static void main(String[] args) {
		//TODO finding a maximum number
		int num1 = 10;
		int num2 = 2;
		int num3 = 25;
		max(num1,num2,num3);
		
	}
	
	public static void max(int num1, int num2, int num3) {
		// this method calculates the greatest integer from three given integers
		
			if(num1 > num2 && num1 > num3) {
			System.out.println("the greatest number is " + num1);
			}
			else if(num2 > num1 && num2 > num3) {
			System.out.println("the greatest number is " + num2);
			}	
			else if(num3 > num1 && num3 > num2) {
			System.out.println("the greatest number is " + num3);
			}
			else if(num1 == num2 || num2 == num3 || num1 == num3) {
				System.out.println("error: all numbers should be different!");	
			}
	}

	
}
