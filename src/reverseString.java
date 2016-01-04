import java.util.Scanner;


public class reverseString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("This program reverses a string.");
        System.out.print("Enter a string:  ");
        String userInput = scan.next();
        
        String reversedResult = reverseStringBackwardsOrder(userInput);
        System.out.println(userInput + " spelled backwards is "+ reversedResult);

    }
    
    public static String reverseStringBackwardsOrder(String str) {
        
        char[] strArray = str.toCharArray();
        
        char[] backwards = new char[str.length()];
        
        for(int i=strArray.length-1; i>-1; i--) {
            char c = strArray[i];
            backwards[strArray.length-i-1] = c;
        }
        
        String backwardsString;
        backwardsString = new String(backwards);
        return backwardsString;
    }
    
    /*public static String reverseString(String str) {
        String backwards = "";
        
        char[] charArray = str.toCharArray();
        char[] reversedArray = new char[str.length()];
//      char[] reversedArray = new char[charArray.length];
          
          for(int index = 0; index< charArray.length; index++) {
              char c = charArray[index];
              reversedArray[charArray.length-1-index] = c;
          }
        
        backwards = new String(reversedArray);    

        return backwards;
    }*/

}


