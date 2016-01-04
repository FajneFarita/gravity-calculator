import java.util.Scanner;


public class allFactors {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		System.out.print("The factors are: ");
		for (int y = 1; y <= x; y++){
			if (x%y == 0){
			System.out.print(y + ", ");
			}
		}
		scan.close();
	}
	
}
