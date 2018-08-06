import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot m = new Robot("batman");

	public static void main(String[] args) {
		m.setSpeed(1000);

		String g = JOptionPane.showInputDialog("What do you want the robot to draw?");
		if (g == "square") {
			drawSquare();

			m.clear();
		} else if (g == "triangle") {
			drawTriangle();

			m.clear();
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
		m.move(100);
		m.turn(60);
		m.move(100);
		m.turn(60);
		m.move(100);
		m.turn(60);
	}
}
