import java.util.Scanner;


public class perfectNumber {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		if (isPerfect(N)){
			System.out.println("This is a perfect number!");
		}
		else{ 
			System.out.println("This number is not perfect because its factors do not sum up to its amount");
		}
		
		for (int p = 7; p <= 1000; p++) {
			if (isPerfect(p)) {
				System.out.println("Next perfect number after 6 is " + p);
				break;
			}
		}
		
		scan.close();
	}

	private static boolean isPerfect(int N) {
		boolean result = false;
		int sum = 0;
		for (int i = 1; i <= N; i++) {
			if (N == (N/i)*i && i <= N/2){
				int f = i; 		
				sum += f;
			}
		}
		
		if (sum == N){
			result = true;
		}
		
		return result;
	}
}
	
	
