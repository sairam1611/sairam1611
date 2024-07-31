package Student;

public class Evenodd{
		// Method to check even or odd number
	    public static String checkOddEven(int number) {
	        if (number % 2 == 0) {
	            return number + " is even number";
	        } else {
	            return number + " is odd number";
	        }
	    }

	     public static void main(String[] args)  {
	        int num1 = 7;
	        int num2= 10;	      
	        // Call the method and print the result
	        System.out.println(checkOddEven(num1));
	        System.out.println(checkOddEven(num2));
	    }
	}



