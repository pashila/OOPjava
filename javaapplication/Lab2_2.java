/*
 *
 * Verification Names
 *
 */
package lab2_2;
/**
 *
 * @author pashila
 */
import java.util.Scanner;

class MyUtility {

	private MyUtility() 
	{
		throw new AssertionError();
	}

	static Scanner sc = new Scanner(System.in);

	static public int getInt()
	{
		while(!sc.hasNextInt()) {
			System.out.println("Invalid data!");
			sc.next();
		}
		return sc.nextInt();
	}
	
	
}


public class Lab2_2 {

    public static void main(String[] args)
	{
		System.out.print("Введите m и n для построения прямоугольника: ");

		int row = MyUtility.getInt(), col = MyUtility.getInt();

		for(int i = 0; i < row; ++i) {
			for(int j = 0; j < col; ++j)
				System.out.print("8");
			System.out.println();
		}
	}
}
