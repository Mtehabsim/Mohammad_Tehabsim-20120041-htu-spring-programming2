package part2;

public class Demos {

	public static void main(String[] args) {

		Human h1 = new Human();
		Employe e1 = new Employe();
		
		h1.name = "Ahmed";
		e1.name = "Mohammad";
		
		h1.yearOfBirth = 2005;
		e1.yearOfBirth = 1990;
		
		e1.companyName = "Amazon";
		e1.setSalary(500);
		e1.getSalary();
		h1.printName();
		e1.printName();
		
		e1.printYearSalary();
		
		
		
		
	}

}
