
public class windChill {
	
	public static void main(String[] args) {
		//TODO auto-generated method stub
		//temperature in Fahrenheit, wind speed in miles per hour

		windChillcalc(90, 5);
		System.out.println("I exist!");
		windChillcalc(75, 30.1);
		
	}
	
	public static void windChillcalc(int temp, double velocity) {
		// w = 35.74 + 0.6215 t + (0.4275 t - 35.75) v^0.16
		
		if (velocity>120||velocity<3) {
			System.out.println("Invalid velocity of wind. Sorry");
				}
		else {
			double windchill = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(velocity, 0.16);
			System.out.println("the windchill is "+ windchill + " when the temperature is " + temp + " and velocity is " + velocity+"!");
		
		
		
	}
}
}