import java.util.Scanner;

public class StrBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		StringBuffer sb = new StringBuffer(name);
		System.out.println(sb.reverse());

	}

}
