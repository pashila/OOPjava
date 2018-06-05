/*
 *
 * To output least number
 *
 */
package lab2_4_2;
import java.util.Scanner;

/**
 *
 * @author pashila
 */
public class Lab2_4_2 {

    private Lab2_4_2() {
        throw new AssertionError();
    }

    static Scanner sc = new Scanner(System.in);

    static public int getInt() {
        while(!sc.hasNextInt()) {
            System.out.println("Invalid data!");
            sc.next();
        }
        return sc.nextInt();
    }
    
    static public int getMin(int a, int b) {
            return (b < a) ? b : a;
    }
    static public int getMin(int c1, int c2, int c3, int c4) {
            return getMin(
                getMin(
                    getMin(
                        c1, c2
                    ), c3
                ), c4
            );
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Enter four numbers to output the minimum: ");

            System.out.println("Least: " 
                + Integer.toString(
                    Lab2_4_2.getMin(	
                        Lab2_4_2.getInt(),
                        Lab2_4_2.getInt(),
                        Lab2_4_2.getInt(),
                        Lab2_4_2.getInt()
                    )
                )
            );
        
    }
    
}
