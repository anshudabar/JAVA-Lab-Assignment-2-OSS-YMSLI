package Assignment2;

public class Q3P3ConvertibleCar extends Q3P3Car {
	boolean isHoodOpen;
	
	public void display() {
		super.display();
		if(isHoodOpen) {
			System.out.println("Hood is Open");
		}else {
			System.out.println("Hood is Closed");
		}
	
	}
}
