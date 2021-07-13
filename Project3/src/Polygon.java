//overriding demo
public class Polygon {
	double area;
	
	public void calArea(double length, double breadth) {
		area = (length + breadth * 0.6) * length * breadth;
	}
	
	public void displayArea() {
		System.out.println("Area is: " + area);
	}
}
