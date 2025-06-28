import java.util.Arrays;
import java.util.Scanner;

public class BroCode {
	/*
	 * Java is fexible Java developer 70k USD
	 * 
	 * sources code print, .java compile = transform source code to machine code
	 * byte code - is class platform and ends with .class extension - , use to run
	 * all machine JVM - use to translate byte code machine code object code -
	 * 0001001 machine code
	 */

	public static void main(String[] args) {

		String[] cars = { "volvo", "bwm", "skoda", "VW" };
		for (String i : cars) {
			System.out.println(i);
		}
		/*
		 * 
		 * int [] myNum = {30,50,102,02}; System.out.println(myNum.length); for(int j
		 * =0; j<myNum.length; j++) { System.out.println(myNum[j]); }
		 * 
		 * 
		 * String[] cars = {"volvo", "bwm", "skoda", "VW"}; System.out.println(cars[0]);
		 * cars[0] = "Honda"; System.out.println(cars[0]);
		 * System.out.println(cars.length);
		 * 
		 * for (int i =0; i<cars.length;i++) { System.out.println(cars[i]); } // for
		 * each
		 */
		/*
		 * Scanner scanner = new Scanner(System.in); int n = scanner.nextInt(); int i=
		 * 0; int j =0; int max = n; while (true) { int num = scanner.nextInt(); if(num
		 * == 0) { break; }
		 * 
		 * if(num > max) { max=num; }
		 * 
		 * } i++;
		 * 
		 * System.out.println(max); scanner.close(); /*int i =0; int max =
		 * Integer.MIN_VALUE; while (i < n) { int num = scanner.nextInt(); if (num %
		 * 4==0 && num > max) { max=num;
		 * 
		 * 
		 * }
		 * 
		 * i++;
		 * 
		 * 
		 * } System.out.println(max); scanner.close();
		 */

	}
}
