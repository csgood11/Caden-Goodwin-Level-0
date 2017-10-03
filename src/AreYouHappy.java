import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String Answer = JOptionPane.showInputDialog("Are You Happy?");
		if (Answer.equals("Yes")) {
			System.out.println("Keep Doing Whatever Youre doing");
		} else if (Answer.equals("No")) {
			String Answer2 = JOptionPane.showInputDialog("Do You Want To Be Happy?");
			if (Answer2.equals("No")) {
				System.out.println("Keep Doing Whatever Youre doing");
			} else if (Answer2.equals("Yes")) {
				System.out.println("Change Something");
			} else {
				System.out.println("Say Yes Or No");
			}

		} else {
			System.out.println("Say Yes Or No");

		}
	}
}
