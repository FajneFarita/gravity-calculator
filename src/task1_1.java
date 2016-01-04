
public class task1_1 {

	public static void main(String[] args) {
		//TODO 
		double a = 3;
		double b = -4;
		double c = 5;
		printSum(a, b, c);
		printAve(a, b, c);
		printPro(a, b, c);
		printMax(a, b, c);
		printMin(a, b, c);
		
		/*double average = sum / 3;
		double product = num1 * num2 * num3;
		max(num1,num2,num3);*/
	}
	
	public static void printSum(double num1, double num2, double num3) {
		System.out.println("the sum is " + (num1+num2+num3)); 

	}
    
	public static void printAve(double num1, double num2, double num3) {
		System.out.println("the average is " + ((num1+num2+num3)/3));
	}
	
	public static void printPro(double num1, double num2, double num3) {
		System.out.println("the product is " + (num1*num3*num2));
	}
		
	public static void printMax(double num1, double num2, double num3) {
		// this method calculates the greatest number from three given numbers
		
		double max = num1;
		if (max < num2) {
			max = num2;
		}
		if (max < num3) {
			max = num3;
		}
		System.out.println("the maximum is " + max);
		
	}
	
	public static void printMin(double num1, double num2, double num3) {
		// this method calculates the greatest number from three given numbers
		
		double min = num2;
		if (min > num1) {
			min = num1;
		}
		if (min > num3) {
			min = num3;
		}
		System.out.println("the maximum is " + min);
		
	}
}