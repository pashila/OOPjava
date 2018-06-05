
package lab2_3;
/**
 *
 * @author pashila
 */
public class Lab2_3 {

    public static void main(String[] args)
	{
		System.out.println("Прямоугольный треугольник 10x10:");

		for(int i = 0; i < 10; ++i) {
			for(int j = 0; j < 10; ++j) {
				if(j > i) break;
				else System.out.print("8");
			}
			System.out.println();
		}
	}
    
}
