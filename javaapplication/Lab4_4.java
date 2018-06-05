/*
 * 
 * Четвертая лаба - 4
 * 
 */
package lab4_4;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author pashila
 */
public class Lab4_4 {

    private Lab4_4() {
        throw new AssertionError();
    }
    
    public static long fib(int index) {
        if(index < 1) return 0;
        if(index == 1) return 1;
        return fib(index-2) + fib(index-1);
    }
    public static void main(String[] args) {
        
        int fibIndex = 0;
        long startTime;
        do {
            startTime = System.nanoTime();
            System.out.println("Index: " + fibIndex + " Value: " + Lab4_4.fib(fibIndex++));
        } while(System.nanoTime() - startTime < TimeUnit.SECONDS.toNanos(60));

        System.out.println("nachinaya s pozicii " + Integer.toString(fibIndex-2) + " vychislenie chisla fibonacci zanimaet bolee minuty");
        
    }
    
}
