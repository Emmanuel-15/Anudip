package practise;

import java.util.Scanner;

public class ichat_java_practise_rev_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String rev_string = "";

		// take input from user
		System.out.println("Enter a string: ");
		String user_input = sc.nextLine();

		for (int i = user_input.length(); i > 0; i--)
			rev_string += user_input.charAt(i - 1);

		System.out.println("rev: " + rev_string);

	}

}