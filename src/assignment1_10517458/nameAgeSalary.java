 
package assignment1_10517458;
import java.util.Scanner;

public class nameAgeSalary {

     
    public static void main(String[] args) {
        Scanner dziks=new Scanner(System.in);
        String name;
        int age;
        double make;
        
        System.out.println("hi, please whats your name :");
          name=dziks.nextLine();
          
         System.out.println("Hi, " + name +" how old are you? :" );
            age=dziks.nextInt();
            
          System.out.println("so you are "+age+", eh? That's not old at all ");
          System.out.print("how much do you make,   " +name+" ? ");
            make=dziks.nextDouble();
            
           System.out.print(+make+"!  i hope that's per hour and not per year"); 
            
        
    }
    
}
