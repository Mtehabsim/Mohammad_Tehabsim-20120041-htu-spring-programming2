package part2.pro;


public class Procedular {

	public static void main(String[] args) {
		
		int _num1= 5;
		int _num2= 5;
		
		addTwoNum(_num1,_num2);
		subtractTwoNum(_num1,_num2);
		
		_num1= 5;
		_num2= 8;
		
		addTwoNum(_num1,_num2);
		subtractTwoNum(_num1,_num2);
	}
	public static void  addTwoNum (int num1, int num2) {
		int both = num1 + num2;
		System.out.println("The add equal "+ both);
		
	}
	public static void subtractTwoNum (int num1, int num2) {
		int none = num1 - num2;
		System.out.println("The subtract equal "+none);
		
	}

}
