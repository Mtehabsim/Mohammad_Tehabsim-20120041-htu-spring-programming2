package htu;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.name = "AHMAD";
		p1.id = 12;
		p1.print();
		p1.print("Hello World!");
		Student p2 = new Student();
		p2.name = "SARAH";
		p2.id = 2;
		p2.print();
		p2.gba = 90;
		p2.printGba();
		
		Employee p3 = new Employee();
		p3.name = "RAMI";
		p3.id = 25;
		p3.print();
		p3.salary = 250;
		p3.printSalary();
		
		Vehicle p4 = new Vehicle();
		Car p5 = new Car();
		
		p4.vin = "Mustang";
		p4.model ="15M";
		p4.year = 1967;
		p4.showInfo();
		p4.start();
		p4.stop();
		p4.stop("Stopping");
		
		p5.vin = "BMW";
		p5.model ="X5";
		p5.year = 2020;
		p5.showInfo();
		p5.start();
		p5.stop();
		p5.stop("Stopping");
		
	}

}
