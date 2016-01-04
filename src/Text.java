
public class Text {

	private String name;
	private Author author;
	private double price;
	private int qtyInStock = 0;
	
	public Text(String name, Author author, double price){
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	public Text(String name, Author author, double price, int qtyInStock){
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	public String getName(){
		return name;
	}	
		
	public Author getAuthor(){
		return author;
	}
	
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price = price;
	}
	
	public int getQtyInStock(){
		return qtyInStock;
	}
	
	public void setQtyInStock(int qtyInStock){
		this.qtyInStock = qtyInStock;
	}
	
	public String toString(){
		return name + " by " + author.toString() + " $" + price + " " + qtyInStock + " ex.";
	}	
		
		
//  public methods getName(), getAuthor(), getPrice(), setPrice(), getQtyInStock(), setQtyInStock().
//	toString() that returns "'book-name' by author-name (gender) at email".
//	(Take note that the Author's toString() method returns "author-name (gender) at email".)
//	Write the class Text (which uses the Author class written earlier). 

}

	
	
	

