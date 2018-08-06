//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot m = new Robot("batman");
		// 3. Ask the user what color they would like the robot to draw

		// 5. Use an if/else statement to set the pen color that the user requested
		m.setPenWidth(10);
		m.setSpeed(500);

		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them
		for (int i = 0; i < 10000000; i++) {
			String answer = JOptionPane.showInputDialog("What color do you want?");
			if (answer == "red") {
				m.setPenColor(250, 0, 0);
			} else {
				m.setRandomPenColor();
			}
			m.penDown();
			m.move(100);
			m.turn(90);
			m.move(100);
			m.turn(90);
			m.move(100);
			m.turn(90);
			m.move(100);
			m.turn(90);
		}
		// 4. Set the pen width to 10

		// 2. Make the robot draw a shape (this will take more than one line of code)

	}
}
