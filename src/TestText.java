


public class TestText {

	public static void main(String[] args){
		Author anAuthor = new Author("Natalia Timakova", "n.timakova@gmail.com", 'f');
		Text aText = new Text("Java for dummy", anAuthor, 19.95, 1000);
		Text anotherText = new Text("more Java for dummy", new Author("Anonymus", "n/a", 'f'), 29.95, 888);
		System.out.println(aText);
		System.out.println(anotherText);
		System.out.println(aText.toString());
		System.out.println(anotherText.toString());
		System.out.println(aText.getAuthor());
		

	}
	
	
//	Also write a test program called TestText to test the constructor and public methods in the class Text. 
//	Take Note that you have to construct an instance of Author before you can construct an instance of Text. 
//	E.g., Author anAuthor = new Author(......);
//	Text aText = new Text("Java for dummy", anAuthor, 19.95, 1000);
//	// Use an anonymous instance of Author
//	Text anotherText = new Text("more Java for dummy", new Author(......), 29.95, 888);

}
