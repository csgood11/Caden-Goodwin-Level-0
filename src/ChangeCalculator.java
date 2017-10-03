// Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String N = JOptionPane.showInputDialog("How many nickels");
			int Nickels = Integer.parseInt(N);
			System.out.println(Nickels);
		

		// Convert their answer to an int using Integer.parseInt()

		// Ask the user how many dimes they have, and convert their answer
			N = JOptionPane.showInputDialog("How many dimes");
			int Dimes = Integer.parseInt(N);
			System.out.println(Dimes);
		// Ask the user how many quarters they have, and convert their answer
			N = JOptionPane.showInputDialog("How many quarters");
			int Quarters = Integer.parseInt(N);
			System.out.println(Quarters);
		// Calculate how much money the user has and save it in a double variable 
			double money = (double)((Nickels * 5) + (Quarters * 25) + (Dimes * 10)) /100;
			JOptionPane.showMessageDialog(null, "$" + money);
		// Tell the user how much money they have

	}
}

