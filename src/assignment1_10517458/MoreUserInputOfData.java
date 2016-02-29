package assignment1_10517458;
import java.util.Scanner; 
public class MoreUserInputOfData {
   
  public static void main(String[] args){
    
      String name;
      String Lastname;
      int grade;
      int StudentId;
      String login;
      double gpa;
      
      Scanner input=new Scanner(System.in);
      
      System.out.println("Please enter the following information so i can sell it for profit");
      
      System.out.print("First name : ");
      name=input.nextLine();
      
      System.out.print("Last name : ");
      Lastname=input.nextLine();
      
      System.out.print("Grade (9-12) : ");
      grade=input.nextInt();
      
      System.out.print("Student id : ");
      StudentId=input.nextInt();
      
      System.out.print("GPA(0.0-4.0 ):");
      gpa=input.nextDouble();
      
      System.out.print("login name : ");
      login=input.next();
      
      
      
      
      System.out.println("\nYour Information : \n\tlogin:"+login+"\n\tID: "+StudentId+"\n\tName :"+name+"\n\tGPA: "+gpa+"\n\tGrade: "+grade+"");
      
      
  }  
    
}
