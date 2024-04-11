// Write a program to reverse a given List of strings

package collc_ajwp;

// importing classes
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// main class
public class lab1_a3_rev_list_of_strings {

	public static void main(String[] args) {
		// created a list of
		List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");

		// reversing the list using .reverse() function
		Collections.reverse(strings);

		// displaying output
		System.out.println("Reversed list: " + strings);

	}

}