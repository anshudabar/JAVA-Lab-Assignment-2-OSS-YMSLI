package Assignment2;

public class Q1Circle {
	private double radius;
	private String color;
	public Q1Circle() {
		
	}
	public Q1Circle(double radius) {
		this.radius=radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius=radius;
	}

	public void setColor(String color) {
		this.color=color;
	}	
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getCircumference() {
		return 2*Math.PI*radius;
	}
	
	public String toString() {
		return "Circle[radius=" + radius + "]";
	}
}
