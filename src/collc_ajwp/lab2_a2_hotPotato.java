// Write a Java program to simulate the "Hot Potato" game using a queue.
// In this game, players stand in a circle and pass a potato (or any other object) while music plays.
// When the music stops, the player holding the potato is out.
// ● Create a queue to represent the circle of players. ● Enqueue player names.
// ● Dequeue players one by one and enqueue them again to simulate passing the potato.
// ● Repeat the dequeue and enqueue process, simulating the music stopping and players being eliminated until only one player remains.

package collc_ajwp;

import java.util.LinkedList;
import java.util.Queue;

// Main class
public class lab2_a2_hotPotato {

	public static void main(String[] args) {
		// Create a queue to represent the circle of players
		Queue<String> players = new LinkedList<>();

		// Enqueue player names
		players.add("Sarvesh");
		players.add("Shiv");
		players.add("Yash");
		players.add("Harsh");
		players.add("Shubham");

		// Set the number of iterations before stopping the music
		int iterations = 3;

		// Simulate passing the potato until only one player remains
		while (players.size() > 1) {
			// Pass the potato for the specified number of iterations
			for (int i = 0; i < iterations; i++) {
				// Dequeue player and enqueue again to simulate passing the potato
				String currentPlayer = players.poll();
				players.offer(currentPlayer);
			}

			// Remove the player holding the potato (the one at the front of the queue)
			String eliminatedPlayer = players.poll();
			System.out.println("Player " + eliminatedPlayer + " is eliminated!");
		}

		// Display the winner
		System.out.println("The winner is " + players.poll() + "!");

	}

}