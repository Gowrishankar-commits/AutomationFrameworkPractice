import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("Enter a number");
		int b = sc.nextInt();
		add(a,b);
		System.out.println("Enter a number to check prime");
		int p = sc.nextInt();
		boolean ans = isPrime(p);
		System.out.println(ans);
		
	}

	static void add(int x, int y) {
		System.out.println(x+y);
	}
	
	static boolean isPrime(int number) {
		if (number<=1) {
			return false;
		}
		
		int c = 2;
		while(c * c <= number) {
			if(number % c==0 ) {
				return false;
			}
			c++;
			
		}
		if(c*c > number) {
			return true;
			
		}
		return false;
			
		}
		
	}


