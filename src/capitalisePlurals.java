import java.util.ArrayList;


public class capitalisePlurals {
	public static void main (String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("Computers");
		words.add("will");
		words.add("counquer");
		words.add("the World");
		capitalisePl(words);
		System.out.println(words);
		removePlurals(words);
		System.out.println(words);
		
	}
		
	public static ArrayList<String> capitalisePl (ArrayList<String>words){
		
		int i = 0;
		for (String word : words) { 
		
			if (word.endsWith("s")){
				String allCaps = word.toUpperCase(); 
				words.set(i, allCaps);
			}
			i++;
		}
		return words;
	}

	public static ArrayList<String> removePlurals (ArrayList<String>words) {
		
		int i = 0;
		for (String word : words) {
			
			if(word.toLowerCase().endsWith("s")){
				words.set(i, "");
			}
			i++;	
		}
	return words;
	}
	
}	
