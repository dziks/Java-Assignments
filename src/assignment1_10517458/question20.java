import java.util.Scanner;
/**
 *
 * @author Airdmhund
 */
public class question20 {
    public static void main ( String[] args )
	{
		Scanner keyb = new Scanner(System.in);
		double mass, kilogram, BMI;
                double inches, pounds;
		
		System.out.print( "Your height in m: " );
		mass = keyb.nextDouble();
		
		System.out.print( "Your weight in kg: ");
		kilogram = keyb.nextDouble();
		
		BMI = kilogram / (mass*mass);
		
		System.out.println( "Your BMI is " + BMI );
	
	}
        
}
