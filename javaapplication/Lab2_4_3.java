
package lab2_4_3;
import java.util.Scanner;

class Coordinate {
    public Coordinate(int X, int Y) {
        x = X;
        y = Y;
    } public int x, y;

    public int getQuarter() {
        if(x == 0 || y == 0) return 0;	

        if(x > 0) {
            if(y>0) return 1;
            else return 4;
        } 

        if(y>0) return 2;

        else return 3;
    }
}

/**
 *
 * @author pashila
 */
public class Lab2_4_3 {

    private Lab2_4_3() {
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
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print (
            "Введите координаты точки, не лежащей на координатных осях: "
        );

        Coordinate print = new Coordinate(
            Lab2_4_3.getInt(),
            Lab2_4_3.getInt()
        );
        
        int quarter = print.getQuarter();
        
        String outputString;
        
        if(quarter == 0) outputString = "Точка лежит на оси";
        else outputString = "Точка лежит в " + Integer.toString(quarter) + " четверти";

        System.out.println(outputString);
        
    }
    
}
