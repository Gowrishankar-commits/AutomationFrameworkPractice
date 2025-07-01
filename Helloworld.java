import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String revers ="";
		
		for (int i = name.length()-1; i>=0; i--) {
			revers +=name.charAt(i);
		}
		System.out.println(revers);
	}
				
}
