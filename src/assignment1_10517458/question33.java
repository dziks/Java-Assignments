import java.util.Scanner;
/**
 *
 * @author dziks
 */
public class question33 {
    public static void main(String[] args)
    {
        
        Scanner keyb = new Scanner(System.in);
        String kitchen = "There is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. You many open the \"refrigerator\" or look in a \"cabinet\".";
        String upstairs = "Upstairs you see a hallway. At the end of the hallway is the master \"bedroom\". There is also a \"bathroom\" off the hallway. Where would you like to go?";
        String bedroom = "You are in a plush bedroom, with expensive-looking hardwood furniture. The bed is unmade. In the back of the room, the closet door is ajar. Would you like to open the door? (\"yes\" or \"no\")";
        String refrigerator = "Inside the refrigerator you see food and stuff. It looks pretty nasty.\nWould you like to eat eat some of the food? \"yes\" or \"no\")";
        String refno = "You die of starvation.. eventually."        ;
        String refyes = "You won't die of starvation... eventually.";
        String roomno = "Well, then I guess you'll never know what was in there. Thanks for playing, I'm tired of making nested if statements.";
        
        
        String place,refcab,refNo = null,bedroom1,bedrno = null;
        System.out.print("WELCOME TO MITCHELL'S TINY ADVENTURE!");
        System.out.println();
        
       System.out.println("You are in a creepy house! Would you like to \"upstairs\" or into the \"kitchen\"?");
       place = keyb.next();
       
       if (null != place)
        switch (place) {
            case "kitchen":
                System.out.println(kitchen);
                refcab = keyb.next();
                if ("refrigerator".equals(refcab))
                {
                    System.out.println(refrigerator);
                    refNo = keyb.next();
                }    if ("no".equals(refNo))
           {
               System.out.println(refno);
           }    break;
            case "upstairs":
                System.out.println(upstairs);
                bedroom1 = keyb.next();
                if("bedroom".equals(bedroom1))
                {
                    System.out.println(bedroom);
                    bedrno = keyb.next();
                }    if ("no".equals(bedrno))
           {
               System.out.println(roomno);
           }    break;
        }
    }
            
}        

