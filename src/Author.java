
public class Author {

	public String name;
	public String email;
	public char gender;
	
	public Author(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName(String name){
		return name;
	}
	
	public String getEmail(String email){
		return email;
	}

	public void setEmail(String email){
		this.email = email;
	}
	
	public char getGender(char gender){
		return gender;
	}
	
	public String toString(){
		return name + " (" + gender + ")" + " at " + email;
		
	}
}
