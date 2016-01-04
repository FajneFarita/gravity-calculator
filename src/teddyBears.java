
public class teddyBears {
	
	
	public static void main(String[] args){
		int bearsFromDenzil = 53;
		if (Bears(bearsFromDenzil) == true)
			System.out.println("You Win!");
		else
			System.out.println("You Lose!");
	}
	
	public static boolean Bears(int n){
		if(n==42)
			return true;
		else if (n<42)
			return false;
		if (n%2 == 0){
			boolean win = Bears(n/2);
			if (win == true)
				return true;
		}
		if (n%3 == 0 || n%4 == 0){
			boolean win = Bears(n - (n%10 * (n%100/10)));
			if (win == true)
				return true;
		}
		if (n%5 == 0){
			boolean win = Bears(n-42);
			if (win == true)
				return true;
		}
					
		return false;
			
	}
}