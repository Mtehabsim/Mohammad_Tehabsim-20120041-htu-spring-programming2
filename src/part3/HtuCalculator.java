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
		
		while(materiaNumber!=0) {
			
			String grade = "F";
			
			System.out.println("material number "+i+" How many credit hours ?");
			numOfHours = s1.nextInt();
			
			System.out.println("for the material number "+i+" What is your grade ?");
			grade = s1.next();
			
			
			
			switch(grade) {
				case "P":
				case "p":
					gradeAsNum = 2.4;
					break;
				case "M":
				case "m":
					gradeAsNum = 3.2;
					break;
				case "D":
				case "d":
					gradeAsNum = 4;
					break;
				case "U":
				case "u":
					failure = false;
					gradeAsNum = 1.6;
					break;
				default:
					System.out.println("WRONG GRADE you should input U/P/M/D");
			}
			
			totalnumOfHours += numOfHours; 
			addingGrade = gradeAsNum * numOfHours;
			finalGrade = finalGrade + addingGrade;
			
			materiaNumber = materiaNumber - 1;
			i++;
		}
		
		if(failure==false) {System.out.println("YOU HAVE FAILED MATERIALS");}
		System.out.println("Your GPA is "+finalGrade/totalnumOfHours);

	}

}
