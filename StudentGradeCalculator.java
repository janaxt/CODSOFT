package codsoft;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		System.out.print("Enter the number of subjects taken: ");
		int subjects= s.nextInt();
		
		double grades[]= new double[subjects];
		
		int sum=0;
		
		for (int i=0; i<subjects; i++) {
			System.out.println("------------------------");
			System.out.print("grade for subject "+(i+1)+" out of 100: ");
			grades[i]= s.nextDouble();
			sum+=grades[i];
		}
		
		System.out.println();
		System.out.println("The student's total grade is: "+ sum);
		System.out.println("The average percentage is: "+ (sum/subjects) +"%");
		System.out.println("------------------------");
		
		for (int i=0; i<subjects;i++) {
			if (grades[i]<=100 && grades[i]>=90) {
				System.out.println("The student got an A in subject "+(i+1));
			} else if (grades[i]<90 && grades[i]>=80) {
				System.out.println("The student got a B in subject "+(i+1));
			} else if (grades[i]<=79 && grades[i]>=70) {
				System.out.println("The student got a C in subject "+(i+1));
			} else if (grades[i]>=65 && grades[i]<=69) {
				System.out.println("The student got a D in subject "+(i+1));
			} else {
				System.out.println("The student got an F in subject "+(i+1));
			}
		}
		

	}

}
