import java.util.Scanner;

/**
 *
 * @author dziks
 */
public class question27 {
    public static void main(String[] args)
    {
        Scanner keyb = new Scanner(System.in);
        int firstans,secondans,thirdans,count = 0;
        
        System.out.println("Are you ready for a quiz?");
        System.out.println("Okay, here it comes!");
        System.out.println();
        
        System.out.println("Q1) What is the capital of Alaska? ");
        System.out.println("\t1) Melbourne\n\t2) Anchorage\n\t3) Juneau\n");
        System.out.print("> ");
        firstans = keyb.nextInt();
        
        if (firstans == 3)
        {
            System.out.println("That's right!");
            count +=1;
        }
        else
        {
            System.out.println("Sorry You are wrong!");
        }
        
        System.out.println();
        System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
        System.out.println("\t1) yes\n\t2) no\n");
        System.out.print("> ");
        secondans = keyb.nextInt();
        
        if (secondans == 1)
        {
            System.out.println("Sorry, \"cat\" is a string. ints can only store numbers");
            
        }
        else if (secondans == 2)
        {
            System.out.println("Correct");
            count +=1;
        }
        else
        {
            System.out.println("Enter 1 or 2");
        }
    
        System.out.println();
        System.out.println("Q3) What is the result of 9+6/3?");
        System.out.println("\t1) 5\n\t2) 11\n\t3) 15/3");
        System.out.print("> ");
        thirdans = keyb.nextInt();
    
        if (thirdans == 2)
        {
            System.out.println("That's correct!");
            count +=1;
        }
        else
        {
            System.out.println("Sorry, you are wrong!");
        }
    
        System.out.println("Overall, you got " + count + " out of 3 correct.");
        System.out.println("Thanks for playing!");
    }
    
    
}
