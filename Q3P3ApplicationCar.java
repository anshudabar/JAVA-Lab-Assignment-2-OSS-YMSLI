package Assignment2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3P3ApplicationCar {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		int userInput;
		
		while (true) {
			System.out.println("Please choose the type of object you want to create: ");
			System.out.println("1. Vehicle Object");
			System.out.println("2. Car Object");
			System.out.println("3. Convertible Car");
			System.out.println("4. Sports Car");
			System.out.println("5.Exit");
			
			userInput = Integer.parseInt(obj.readLine());

			if (userInput == 1) {
				Q3P3Vehicle vehicle = new Q3P3Vehicle(4,4,23,"Maruti");
				vehicle.display();
			}
			else if (userInput == 2) {
				Q3P3Car car = new Q3P3Car();
				car.display();
			}
			else if (userInput == 3) {
				Q3P3ConvertibleCar convertibleCar = new Q3P3ConvertibleCar();
				convertibleCar.display();
			}
			else if (userInput == 4) {
				Q3P3SportsCar sportsCar = new Q3P3SportsCar();
				sportsCar.display();
			}
			else {
				break;
			}

		}
	}
}

