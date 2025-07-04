import java.util.Scanner;

public class Day1_JavaStudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter rollnumber : ");
		int rollnumber = sc.nextInt();
		System.out.println("Enter precentage : ");
		float precentage = sc.nextFloat();
		System.out.println("Enter grade : ");
		char grade = sc.next().charAt(0);
		boolean isPassed = precentage>=40;
		
		System.out.println("---------");
		System.out.println("Name : " + name);
		System.out.println("rollnumner : " + rollnumber);
		System.out.println("Precentage : "+ precentage);
		System.out.println("Grade: "+ grade);
		System.out.println("Passed: "+ isPassed);
	}

}
