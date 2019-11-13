package _02_robot_graffiti;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Robotgraffti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot Diane= new Robot();
		Diane.penDown();  
		Diane.setSpeed(100);
		for (int i =0; i <4; i++) { 
		Diane.move(200);
		Diane.turn(90); 
	
		
}
		Diane.turn(90); 
		Diane.move(200); 
		Diane.turn(-90);
		Diane.move(300);
	} 
}
