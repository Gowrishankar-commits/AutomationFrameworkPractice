import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scs = new Scanner(System.in);
		String name = scs.nextLine();
		String temp = "";
		
		for (int i = name.length()-1;i>=0;i--) {
			char s = name.charAt(i);
			temp = temp+s;
		}
		
		System.out.println(temp);
	}
//http://github.com/Gowrishankar-commits/AutomationFrameworkPractice
}
