package temp;

import java.util.Scanner;

interface displayInput {
	public void display(String input);
}

public class user_input_lambda_expression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String: ");
		String input = sc.nextLine();

		displayInput di = (s) -> System.out.println("Input from user is: " + s);

		di.display(input);

	}

}
