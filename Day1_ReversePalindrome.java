import java.util.Scanner;

public class Day1_ReversePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name =sc.nextLine();
		StringBuilder sb = new StringBuilder(name);
		String reverse = (sb.reverse().toString());
		
		if(name.equals(reverse)){
			System.out.println("Pallindrome");
		}
		else {
			System.out.println("Not Pallindrome");
		}
	}

}
