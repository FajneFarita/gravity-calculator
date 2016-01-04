
public class isDivisible {

	public static void main(String[] args) {
		isDivisible(4,2);
		isDivisible(5,3);
		isDivisible(7,2);
	}
		public static boolean isDivisible(int n, int m){
			double remainder = n % m;
				if (remainder != 0){
					return false;
				}
				else{
					return true;
				}

		}	
}
