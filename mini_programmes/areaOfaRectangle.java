import java.util.*;
public class areaOfaRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height = 0;
		double width = 0;
		double area = 0;
		System.out.print("Enter height: ");
		Scanner scanner = new Scanner(System.in);
		height = scanner.nextDouble();
		System.out.print("Enter width: ");
		width = scanner.nextDouble();
		area = height * width;
		System.out.print("The area of the rectangle is "+area+" cm2.");

	}

}
