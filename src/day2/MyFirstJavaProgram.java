package day2;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		// START HERE
	Random Var = new Random();	
	System.out.println("HELLO WORLD!!!");
		Robot dalek = new Robot();
		
		dalek.penDown();
		dalek.setSpeed(500);
		dalek.hide();
		dalek.setPenWidth(10);
	for (int x = 0; x < 500; x++) {
		
		dalek.turn(Var.nextInt(100));
		for (int i = 0; i < 5; i++) {
		dalek.move(Var.nextInt(300)+200);
		dalek.setX(Var.nextInt(800));
		dalek.setY(Var.nextInt(800));
		(dalek).setRandomPenColor();
	}
	}
	}
}
