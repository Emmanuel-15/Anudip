package practise;

import java.util.Scanner;

public class factorial_using_recursion {

	public static int fact(int num) {
		if (num == 0)
			return 1;
		else
			return num * (fact(num - 1));

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch = 0;

		while (true) {
			System.out.println("\n***Menu***");
			System.out.println("1. Calculate Factorial");
			System.out.println("2. Exit");

			System.out.println("\nEnter your choice: ");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				// take non negative input from user
				System.out.println("Enter a non negative");
				int num = sc.nextInt();

				if (num < 0)
					System.out.println("Please enter a non negative integer.");
				else {
					System.out.println("Factorial of " + num + "is: " + fact(num));
				}

				break;
			case 2:
				System.out.println("Thankyou");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid input.");
				break;
			}

		}

	}

}
