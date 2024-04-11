// Write a Java program that demonstrates the following operations on a HashSet:
// ● Create a HashSet of integers. ● Add the numbers 5, 10, 15, 20, and 25 to the set.
// ● Display the elements of the set. ● Check if the set contains the number 10.
// ● Remove the number 15 from the set. ● Display the size of the set. 

package collc_ajwp;

import java.util.HashSet;

// Main class
public class lab2_a1_hashSet {

	public static void main(String[] args) {
		// Create a HashSet of integers
		HashSet<Integer> numbersSet = new HashSet<>();

		// Add the numbers 5, 10, 15, 20, and 25 to the set
		numbersSet.add(5);
		numbersSet.add(10);
		numbersSet.add(15);
		numbersSet.add(20);
		numbersSet.add(25);

		// Display the elements of the set
		System.out.println("Elements of the set: " + numbersSet);

		// Check if the set contains the number 10
		if (numbersSet.contains(10))
			System.out.println("The set contains the number 10");
		else
			System.out.println("The set does not contain the number 10");

		// Remove the number 15 from the set
		numbersSet.remove(15);

		// Display the size of the set
		System.out.println("Size of the set after removing 15: " + numbersSet.size());

	}

}