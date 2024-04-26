package practise;

interface MathOperation {
	int operate(int a, int b);
}

public class lambda_expression {
	public static void main(String[] args) {
		// Lambda expression to add two integers
		MathOperation addition = (int a, int b) -> a + b;

		// Using the lambda expression
		System.out.println("Addition: " + addition.operate(10, 5)); // Output: Addition: 15
	}
}