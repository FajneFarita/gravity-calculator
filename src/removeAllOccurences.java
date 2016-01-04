
public class removeAllOccurences {

	public static void main(String[] args){
		removeAllOccurrences("Knight Rider and Kill Bill are my favorite movies", 'K');
	}
	 public static String removeAllOccurrences(String str, char ch) {
		 String newStr = "";
		 
		 for(int i = 0; i < str.length(); i++){
			 char[] stringToCharArray = str.toCharArray();
			 char character = stringToCharArray[i];
			 if(character != ch){
				 newStr += character; 
		 
			 }
		 }
		 System.out.println(newStr);
		 return newStr;
	 }
}
