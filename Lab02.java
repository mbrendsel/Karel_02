/**
*
* An athlete navigates a maze while leaving a trail of beepers
*
* @author Kent Collins
* @version 11 November, 2014
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab02 {

     public static void main(String[] args) {
          Display.openWorld("maps/maze.map");
          Display.setSize(8, 8);
          Athlete andy = new Athlete();
          andy.putBeeper();
          andy.move();
          andy.putBeeper();
          andy.turnRight();
          andy.move();
          andy.putBeeper();
          andy.turnRight();
          andy.move();
          andy.putBeeper();
          andy.turnLeft();
          andy.move();
          andy.putBeeper();
          andy.turnLeft();
          andy.move();
          andy.putBeeper();
          andy.turnRight();
          andy.move();
          andy.putBeeper();
          andy.move();
          andy.putBeeper();
          andy.turnRight();
          andy.move();
          andy.putBeeper();
          andy.turnLeft();
          andy.move();
          andy.putBeeper();
          andy.turnLeft();
          andy.move();
          andy.putBeeper();
          andy.move();
          andy.putBeeper();
          andy.move();
          andy.putBeeper();
          andy.move();
          andy.putBeeper();
          andy.turnRight();
          andy.move();
          andy.putBeeper();
          andy.move();
     }
}
