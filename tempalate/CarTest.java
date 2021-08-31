package tempalate;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("===자율 주행하는 자동차===");
		Car mycar = new AICar();
		mycar.run();
		
		System.out.println("===자율 주행하는 자동차===");
		Car hiscar = new ManualCar();
		hiscar.run();
	}
	}


