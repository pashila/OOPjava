/*
 * 
 * четвертая лаба - 2
 * 
 */
package lab4_2;

/**
 *
 * @author pashila
 */
public class Lab4_2 {

    private Lab4_2() {
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
        System.out.println("5 massyvov iz 10 sluchainyh celyh elementov otrezka ["+ a +"; "+ b +"]:");

        for(int i = 0; i < 5; ++i) {
            int[] randNums = new int[10];
            for(int j = 0; j < randNums.length; ++j)
                randNums[j] = Lab4_2.getRandom(a, b);
            Lab4_2.printArray(randNums);
        }
        
    }
    
}
