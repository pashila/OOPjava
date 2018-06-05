/*
 * 
 * лаба 6_1
 * 
 */
package lab6_1;
import java.util.Scanner;

class Horss {
    protected String name;

    public Horss() {
        name = Lab6_1.getIn(
            "The name of the horse: ",
            "\\w{3,}", 
            "Invalid name! Try again..."
        );
    }
}
class Pegas extends Horss {

    public void fly() {
        System.out.println("I believe this  " + name + " can fly...");
    }
}

/**
 *
 * @author pashila
 */
public class Lab6_1 {

    private Lab6_1() {
        throw new AssertionError();
    }

    public static Scanner sc = new Scanner(System.in);

    public static String getIn(String help, String ptrn, String invalid) {
        System.out.println(help);

        while (!sc.hasNext(ptrn)){
            sc.next();
            System.out.println(invalid);
        }
        return sc.next();
    }
    public static void main(String[] args) {
        
        Pegas p = new Pegas();
        p.fly();
        
    }
    
}
