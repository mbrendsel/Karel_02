/**
*
* An athlete navigates a maze while leaving a trail of beepers
*
* @author Monica  
* @version 11/21/14
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

 public class Lab02 extends Robot 
{
public static void main(String[] args) {

Display.openWorld("maps/maze.map");
Display.setSize(8, 8);

Athlete karel = new Athlete();
 
   karel.putBeeper();
   karel.move();
   karel.putBeeper();
   karel.turnRight();
   karel.move();
   karel.putBeeper();
   karel.turnRight();
   karel.move();
   karel.putBeeper();
   karel.turnLeft();
   karel.move();
   karel.putBeeper();
   karel.move();
   karel.turnLeft();
   karel.putBeeper();
   karel.turnRight();
   karel.move();
   karel.putBeeper();
   karel.move();
   karel.putBeeper();
   karel.turnRight();
   karel.move();
   karel.putBeeper();
   karel.turnLeft();
   karel.move();
   karel.putBeeper();
   karel.turnLeft();
   karel.move();
   karel.putBeeper();
   karel.move();
   karel.putBeeper();
   karel.move();
   karel.putBeeper();
   karel.move();
   karel.putBeeper();
   karel.turnRight();
   karel.move();
   karel.putBeeper();
   karel.move();

     }
}
