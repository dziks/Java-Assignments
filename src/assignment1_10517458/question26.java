import java.util.Scanner;
/**
 *
 * @author dziks
 */
public class question26 {
    public static void main(String[] args)
    {
        Scanner keyb = new Scanner(System.in);
        double weight;
        int planet;
        
        System.out.print("Please enter your current earth weight: ");
        weight = keyb.nextDouble();
        System.out.println();
        
        System.out.print("I have information for the following planets: ");
        System.out.println();
        System.out.print("\t1. Venus     2. Mars      3. Jupiter\n\t4. Saturn    5. Uranus    6. Neptune\n");
        
        System.out.println();
        
        System.out.print("Which planet are you visiting? ");
        planet = keyb.nextInt();
        System.out.println();
        
        if (planet == 1)
        {
            weight *= 0.78;
        }
        else if (planet == 2)
        {
            weight *= 0.39;
        }
        else if (planet == 3)
        {
            weight *= 2.65;
        }
        else if (planet == 4)
        {
            weight *= 1.17;
        }
        else if (planet == 5)
        {
            weight *= 1.05;
        }
        else if (planet == 6)
        {
            weight *= 1.23;
        }
        
        System.out.println("Your weight would be " + weight + " pounds on that planet");
    }
}
