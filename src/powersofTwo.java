
public class powersofTwo {

	public static void main(String[] args) {
		powersofTwo(30);
}

	public static void powersofTwo(int num) {
		int i = 0;
		double baseResult = 2;
		while(i<num) {
			double result = baseResult * 2;
			System.out.println("The " + i + "th power of 2 is " + result);
			i = i+1;
			baseResult = result;
		
		}
	}
}
