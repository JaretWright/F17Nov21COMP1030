package f17nov21comp1030;

/**
 *
 * @author JWright
 */
public class Loops {
    public static void main(String[] args)
    {
        
        for (int i=1; i<=10; i++)
        {
            System.out.printf("%2d", i);
            
                if (isEven(i))
                    System.out.print(" Even");
                
            System.out.println();
        }
        
        //same as above, but using a ternary operator
        for (int i=1; i<=10; i++)
        {
            System.out.printf("%2d %s %n", i, isEven(i)?"Even":""); 
        }
        
        for (int i=1; i<=10; i++)
        {
            System.out.printf("%d divided by 2 = %d, with a remainder of %d %n", i, i/2, i%2);
        }
            
        
      /*  System.out.println("While loop");
        int i = 1;
        while (i<=10)
        {
            System.out.println(i);
            i++;
        }
        
        System.out.println("do...While loop");
        i = 1;
        do
        {
            System.out.println(i);
            i++;
        }while (i<=10);
        */
    }
    
    /**
     * This method will return true if the number is even
     */
    public static boolean isEven(int numberToAssess)
    {
        //check if the remainder after dividing by 2 is 0, if it is,
        //then it is an even number
        return numberToAssess % 2 == 0;       
    }
}
