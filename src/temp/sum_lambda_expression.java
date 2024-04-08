package temp;

import java.util.Scanner;

interface addition {
	public void add(int num1, int num2);
}

public class sum_lambda_expression {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num1: ");
		int num1 = sc.nextInt();

		System.out.println("Enter num2: ");
		int num2 = sc.nextInt();

		addition a = (x, y) -> System.out.println("Sum of addition is: " + (num1 + num2));
		a.add(num1, num2);

	}

}
