package Basics;
import java.util.*;
public class printf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		double r = sc.nextDouble();
		double area = Math.PI*Math.pow(r, 2);
		System.out.printf("The area of the circle is %.1fcm2.\n",area);
		sc.close();

	}

}
