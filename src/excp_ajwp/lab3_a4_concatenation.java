//Create a program that reads a list of strings and concatenates them into a single string using the Stream API.
//Avoid using lambda expressions for concatenation

package excp_ajwp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lab3_a4_concatenation {

	public static void main(String[] args) {
		// list of strings
		List<String> stringList = Arrays.asList("Greetings ", "Sir/Madam, ", "Have a nice", " day.");

		// list of strings being concatenated
		System.out.println("Concatenated string: " + stringList.stream().collect(Collectors.joining()));

	}

}