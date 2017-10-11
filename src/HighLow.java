 import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLow {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(100) +1;
		// 2. Print out the random variable above
		
		// 11. do the following 10 times
		for (int i = 0; i < 10; i++) {
			
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
			String guess = JOptionPane.showInputDialog("Guess Number");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			
			int guessnumber = (Integer.parseInt(guess));
			// 5. if the guess is correct
			if (guessnumber == random) {
				JOptionPane.showMessageDialog(null, "You Guessed The Number");
				System.exit(0);
			}
			else if (guessnumber < random) {
				JOptionPane.showMessageDialog(null, "Too low");
			}
			else if (guessnumber > random) {
				JOptionPane.showMessageDialog(null, "Too high");
				
			}
				// 6. win
			// 7. if the guess is high
				// 8. tell them it's too high
			// 9. if the guess is low
				// 10. tell them it's too low

		// 12. tell them they lose
		}
		JOptionPane.showMessageDialog(null, "You Guessed Too Many Times");
	}

}

