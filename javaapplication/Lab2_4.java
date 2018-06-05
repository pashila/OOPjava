
package lab2_4;

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
	
	static public int getMin(int r, int l)
	{
		return (l < r) ? l : r;
	}
	static public int getMin(int v1, int v2, int v3, int v4)
	{
		return getMin(getMin(getMin(v1, v2), v3), v4);
	}
}

public class Lab2_4 {

public static void main(String[] args)
	{
		System.out.print("Введите 2 числа для вывода минимального: ");

		int r = MyUtility.getInt(), l = MyUtility.getInt();
		System.out.println(MyUtility.getMin(r,l));	
	}
    
}
