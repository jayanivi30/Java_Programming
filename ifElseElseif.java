package Basics;
import java.util.*;
public class ifElseElseif {
	public static void main(String args[]) {
		int age;
		System.out.println("Enter your age: ");
		Scanner sc = new Scanner(System .in);
		age=sc.nextInt();
		if(age > 65) {
			System.out.println("You are a senior!");
		}
		else if(age>=18) {
			System.out.println("You are an adult!");
		}
		else if(age<18 && age>0) {
			System.out.println("You are a child!");
		}
		else {
			System.out.println("Invalid age");
		}
		
		
		sc.close();
		
	}	
}
