
public class arrayListOfStrings {
	
	public static void main (String[] args){
	String[] list = {"The New Yorker", "People", "Times"};	
	getAverage (list);
	
	}
	
	public static double getAverage (String[] list){
		if (list == null || list.length == 0){
			return 0.0;
		}
		double sum = 0.0;
		int count = 0;
		for (int i = 0; i<list.length; i++){
			sum += list[i].length();
			count++;
		
		}
		double ave = sum/count;
		return ave;
	}
}
