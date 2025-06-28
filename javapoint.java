import java.util.Scanner;

public class javapoint {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        String car = scanner.next();
        
        switch(car) {
        case "bmw":
        	System.out.println("is diving beast");
        	break;
    case "audi":
    	System.out.println("is diving beauty");
    	break;
case "skoda":
	System.out.println("is diving motacorola");
	break;
case "MG":
	System.out.println("is diving chiness");
	break;
	default :
		System.out.println("Default it fails");
}
        
        
        
        
        
        /*
        int maxTemperature = 0; // Initialize maximum temperature observed
        	//print maximum calcisou 
        // while 
        // Add your while loop or do-while loop here to process input temperatures
        while (scanner.hasNextInt()) {
            int currentTemperature = scanner.nextInt();

            if (currentTemperature >= 100) {
                break;
            }

            if (currentTemperature > maxTemperature) {
                maxTemperature = currentTemperature;
            }
        }
*/
    	//System.out.println(maxTemperature);
    	/*//input[@autocomplete="email"]
    	 * $input[@autocomplete="email"]
    	 * <input id="email" autocapitalize="none" autocomplete="email" aria-describedby="my-error-id" class="XSXtW x97ZL" data-testid="email-input" value="gowrishankar@gmail" placeholder="you@email.com">
    	//FIzz 5 , 3 buzz , both na FixxBuzz
    	String str = "Jav";
    	str = (str + str.charAt(1)).toLowerCase();
    	System.out.print(str);
    	
            // start coding here
    	*/
    	// Close 
    	// Quite if ur script multiple windowns us 
        
    	/*
    	
    	//res = (n1 > n2) ? (n1 + n2) : (n1 - n2);
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        System.out.println((city.endsWith("burg")?"True":"False"));
        	
        
        */
        
        /*
    	if (input%5==0) {
    		System.out.println("Fizz");
    	}else if(input%3==0) {
    		System.out.println("Buzz");
    		
    	}else if((input%3==0)&&(input%5==0)) {
    		System.out.println("Buzz");
    	}
    	*/
    }

	private static void While(boolean hasNextInt) {
		// TODO Auto-generated method stub
		
	}
    }
    	
    	
    	/*
    	int fact = 1;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();  //6
        int b = scanner.nextInt();  //14
        for(;a<b;a++) {   // true, 6++
        	fact = fact*a;  // 1 = *7 = 6
        }
        System.out.println(fact);
    }
    }
    	
    	 * public static void main(String args[]){  
  int i,fact=1;  
  int number=5;//It is the number to calculate factorial    
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
    	 * 
    	 * 
    	 * 
    	 
    	int res = 1;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();  //6
        int b = scanner.nextInt();  //14
        if (a < b) {    //true
            for(; a<b; a++){ //true
                res *= b;  // 6*14
            }
    	
        }
        System.out.println(a);
        
    }
    	/*
        Scanner scanner = new Scanner(System.in);
       // Scanner scanner = new Scanner(System.in);
        int a =  scanner.nextInt();
        int b =  scanner.nextInt();
        int c =  scanner.nextInt();
        if (a+b ==20 ||  b+c ==20 || a+c ==20) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        //
    */
    
	
    


      //  System.out.println(++a);
        /*
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        b= b * -1;
        c= c +b;
        a = c/a;
       double x = a;
        System.out.println(a);
        
        // put your code here
		
		/*
		/*
    Scanner scanner = new Scanner(System.in);
    Double  a = scanner.nextDouble();
    Double b = scanner.nextDouble();
    Double p = ( 9.8 * a * b );
    System.out.println(p);
   
        // Call the methods here and print the result.
    
    	/*
    	int a = 4;  //4
    	int b = a++;  // 4
    	//System.out.println(a);
    	int c = --a + b++;  // 4 + 4 =  8
    	System.out.println(c);
    	int result = ++a - (c++ - b) + c;  // (5 - (9 -5) +9)
    	System.out.println(a+" "+""+b+" "+c);
    	System.out.println(result);
    	System.out.println((6 - x +9));
    	
    	
    	/*
       // Scanner inputScanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        num1 -=1;
        num2 -=1;
        num3 -=1;
        num4 -=1;
        System.out.println(num1+" "+num2+" "+num3+" "+num4);
        // put your code here
    	
 
    
        Scanner scan = new Scanner(System.in);

        // Read the first integer
        int num1 = scan.nextInt();

        // Read the second integer
        int num2 = scan.nextInt();

        // TODO: Perform addition, multiplication, and division operations
        System.out.println(num1 + num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
    	
    	
        Scanner scanner = new Scanner(System.in);

        // Read the distance traveled in kilometers
        double distance = scanner.nextDouble();

        // Read the time taken in hours
        double time = scanner.nextDouble();

        // TODO: Calculate the average speed in kilometers per hour
        double averageSpeed = (distance/time);

        // Print the average speed rounded to 2 decimal places
        System.out.printf("%.2f", averageSpeed);
    	
        try (Scanner in = new Scanner(System.in)) {
			// Read the next integer
			int n = in.nextInt(); 
			System.out.println(n * n);
			System.out.println(n * n * n);
			System.out.println(n * n * n * n);
		}
        int t = 25;
        int h = 60;
        int w = 6;
        System.out.println("airTemperature = "+t);
        System.out.println("airHumidity = "+h);
        System.out.println("windSpeed = "+w);
    	/*
    	/*
    	String name = "jphn";
    	String second = "current";
    	System.out.println(name+" "+second);
        */
    	
    	/*Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number >= 1){
            System.out.println("positive");
        }
        else if(number<0){
            System.out.println("negative");
        }
        else if(number==0){
            System.out.println("zero");
        }
        else {
            System.out.println("non-integer");
        }
        // Place your code here
        sc.close();
    	*/
    	/*
    	double a = 8;
    	double b = 5;
    	double c = a/b +1.1;
    	System.out.println(c);
    	/*
    	
    	/*
        Scanner scanner = new Scanner(System.in);
        double miles = scanner.nextDouble();
        double hrs = scanner.nextDouble();
        System.out.println(miles/hrs);
    	*?
    	//float double double int long
    	
    	
    	/*
		Scanner scanner = new Scanner(System.in);

		// Read float value from user and assign it to floatVariable
		float floatVariable = scanner.nextFloat();
		float div = floatVariable/2;
		int result = (int)div;
		System.out.println(result);
		/*
    	
    	/*
    	Scanner scanner = new Scanner(System.in);
    	double val = scanner.nextDouble();
    	int newVal = (int)val;
    	System.out.println(newVal);
    	/*
    	/*
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        String word3 = sc.next();
        System.out.println(word3);
        System.out.println(word2);
        System.out.println(word1);
        sc.close();
    	*/
    	
    	/*
        // Initialize the Scanner object to receive user input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age =sc.nextInt();
        System.out.println("Hello, I am "+ name +"! I am "+age+" years old.");
        // Write your code for receiving user's name and age here.

        // Print the message using the user's name and age.
        //Hello, I am John! I am 22 years old.
        
        
        sc.close();
        
    	*/
    	
    	/*
        Scanner sc = new Scanner(System.in);
        // start coding here
        String word1 = sc.next();
        String word2 = sc.next();
        String word3 = sc.next();
        String word4 = sc.next();
        String word5 = sc.next();
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        System.out.println(word4);
        System.out.println(word5);
        sc.close();
        */
    	/*
        Scanner scanner = new Scanner(System.in);
        // Read length and width
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        // Calculate area
        double result = length * width;
        // Print result rounded to two decimal places
        System.out.println(String.format("%.2f",result));	
        scanner.close();
		/*
	/*
	 * Your task is to write a complete Java program that takes in a single line with an integer between 0-100 (inclusive) as input. This integer represents a person's age. The program should then print a message that tells the person which life stage they are in based on the following conditions:

If the person's age is less than 12 (inclusive), print 'Child'.
f
If the age is between 13 and 17 (both inclusive), print 'Teenager'.

If the age is between 18 and 59 (both inclusive), print 'Adult'.

Lastly, if the person's age is 60 (inclusive) or above, print 'Senior Citizen'.


		
		try (Scanner sc = new Scanner(System.in)) {
			int age = sc.nextInt();
			if (age<0  || age>=100) {
			}
			else if(age<=12) {
			System.out.print("Child");
			}
			
			else if(age==13 || age<=17) {
			System.out.print("Teenager");
				
			}
			else if(age==18 || age<=59) {
			System.out.print("Adult");
				
			}
			else if(age>=60) {
			System.out.print("Senior Citizen");
				
			}
		}
		
		*/

	 /**
	  * Data types and their sizes
	  * primitive types they have for integert
	  * integer are represted by ;omg, int, 
	  *    
	  */
		

	

