/*
 *
 * Verification Names
 *
 */
package lab2_4_1;
import java.util.Scanner;

/**
 *
 * @author pashila
 */
public class Lab2_4_1 {

    private Lab2_4_1() {
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
    
    static public String getName() {
        boolean isValidName;
        String name;
        do {
            isValidName = true;
            name = sc.nextLine();
            if (
                name.matches("\\W")
            ) {
                System.out.println("Invalid data!");
                isValidName = false;
            }
        } while (
            !isValidName
        );
        return name;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Введите имена:");

        String firstName =
            Lab2_4_1.getName(),
            secondName = Lab2_4_1.getName();
        
        String resultMsg;

        if (
            firstName.equals(secondName)
        )
        resultMsg = "имена идентичны";
        
        else if (
            firstName.length() == secondName.length()
        )
        resultMsg = "длины имен равны";
        
        else resultMsg = "имена не идентичны";

        System.out.println(resultMsg);
        
    }
    
}
