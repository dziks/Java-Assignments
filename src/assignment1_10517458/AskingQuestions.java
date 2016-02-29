
package assignment1_10517458;
import java.util.Scanner;


public class AskingQuestions {
 
    public static void main(String[] args) {
   Scanner dziks=new Scanner(System.in);
        int age;
        String height;
        int inch;
        double weight;

        System.out.print("PLEASE HOW OLD ARE YOU?");
            age=dziks.nextInt();
          
         System.out.print("HOW MANY FEET TALL ARE YOU?");
            height=dziks.next();
         
         System.out.print("AND HOW MANY INCHES?");
            inch=dziks.nextInt();
         System.out.print("HOW MUCH DO YOU WEIGH");
            weight=dziks.nextDouble();
 
  System.out.print("So you are :" +age+"years old  ," + height+"'" + inch +"''"+ "tall and  "  +weight+"  heavy");
 
    }
    
}
