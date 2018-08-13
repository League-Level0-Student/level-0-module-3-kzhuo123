import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot m = new Robot("batman");

	public static void main(String[] args) {
		m.setSpeed(100);
for (int i = 0; i < 1000000; i++) {
	

		String g = JOptionPane.showInputDialog("What do you want the robot to draw?");
		if (g.equals("square")) {
			drawSquare();

			m.clear();
		} else if (g.equals("triangle")) {
			drawTriangle();

			m.clear();
		}
}
	}

	public static void drawSquare() {
		m.penDown();
		m.move(100);
		m.turn(90);
		m.move(100);
		m.turn(90);
		m.move(100);
		m.turn(90);
		m.move(100);
		m.turn(90);
		m.penDown();
	}

	public static void drawTriangle() {
		m.penDown();
		for (int i = 0; i < 3; i++) {
			m.move(100);
			m.turn(120);
		}
		m.clear();
	}
}
