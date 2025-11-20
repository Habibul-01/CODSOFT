package programs;

import java.util.*;

public class grade_cal {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Wellcome to grade calculator..");
		System.out.println();
		System.out.println("Enter number of subjects: ");
		int nos = ob.nextInt();//nos:--number of subjects
		double sum=0.0;
		for (int i = 1; i <= nos; i++) {
			System.out.println("Enter subject-"+i+" number:");
			double subject=ob.nextDouble();
			sum+=subject;
		} 
		double result=sum/nos;
		if(result>=90.0 && result<=100.0) {
			System.out.println("Total Marks: "+sum+"\nPercentage: "+result+"\nGrade:AA");
		}else if(result>=70.0 && result<90.0) {
			System.out.println("Total Marks: "+sum+"\nPercentage: "+result+"\nGrade:A+");
		}else if(result>=60.0 && result<70.0) {
			System.out.println("Total Marks: "+sum+"\nPercentage: "+result+"\nGrade:B+");
		}else if(result>=50.0 && result<60.0) {
			System.out.println("Total Marks: "+sum+"\nPercentage: "+result+"\nGrade:B");
		}else if(result>=40.0 && result<50.0) {
			System.out.println("Total Marks: "+sum+"\nPercentage: "+result+"\nGrade:C");
		}else{
			System.out.println("Total Marks: "+sum+"\nPercentage: "+result+"\nGrade:D");
		}
		ob.close();
	}

}
