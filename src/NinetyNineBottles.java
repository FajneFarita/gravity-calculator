
public class NinetyNineBottles {

	public static void main(String[] args) {

		for (int i = 99; i > 1; i--){
			 System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer, ya’ take one down, ya’ pass it around, " + (i-1) + " bottles of beer on the wall.");
		}
		
		System.out.println("One bottle of beer on the wall, one bottle of beer, ya’ take it down, ya’ pass it around, no bottles of beer on the wall.");
		System.out.println("No bottles of beer on the wall, no bottles of beer, ya’ can’t take one down, ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall!");
	}
}
