import java.util.Scanner;


public class loopHello {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int count = 0;
			if(x >= 0){
				while (count != x){
					System.out.println("Hello, world!");
					count++;
				}
			}
			else{
				System.out.println("Eneter a positive integer");
			}
		scan.close();
	}
}
