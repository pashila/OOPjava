/*
 * 
 * лаба 3_5
 * 
 */
package lab3_5;

/**
 *
 * @author pashila
 */
public class Lab3_5 {

    private Lab3_5() {
        throw new AssertionError();
    }
    
    static void randomFillArray(int[][] array, int lval, int rval) {
        for(int i = 0; i < array.length; ++i)
            for(int j = 0; j < array[i].length; ++j)
                array[i][j] = (int) Math.round(Math.random() * (rval-lval) + lval);
    }
    
    static void randomFillArray(int[] array, int lval, int rval) {
        for(int i = 0; i < array.length; ++i)
            array[i] = (int) Math.round(Math.random() * (rval-lval) + lval);
    }
    
    static void printArray(int[][] array) {
        for(int i = 0; i < array.length; ++i) {
            for(int j = 0; j < array[i].length; ++j) {
                System.out.print(Integer.toString(array[i][j]) + "\t");
            }
            System.out.println();
        }
    }
    
    static void printArray(int[] array, String spliter) {
        for(int i = 0; i < array.length; ++i)
            System.out.print(Integer.toString(array[i]) + spliter);
        System.out.println();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5]:");
        int row = 7, col = 5;
        int[][] nums = new int[row][col];
        Lab3_5.randomFillArray(nums, -5, 5);
        Lab3_5.printArray(nums); 
        int[] mulRows = new int[]{1, 1, 1, 1, 1, 1, 1};
        for(int i = 0; i < nums.length; ++i){
            for(int j = 0; j < nums[i].length; ++j)
                mulRows[i] *= nums[i][j];
            mulRows[i] = Math.abs(mulRows[i]);
        }
        
        int indexOfBiggest = 0;
        for(int i = 1; i < mulRows.length; ++i)
            if(mulRows[i] > mulRows[indexOfBiggest])
                indexOfBiggest = i;
        System.out.println("Наибольшее произведение элементов строки по модулю: "
            + Integer.toString(mulRows[indexOfBiggest]) + "\n"
            + "Строка под индексом: "
            + Integer.toString(indexOfBiggest)
        );
        
    }
    
}
