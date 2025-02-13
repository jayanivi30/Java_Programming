package Basics;
import java.util.*;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double x,y;
		System.out.print("Enter two numbers: \n");
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		System.out.println("Sum: " + (x+y));
		System.out.println("Difference: "+ (x-y));
		System.out.println("Product: "+(x*y));
		System.out.println("Division: "+(x/y));
		System.out.println("Mod: "+(x%y));
		
		scanner.close();

	}

}
