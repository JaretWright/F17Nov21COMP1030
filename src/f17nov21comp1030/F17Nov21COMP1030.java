package f17nov21comp1030;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class F17Nov21COMP1030 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //chart header
        System.out.printf("%-6s %-13s %-15s %-15s %n", "Time", "Height(m/s)",
                                                       "m/s at impact", "KPH at impact");
        
        //chart contents
        for (int time=1; time <= 10; time++)
        {
            System.out.printf("%3d %10.1f %13.1f %15.1f %n", time,
                                                             calcHeight(time),
                                                             calcSpeed(time),
                                                             convertToKPH(calcSpeed(time)));
        
        }
        
        
   /*     //prompt the user to enter the time a brick is falling
        System.out.printf("How many seconds was the brick falling?: ");
        
        //create a Scanner to read from the keyboard
        Scanner keyboard = new Scanner(System.in);
        
        //store the result in a variable
        double seconds = keyboard.nextDouble();
        
        System.out.printf("The height of the bridge is %.2fm %n", calcHeight(seconds));
        System.out.printf("The velocity at impact is %.2fm/s %n", calcSpeed(seconds));
        System.out.printf("Which is %.1f KPH %n", covertToKPH(calcSpeed(seconds)));
        */
    }
    
   
    
    
    /**
     * This method will receive a time in seconds representing
     * how long an object is falling.  It assumes an initial 
     * velocity of 0 m/s and that the object will not hit 
     * a terminal velocity
     */
    public static double calcHeight(double timeFallingInSec)
    {
        //height = 1/2 acceleration * time squared
        return 0.5 * 9.81 * timeFallingInSec*timeFallingInSec;
    }
    
    /**
     * This method will calculate the speed of an object
     * based on how long it is falling.
     */
    public static double calcSpeed(double timeFallingInSec)
    {
        //formula for velocity = sqrt(2 * distance * acceleration)
        double distance = calcHeight(timeFallingInSec);
        return Math.sqrt(2*distance*9.81);
    }
    
    /**
     * This method converts m/s into kph
     */
    public static double convertToKPH(double metersPerSecond)
    {
        return metersPerSecond * 3.6;
    }
}
