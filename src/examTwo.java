import java.util.ArrayList;


public class examTwo {
public static void main(String[] args) {
	
}

	public static String scrambleWord(String word){
		String resultString = "";
		for(int index = 0; index<word.length()-1; index++){
			String letter = word.substring(index, index+1);
			String nextLetter = word.substring(index+1, index+2);
			if(letter.equals("A") && (!nextLetter.equals("A"))){
				resultString = resultString+ nextLetter + letter;
				index++;
			}
			resultString = resultString + letter;
		}
		
	return resultString;
	}
	
	
	public static ArrayList<String> scrambleOrRemove(ArrayList<String> wordList){
		for(int index=0; index<wordList.size(); index++){
			String word = wordList.get(index);
			String scrambledWord = scrambleWord(word);
			if(word.equals(scrambledWord)){
				wordList.remove(index);
				index--;
			}
			else{
				wordList.set(index, scrambledWord);
			}
		}
		return wordList;
	}
	/*public static String scrambleWord(String word){
		
		char[] wordCharArray = word.toCharArray();
		for(int letterPosition = 0; letterPosition<wordCharArray.length; letterPosition++){
			if(wordCharArray[letterPosition] == 'A' && wordCharArray[letterPosition+1] !='A'){
				wordCharArray[letterPosition] = wordCharArray[letterPosition+1];
				wordCharArray[letterPosition+1] = 'A';
				letterPosition++;
			}
		}
	return new String(wordCharArray);
	}*/
}
