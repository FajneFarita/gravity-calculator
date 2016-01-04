import java.util.Scanner;


public class hotWeather {

	public static void main (String[] args) {
		System.out.println("Enter 10 temperature values for 10 days, please:");
		
		Scanner scan = new Scanner(System.in);
		double sum = 0;
		double[] temperature = new double[10];
		
		for(int i = 0; i <10; i++) {
			double x = scan.nextDouble();
			sum = sum+x;
			temperature[i] = x; 
		}
		double ave = sum/temperature.length;
		System.out.println("The average temperature was " + ave);
		
		scan.close();
		
		int days = 0;
		for(int i = 0; i <temperature.length; i++) {
			if(temperature [i] > ave) {
				days++;
	
			}
		}
		System.out.println("There were " + days + " days with the temperature above average.");		

	}
}
