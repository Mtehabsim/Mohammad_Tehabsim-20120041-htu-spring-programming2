package part2;

public class Employe extends Human{
	private double salary = 250.0;
	
	String companyName = "Microsoft";
	
	public void printName() {
		System.out.println("My name is "+name+" overridding was done");
	}
	
	public void printYearSalary() {
		System.out.println("Your salary in a year is "+salary*12);
	}
	public void setSalary(int newSalary) {
		salary = newSalary;
	}
	public void getSalary() {
		System.out.println("Your salary is "+salary);
	}
	
}
