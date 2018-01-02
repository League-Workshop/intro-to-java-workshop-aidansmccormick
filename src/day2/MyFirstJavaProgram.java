package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		// START HERE
	System.out.println("HELLO WORLD!!!");
		Robot dalek = new Robot();
		
		dalek.penDown();
		dalek.setSpeed(500);
		dalek.hide();
	for (int i = 0; i < 500; i++) {
		
		dalek.move(250);
		dalek.turn(pie);
		dalek.setRandomPenColor();
	}
	}
}
