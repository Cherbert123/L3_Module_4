package threads;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	public static void main(String[] args) {
		Robot one = new Robot(400, 450,"vic");
		Robot two = new Robot(800, 450,"vic");
		Robot three = new Robot(1200, 450,"vic");
		Robot four = new Robot(600, 700, "vic");
		Robot five = new Robot(1000, 700, "vic");
		
		one.setSpeed(15);
		two.setSpeed(15);
		three.setSpeed(15);
		four.setSpeed(15);
		five.setSpeed(15);
		
		one.move(200);
		two.move(200);
		three.move(200);
		four.move(200);
		five.move(200);
		
	
		
		new Thread(()->{
			for(int i = 0; i < 360;i++) {
			one.turn(1);
			one.move(5);
			one.penDown();
			}
		}).start();
		new Thread(()->{
			for(int i = 0; i < 360;i++) {
			two.turn(1);
			two.move(5);
			two.penDown();
			}
		}).start();
		new Thread(()->{
			for(int i = 0; i < 360;i++) {
			three.turn(1);
			three.move(5);
			three.penDown();
			}
		}).start();
		new Thread(()->{
			for(int i = 0; i < 360;i++) {
			four.turn(1);
			four.move(5);
			four.penDown();
			}
		}).start();
		new Thread(()->{
			for(int i = 0; i < 360;i++) {
			five.turn(1);
			five.move(5);
			five.penDown();
			}
		}).start();
		
	}
}

