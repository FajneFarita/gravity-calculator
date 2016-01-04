import java.util.*;

public class reverseText {

	ArrayList<String> stringList = new ArrayList<String>();
	Scanner scan = new Scanner(System.in);
	String input = "";
	
	while (!input.equals("stop")){
		input = scan.nextLine();
		stringList.add(input);
	}
	int i = stringList.size()-1;
	while (i>0) {
		System.out.println(stringList.get(i));
		i = i-1; 
	}
}
