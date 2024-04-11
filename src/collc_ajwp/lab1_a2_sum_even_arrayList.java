// Write a Java program that calculates the sum of all even numbers present in an ArrayList of integers

package collc_ajwp;

import java.util.ArrayList;
import java.util.List;

// main class
public class lab1_a2_sum_even_arrayList {

	public static void main(String[] args) {
		// creating ArrayList of integers and initializing it with specified numbers
		ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		// calculating sum of even numbers
		int sum = 0;
		for (int num : numbers) {
			if (num % 2 == 0)
				sum += num;
		}

		// displaying the sum of even numbers
		System.out.println("Sum of even numbers: " + sum);
	}
}