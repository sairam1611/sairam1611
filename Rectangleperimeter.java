package Student;

import java.util.Scanner;

public class Rectangleperimeter {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        //  length of the rectangle
		        System.out.print("Enter the length of the rectangle: ");
		        double length = scanner.nextDouble();

		        //  width of the rectangle
		        System.out.print("Enter the width of the rectangle: ");
		        double width = scanner.nextDouble();

		        // Calculate area
		        double area = length * width;

		        // Calculate perimeter
		        double perimeter = 2 * (length + width);

		        // Display the area and perimeter
		        System.out.println("Area of the rectangle: " + area);
		        System.out.println("Perimeter of the rectangle: " + perimeter);
		        scanner.close();

	}
}
	


