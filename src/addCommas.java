
public class addCommas {
	public static void main (String[] args){
		String Number = "100976";
		String result = addCommasToNumericString(Number);
		System.out.println(result);
	}
	
	static String addCommasToNumericString (String digits){
		String s = new String();
		if (digits.length()/3 > 1){
			int resid = digits.length()%3;
			if (resid > 0){
				s = digits.substring(0, resid) + ",";
			}
			for(int i = resid; i<digits.length(); i+=3){
				s += digits.substring(i, i+3);
				if(i < digits.length() - 3)
					s += ",";
			}
		}
		else {
			return digits;
		}
		return s;
		
	}
}
