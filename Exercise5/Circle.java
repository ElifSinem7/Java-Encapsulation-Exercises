package Exercise5;

public class Circle {
	private double radius;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}

	public static void main(String[] args) {
		Circle circle = new Circle();
		
		circle.setRadius(6.4);
		
		System.out.println("***** Circle *****");
		System.out.println("Radius: " + circle.getRadius() + "\nArea: " + circle.calculateArea() + "\nPerimeter: " + circle.calculatePerimeter());

	}

}
