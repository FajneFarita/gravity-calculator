import java.util.ArrayList;


public class intersect {

	public static void main (String[] args){
		int [] array1 = {1, 4, 8, 9, 11, 15, 17, 28, 41, 59};
		int [] array2 = {4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81};
		interSect(array1, array2);
		}
	
	public static ArrayList<Integer> interSect (int[] list1, int[] list2){
		ArrayList<Integer>list3 = new ArrayList<Integer>();
		
		for(int i = 0; i<list1.length; i++){
			for (int j = 0; j<list2.length; j++){
				if(list1[i] == list2[j]){
					list3.add(list1[i]);
				}
			}
		}

		//for(int i = 0; i<list3.size(); i++){
		//	System.out.print(list3.get(i) + " ");
		//}
			return (list3);	
		
	}
}