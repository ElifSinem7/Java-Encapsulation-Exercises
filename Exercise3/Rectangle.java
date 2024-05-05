package Exercise3;

public class Rectangle {
	private double length;
	private double width;
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getArea() {
		return length * width;
	}
	public double getPerimeter() {
		return 2 * (length + width);
	}

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		
		rectangle.setLength(15.6);
		rectangle.setWidth(18.9);
		
		System.out.println("***** Rectangle *****");
		System.out.println("Length: " + rectangle.getLength() + "\nWidth: " + rectangle.getWidth() + "\nArea: "  +rectangle.getArea() + "\nPerimeter: "  +rectangle.getPerimeter());

	}

}
