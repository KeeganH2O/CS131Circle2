
public class CircleClass {
	private double radius, area;
	
	public CircleClass() {
		radius = 1;
	}
	
	public void setRadius(double radius){
		this.radius = radius; // this references the class variable radius
	
	}
	public double calculateArea(double radius) {
		area = Math.pow(radius, 2)*Math.PI;
		return area;
	}
}
