/*
 *
 * лаба 3_1
 *
 */
package lab3_1;

/**
 *
 * @author pashila
 */
public class Lab3_1 {

    private Lab3_1() {
        throw new AssertionError();
    }
    
    static int[] getEvenOddCount(int start, int end){
        int evenCount = 0;
        int oddCount = 0;

        for(int i = start; i <= end; ++i) {
            if( i % 2 == 0) ++evenCount;
            else ++oddCount;
        }

        return new int[]{evenCount, oddCount};
    }
    
    static int[] getEvenOddCount(int[] array) {
        int evenCount = 0;
        int oddCount = 0;

        for (
            int i = 0; 
            i < array.length; 
            ++i
        ) {
            if (array[i] % 2 == 0) ++evenCount;
            else ++oddCount;
        }
        return new int[]{evenCount, oddCount};
    }
    
    static void printArray(int[][] array) {
        for (
            int i = 0; 
            i < array.length; 
            ++i
        ) {
            for (
                int j = 0; 
                j < array[i].length; 
                ++j
            ) {
                System.out.print(
                    Integer.toString(
                        array[i][j]
                    ) + "\t"
                );
            }
            System.out.println();
        }
    }
    
    static void printArray(int[] array, String spliter) {
        for (
            int i = 0; 
            i < array.length; 
            ++i
        )
            System.out.print(Integer.toString(array[i]) + spliter);
        System.out.println();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("четные числа от 2 до 20 в строку и столбец:");

        int start = 2, end = 20;
        int evenCount = Lab3_1.getEvenOddCount(start, end)[0];
        int[] nums = new int[evenCount];	

        for (
            int i = start, 
            j = 0; 
            i <= end; 
            ++i
        )
        if( (i % 10) % 2 == 0 )
            nums[j++] = i;

        Lab3_1.printArray(nums, " ");
        Lab3_1.printArray(nums, "\n");
        
    }
    
}
