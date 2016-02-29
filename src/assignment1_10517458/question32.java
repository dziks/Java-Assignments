import java.util.Scanner;

/**
 *
 * @author dziks
 */
public class question32 {
    public static void main(String[] args)
    {
        Scanner Keyb = new Scanner(System.in);
        String anim,yesno,result = null;
        
        System.out.print("TWO QUESTIONS!");
        System.out.println("Think of an object, and I'll try to guess it.");
        System.out.println();
    
        System.out.println("Question 1) Is it animal, vegetable, or mineral?");
        anim = Keyb.next();
        
        System.out.println("Is it bigger than a breadbox?");
        yesno = Keyb.next();
        System.out.println();
        
        if (null != anim)
        switch (anim) {
            case "animal":
                 if (null != yesno)
                switch (yesno) {
            case "yes":
                result = "moose";
                break;
            case "no":
                result = "squirrel";
                break;
        }  break;
            case "vegetable":
                 if (null != yesno)
                switch (yesno) {
            case "yes":
                result = "watermelon";
                break;
            case "no":
                result = "carrot";
                break;
        }  break;
            case "mineral":
                 if (null != yesno)
                switch (yesno) {
            case "yes":
                result = "Camaro";
                break;
            case "no":
                result = "paper Clip";
                break;
        }  break;
        }
        System.out.println("My guess is that you are thinking of a " + result + ".");
        System.out.println("I would ask you if I'm right, but I don't actually care.");
    }   
}
