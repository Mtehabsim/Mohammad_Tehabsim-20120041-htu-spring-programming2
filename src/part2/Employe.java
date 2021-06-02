package part2;

public class Employe extends Human{
	double salary = 250.0;
	
	String companyName = "Microsoft";
	
	public void printYearSalary() {
		System.out.println("Your salary in a year is "+salary*12);
	}
	
}
