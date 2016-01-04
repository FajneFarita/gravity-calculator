

public class maxValue {
	public static void main(String[] args) {
		int[] x = {4, 2, 9, 6, 3};
		maxVal(x);
	}
	
	private static void maxVal (int[] array) {
		int val1 = array[0];
	    int val2 = array[1];
	    int max = 0;
	    if(val1<val2)
	       max=val2;
	    else
	       max=val1;

	    for(int i = 2; i < array.length; i++) {
		    int val = array[i];
		    if(max<val)
		    	max=val;
		    else 
		    	max=max;
		 }
		System.out.println(max);
	}
}

/* public static void maxVal(int[] array) {
int len = array.length;
int max = array[0];

for(int i =1; i<len; i++) {    
   int val = array[i];
   if(max<val)
       max=val;
   else
       max=max;  
}
System.out.println(max);
}
*/