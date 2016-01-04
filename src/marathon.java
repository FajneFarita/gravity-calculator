
public class marathon {

		public static void main (String[] args) {
			
			String[] names = {
				"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
				"Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
				"Aaron", "Kate"
				};
			
			int[] times = {
				341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
				343, 317, 265
				};
			
			System.out.println("Name: Time");
			System.out.println("***********");
			for (int i = 0; i < names.length; i++) { 
				System.out.println(names[i] + ": " + times[i]);
			}
			

			
					int [] indexOfLowest = findFastest(times);
					System.out.println("the fastest runner is " + names[indexOfLowest [0]] + " with the result " + times[indexOfLowest [0]]);
					System.out.println("the second fastest runner is " + names[indexOfLowest [1]] + " with the result " + times[indexOfLowest [1]]);
					}
					
				public static int[] findFastest(int[] times){
					int lowestValue = Integer.MAX_VALUE;
					int indexOfLowestValue = 0;
					int indexOfSecondLowest = 0;
					int [] twoValues = new int [2];
					for(int i = 0; i < times.length; i++) {
						if (times[i] < lowestValue){
							indexOfSecondLowest = indexOfLowestValue;
							lowestValue = times[i];
							indexOfLowestValue = i;
							twoValues[0] = indexOfLowestValue;
							twoValues[1] = indexOfSecondLowest;
						}
					}
					return twoValues;
					
				}
		
		
		}
		
		
		

