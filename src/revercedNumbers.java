


public class revercedNumbers {
	public static void main(String[] args){
		reverse(2345678);

	}
			public static void reverse(int n) {
				int remainder = 0;
				int result = 0;
				while (n != 0){ 
					remainder = n % 10;
					result = result * 10 + remainder;	
					n = n/10;
				}
				System.out.println(result);
			}
}
