package htu;
//parent class
public class Vehicle {
	// its calling in Demo class
	 String model;
		int year;
		String vin;
	  
		public void showInfo() {
			System.out.println("Model : " + model + " , Year : " + year + ", VIN: " + vin);
		}

		public void start() {
			System.out.println("Starting...");
		}

		public void stop() {
			System.out.println("Stopping the vehcile...");
		}
		
		public void stop(String message) {
			System.out.println("Stopping the vehcile..."+message);
		}


}
