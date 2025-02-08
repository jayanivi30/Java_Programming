import java.util.Scanner;
public class inputprogrammes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		System.out.print("Enter your age :");
		int age = scanner.nextInt();
		System.out.print("Are you a student ? (true/false) : ");
		boolean isStudent = scanner.nextBoolean();
		if(isStudent) {
			System.out.print("What is your gpa? ");
			double gpa = scanner.nextDouble();
			System.out.print("Hello " + name +". You are " + age + " years old. You're a student with " + gpa+ " gpa!");
			
		}
		else {
			System.out.print("Hello " + name +". You are " + age + " years old. You're not a student.");
		}

}
}
