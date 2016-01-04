	//types are int, double, string, char

	//TYPE[] NAME_OF_ARRAY = new TYPE[LENGTH_OF_ARRAY]

	//int[] example = new int[5];



	public class array {

	    /**
	     * @param args
	     */
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        int[] values = new int[5];//if you donno what;s int the beginning
	        int[] example2 = {3, 2, 0, 5, 4};//if you know what's in the array
	        System.out.println(values.length);
	        
	        System.out.println(values[0]);
	        values[0] = 5;
	        System.out.println(values[0]);
	        values = new int[10];
	        System.out.println(values[0]);
	        
	        System.out.println("example "+example2[2]);
	        method(values);
	    }
	    
	    public static void method(int[] someArray) {
	    
	    }
	}

