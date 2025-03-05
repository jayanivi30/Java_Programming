package Basics;
import java.util.*;
public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email id: ");
		String email=sc.nextLine();
		if(email.contains("@")) {
			String username = email.substring(0,email.indexOf("@"));
			String domain = email.substring(email.indexOf("@")+1);
			System.out.println("Username: "+username);
			System.out.println("Domain: "+domain);
		}
		else {
			System.out.println("Invalid email address. Email must contain @.");
		}
		
		
		
		
		sc.close();

	}

}
