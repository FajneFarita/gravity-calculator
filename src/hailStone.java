import java.util.Scanner;


public class hailStone {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int count = 0;
		while (N > 1) {
			if (N%2 == 0){
				System.out.println(N + " is even, so I take half: " + N/2);
				N = N/2;
			}
			else{
				
				System.out.println(N + " is odd, so I make 3n + 1: " + (N*3 + 1));
				N = N*3 + 1;
			}
			count++;
		} 
		System.out.println("The process took " + count + " steps to reach 1");
		scan.close();
	}	
	
}
