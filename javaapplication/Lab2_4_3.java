/*
 *
 * Finding a point on the Axis
 *
 */
package lab_2_4_3;
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
 * @author UI3es
 */
public class Lab_2_4_3 {

    private Lab_2_4_3() {
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
            "Enter the coordinates of the point not lying on the coordinate axes: "
        );

        Coordinate print = new Coordinate(
            Lab_2_4_3.getInt(),
            Lab_2_4_3.getInt()
        );
        
        int quarter = print.getQuarter();
        
        String outputString;
        
        if(quarter == 0) outputString = "The point lies on the axis";
        else outputString = "Точка лежит в " + Integer.toString(quarter) + " четверти";

        System.out.println(outputString);
        
    }
    
}
