/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    Color Spiral
 *    Duration=.25
 *    Platform=Eclipse
 *    Type=Recipe
 *    Objectives=for loop																	
 *    
 *    
 ******************************************************************************/

/**
 Needs updated solution
 Used in workshop		
*/		

import org.jointheleague.graphical.robot.Robot;


public class ColorSpiral {


    public static void main(String[] args) {
        // 1. Create a new Robot
    	Robot robbie = new Robot();
        robbie.sparkle();
        robbie.hide();
        // 5. Set your robot's pen to the down position
    	robbie.penDown();


        // 3. Set the robot to go at max speed (10)
    	robbie.setSpeed(10);


        // 4. Repeat the code below 75 times (you’ll need to move the mustache!)
    		for(int i=0; i<75; i++) {


            // 7. Change the pen color to random
    		robbie.setRandomPenColor();
    
            // 6. Move the robot 5 times the current line number you are drawing (5*i)
    robbie.move(3*i);
            // 2. Turn the robot 1/3 of 360 degrees to the right
    	robbie.turn(360/7);
    
            // 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
    
            // 9. Set the pen width to i
    	robbie.setPenWidth(2*i);
    		}

    }
}

													
