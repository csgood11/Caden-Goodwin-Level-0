// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
		public static void main(String[] args) {
			for (int i = 0; i < 10; i++) {
				

			// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
			int random = new Random().nextInt(4);
			System.out.println(random);
			// 3. Print out this variable

			// 4. Get the user to enter a question for the 8 ball
			JOptionPane.showInputDialog("Ask a question");
			// 5. If the random number is 0
			if (random==0) {
				JOptionPane.showMessageDialog(null, "yes");
			}
			// -- tell the user "Yes"

			// 6. If the random number is 1
			if (random== 1) {
				JOptionPane.showMessageDialog(null, "no");
			}
			// -- tell the user "No"

			// 7. If the random number is 2
			if (random==2) {
				JOptionPane.showMessageDialog(null, "maybe");
			}
			// -- tell the user "Maybe you should ask Google?"

			// 8. If the random number is 3
			if (random==3) {
				JOptionPane.showMessageDialog(null, "Absoulutely");
			}
			// -- write your own answer
	
			
	
		
		
			}
		
		
		
		
		
		}


}


