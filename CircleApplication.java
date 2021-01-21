import java.util.Scanner;
public class CircleApplication {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		CircleClass myCircle = new CircleClass();
		double radius,area;
		
		System.out.println("what is the radius?");
		radius = input.nextDouble();
		
		area = myCircle.calculateArea(radius);
		System.out.println("The area is: "+area);
	}
}
