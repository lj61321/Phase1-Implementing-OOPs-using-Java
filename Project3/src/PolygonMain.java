/* example of runtime polymorphism */

public class PolygonMain {

	public static void main(String[] args) {
		Polygon polygon; //reference of class Polygon
		polygon = new Polygon(); //object is created
		polygon.calArea(10.5, 11.2);
		polygon.displayArea();
		
		polygon = new Rectangle();//referred to as upcasting
		polygon.calArea(10.5, 11.2);//since rectangle is a child
		polygon.displayArea();//of polygon
		
		polygon = new Triangle();//same as above - up casting
		polygon.calArea(10.5, 11.2);
		polygon.displayArea();
		
	}
}
