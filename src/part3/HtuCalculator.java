package part3;

import java.util.Scanner;

public class HtuCalculator {
	public static void main(String[] args) {
		
		boolean failure = true;
		int materiaNumber = 0;
		System.out.println("How many materials to claculate ? ");
		Scanner s1 = new Scanner(System.in);
		int i =1;
		int totalnumOfHours = 0;
		double addingGrade=0;
		double gradeAsNum = 0;
		int numOfHours = 0;
		materiaNumber = s1.nextInt();
		double finalGrade=0.0;
		
		while(materiaNumber!=0) { // loop for number of materials
			String grade = "F";
			System.out.println("material number "+i+" How many credit hours ?");
			numOfHours = s1.nextInt(); // collect the material credit hours
			System.out.println("for the material number "+i+" What is your grade ?");
			grade = s1.next(); //collect grade as characters
			
			switch(grade) {
				case "P":// if grade is p, store grade as number 2.4
				case "p":
					gradeAsNum = 2.4;
					break;
				case "M":// if grade is m, store grade as number 3.2
				case "m":
					gradeAsNum = 3.2;
					break;
				case "D":// if grade is d, store grade as number 4
				case "d":
					gradeAsNum = 4;
					break;
				case "U":// if grade is p, store grade as number 2.4 and make it as failure
				case "u":
					failure = false;
					gradeAsNum = 1.6;
					break;
				default:
					System.out.println("WRONG GRADE you should input U/P/M/D");
			}
			
			totalnumOfHours += numOfHours; // save all hours 
			addingGrade = gradeAsNum * numOfHours; // multiply credit hours with the grade number value
			finalGrade = finalGrade + addingGrade; //saving all the previous multiply results
			materiaNumber = materiaNumber - 1; // to end the loop
			i++; // materials numbers
		}
		
		if(failure==false) {System.out.println("YOU HAVE FAILED MATERIALS");}//if a grade is u
		System.out.println("Your GPA is "+finalGrade/totalnumOfHours);// print the final value

	}

}
