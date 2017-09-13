import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Myfirstjavaapp {
	public static void main(String[] args) {
		Robot robbie = new Robot ();
		robbie.penDown();
		robbie.setPenColor(Color.orange);
		robbie.setSpeed(9);
		for(int i=0; i<5; i++) {
			robbie.move(100);
			robbie.turn(360/5);
		}
	}
}
