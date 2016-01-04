
public class indexOf {
	
	public static void main(String[] args){
		String apple = "apple";
		System.out.println(indexOf(apple,'l'));
	}

	public static int indexOf(String look, char s) {
		//loop - go through every character in string see if the characters are equal to s
		//if no match, we want to return -1
		
		int match = -1;
		// for loop - because the string I am looking at has a limited number of characters
		
		char[] chararray = look.toCharArray();
		for(int index=0; i< chararray.length; i++) {
			//to check every character in the character array
			if (compare == s) {
				match = index;
				break;
			}
			//see if it is equal the character we are looking for
			//if it is make match the index of that character
			
		}
		
	}
}
