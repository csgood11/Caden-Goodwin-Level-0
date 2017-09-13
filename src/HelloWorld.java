import javax.swing.JOptionPane;

public class HelloWorld {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "hello world");
		String answer = JOptionPane.showInputDialog("whats your name");
		JOptionPane.showMessageDialog(null, "hi " + answer);
		System.out.println("goodbye " + answer);
		if (answer.equals("caden")) {
			JOptionPane.showMessageDialog(null, "Hello Match");
		} else {
			JOptionPane.showMessageDialog(null, "Stranger");

		}
	}
}
