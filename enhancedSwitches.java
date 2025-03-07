package Basics;
import java.util.*;
public class enhancedSwitches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the day: ");
		String day = sc.nextLine();
		switch(day.toUpperCase()) {
		case "MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY" -> System.out.println("It is a Weekday!");
		case "SATURDAY","SUNDAY" -> System.out.println("It is Weekend!!");
		default -> System.out.println(day+" is not a day.");
		}
	
		sc.close();
		

	}

}
