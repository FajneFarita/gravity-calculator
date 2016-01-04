import java.util.HashMap;
import java.util.Scanner;


public class scrabble {
	
	public static void main(String[] args){
		System.out.println("Enter your word in capital letters, please, or hit Enter to exit: ");
		HashMap<Character, Integer> table = new HashMap<Character, Integer>();
		table.put('A', 1);
		table.put('B',3);
		table.put('C',3);
		table.put('D',2);
		table.put('E',1);
		table.put('F',4);
		table.put('G',2);
		table.put('H',4);
		table.put('I',1);
		table.put('J',8);
		table.put('K',5);
		table.put('L',1);
		table.put('M',3);
		table.put('N',1);
		table.put('O',1);
		table.put('P',3);
		table.put('Q',10);
		table.put('R',1);
		table.put('S',1);
		table.put('T',1);
		table.put('U',1);
		table.put('V',4);
		table.put('W',4);
		table.put('X',8);
		table.put('Y',4);
		table.put('Z',10);
		scrabbleScore(table);

	}
	
	
	public static int scrabbleScore(HashMap<Character, Integer> table) {
		Scanner sc = new Scanner (System.in);
		int sum = 0;
		while(true){
			String word = sc.nextLine();
			if (word.length() == 0){
				break;
			}
			char[] stringToCharArray = word.toCharArray();
			for (int i = 0; i<word.length(); i++){
				char character = stringToCharArray[i];
				if (!Character.isUpperCase(character))
					continue; 
				int scoreForChar = table.get(character);
				sum += scoreForChar;
				
			}		
			System.out.println("Your score is " + sum);

		}
		System.out.println("Bye-bye!");
		sc.close();
		return sum;

	}

}
