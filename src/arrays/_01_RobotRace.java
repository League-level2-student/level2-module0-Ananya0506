package arrays;

import java.awt.Window;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	

	//2. create an array of 5 robots.
Robot[] robs = new Robot[2];
Random ran = new Random();
boolean winner = false;
//3. use a for loop to initialize the robots.
for(int i = 0; i<2; i++) {
robs[i] = new Robot();
robs[0].setX(50);	
robs[i].setX(i*100);
	 robs[i].setY(500);
}
		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
int angle  = 0;
while(winner == false) { 
	for(int a = 0; a<2; a++) {
	angle+=3;
		robs[a].setSpeed(10);
	robs[a].move(ran.nextInt(100));
robs[0].setAngle(angle);
robs[1].setAngle(angle);
	if(robs[a].getY()<20) {
		winner = true;
		System.out.println("Robot " + (a+1) + " won" );
		break;

	}

}

}


//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.
//done
	//9. make the robots race around a circular track.
//done
}
}