package threads;

import org.jointheleague.graphical.robot.Robot;

public class Robots {
	public static void main(String[] args) {
		for(int i = 0; i < 1000; i++) {
		Robot temp = new Robot(400, 450,"vic");
		temp.setSpeed(50);
		temp.move(i * 5);
		temp.turn(i * 5);
		}
	}
}
