
public class Turing {

	public static void main(String[] args){
		
		String name1 = "Alan Turing";
	    String name2 = "Alan TUring";

	    if (name1.equals (name2)) {
	      System.out.println("The names are the same.");
	    }
	    int flag = name1.compareTo (name2);
	    if (flag == 0) {
	      System.out.println("The names are the same.");
	    } else if (flag < 0) {
	      System.out.println("name1 comes before name2.");
	    } else if (flag > 0) {
	      System.out.println("name2 comes before name1.");
	    }
	}
	}


