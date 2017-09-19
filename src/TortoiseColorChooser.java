// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {

		Tortoise.show();
		Tortoise.setSpeed(10);
		for (int i = 0; i < 5; i++) {
			
		//3. ask the user what color they would like the tortoise to draw
		String color = JOptionPane.showInputDialog("How Much Red?");
		int colorred = Integer.parseInt(color);
		//4. use an if/else statement to set the pen color that the user requested
		color = JOptionPane.showInputDialog("How Much Green?");
		int colorgreen = Integer.parseInt(color);
		color = JOptionPane.showInputDialog("How Much Blue?");
		int colorblue = Integer.parseInt(color);
		Tortoise.setPenColor(new Color(colorred, colorgreen, colorblue));
	

//5. if the user doesn’t enter anything, choose a random color

//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		Tortoise.setPenWidth(10);
		
	//1. make the tortoise draw a shape (this will take more than one line of code)
		Tortoise.penDown();
		for (int j = 0; j < 3; j++) {
			Tortoise.move(100);
			Tortoise.turn(360/3);
		}

		}

	}
}


