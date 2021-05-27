package htu;

public class Person {

	public int id;
	public String name;
	
	public void print() {
		
		System.out.println("From the parent The id is "+id+" The name is "+ name);
	}
	public void print(String message) {
		
		System.out.println(message);
	}
}
