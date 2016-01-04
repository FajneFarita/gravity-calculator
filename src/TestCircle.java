
public class TestCircle {

	public static void main(String[] args){
		Circle c1 = new Circle();
		System.out.println("the circle has radius " + c1.getRadius() + " and area of " + c1.getArea());

		Circle st = new Circle(5.0);
		System.out.println(st.toString());
		System.out.println(st);
		System.out.println("Operator '+' invokes toString too: " + st);
		
		Circle c2 = new Circle(2.0);
		System.out.println("the circle has radius " + c2.getRadius() + " and area of " + c2.getArea());
		
		Circle c3 = new Circle();
		c3.setRadius(5.0);
		c3.setColor("green");
		System.out.println("the circle has radius " + c3.getRadius() + " and color " + c3.getColor());
	
		
	}
}
