package Assignment2;


public class Q1CricleTester {
	public static void main(String[] args) {
		Q1Circle A= new Q1Circle(5.6);
		System.out.println(A.getRadius());
		System.out.println(A.getArea());
		System.out.println(A.getCircumference());
		A.setRadius(10.45);
		System.out.println(A.toString());
	}

}
