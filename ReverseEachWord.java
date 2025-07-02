import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String results = " ";
		String[] sp =  str.split(" ");
		for(String s : sp) {
			StringBuilder sb = new StringBuilder(s);
			String reverse = sb.reverse().toString();
			results += reverse + " ";
		}
		System.out.println(results.trim());

	}

}
