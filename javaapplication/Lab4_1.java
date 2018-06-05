/*
 * 
 * четвертая лаба - 1
 * 
 */
package lab4_1;

/**
 *
 * @author pashila
 */
public class Lab4_1 {

    private Lab4_1() {
        throw new AssertionError();
    }

    public static int getRandom(int lval, int rval) {
        return (int) Math.round((Math.random() * (rval - lval) + lval ));
    }
    
    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; ++i)
            System.out.print(Integer.toString(array[i]) + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        
        int a = 0, b = 20;
        System.out.println("massiv iz 20 sluchainyh celyh otrezka ["+ a +"; "+ b +"]:");

        int[] randNums = new int[20];
        for(int i = 0; i < randNums.length; ++i)
            randNums[i] = Lab4_1.getRandom(a, b);

        Lab4_1.printArray(randNums);
        
    }
    
}
