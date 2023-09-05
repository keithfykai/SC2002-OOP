// Write a program that reads a character from the user and then uses a switch statement to achieve what the following if statement does.

import java.util.*;

public class P1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		if(choice.equals("A")||choice.equals("a")) System.out.println("Action movie fan");
		else if(choice.equals("C")||choice.equals("c")) System.out.println("Comedy movie fan");
		else if(choice.equals("D")||choice.equals("d")) System.out.println("Drama movie fan");
		else System.out.println("Invalid choice");
	}
}