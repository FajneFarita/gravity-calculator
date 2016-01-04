import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		System.out.println("What is the first side?");
		Scanner userInput = new Scanner( System.in );
		int sideA = userInput.next();
		triangle(sideA, 10, 5);
		
		
	}

	public double nextDouble() {
		// TODO Auto-generated method stub
		return 0;
	}
}
