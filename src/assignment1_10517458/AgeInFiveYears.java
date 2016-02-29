package assignment1_10517458;
import java.util.Scanner;

public class AgeInFiveYears {
    
    public static void main(String[] args){
     
    String name;    
    int age;    
    Scanner input=new Scanner(System.in);       
    int AgeSum=0;
    int AgeSub=0;
    
    System.out.print("Hello.  What is your name? : ");
    name=input.next();
    
    System.out.print("\nHi, "+name+"! How old are you? :");
    age=input.nextInt();
    
    
    AgeSub=age - 5;
    AgeSum=age + 5 ;
    System.out.println("\nDid you know that in five years you will be "+AgeSum+ " years old ?");
    
    System.out.print("And five years ago you were "+AgeSub+"! Imagine that!");
    
            
     }
}
