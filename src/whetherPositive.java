import java.util.Scanner;


public class whetherPositive {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
			if(number > 0){
				System.out.println("This number is positive");
			}
			else if(number == 0){
				System.out.println("This number is zero");
			}
			else{
				System.out.println("This number is negative");
			}	
				
		
		scan.close();
	}
}
