package Basics;
import java.util.*;
public class random {
	public static void main(String args[]) {
		Random random = new Random();
		boolean isHead;
		isHead = random.nextBoolean();
		if(isHead) {
			System.out.print("Heads");
		}
		else {
			System.out.print("Tails");
		}
	}

}
