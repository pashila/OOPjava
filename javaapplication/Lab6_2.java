/*
 * 
 * лаба 6_2
 * 
 */
package lab6_2;
import java.util.Scanner;

class Pet {
    
    protected int age, weight;
    protected boolean isMale;

    public Pet() {
        age = Integer.parseInt(Lab6_2.getIn(
            "ВОЗРАСТ ПИТОМЦА: ",
            "\\d+",
            "Invalid age! Try again...")
        );

        weight = Integer.parseInt(Lab6_2.getIn(
            "ВЕС ПИТОМЦА: ",
            "\\d+",
            "Invalid weight! Try again...")
        );

        String isMaleKey = "y";
        String isMaleAns = Lab6_2.getIn(
            "ПОЛ ПИТОМЦА (M по умолчанию)? ("+ isMaleKey +" если M): ",
            "\\w+",
            "Invalid male! Try again..."
        );
        isMale = (isMaleAns.equals(isMaleKey)) ? true : false;
    }
}
class Cat extends Pet {	
    
    private String name;	
    
    public void changeName(String name) {
            this.name = name;
    }
    
    public String getName() {
            return name;
    }

    public String getInfo() {
            String maleAns = (isMale) ? "Mужик" : "Кошка";
            return 
            "КОТ " + name + " НАШ ПИТОМЕЦ."
            + " ЕГО ВОЗРАСТ " + age + " И " + weight + " ЕГО ВЕС."
            + "А ТАК ЖЕ ОН " + maleAns + ".";
    }
}

/**
 *
 * @author pashila
 */
class Dog extends Pet {
		
    public String name;	

    public String getInfo()
    {
        String maleAns = (isMale) ? "Кобель" : "Сучка";
        return 
        "ПЁС " + name + " НАШ ПИТОМЕЦ."
        + " ЕГО ВОЗРАСТ " + age + " И " + weight + " ЕГО ВЕС."
        + " А ТАК ЖЕ ОН " + maleAns + ".";
    }
}

public class Lab6_2 {

    private Lab6_2() {
        throw new AssertionError();
    }

    public static Scanner sc = new Scanner(System.in);

    public static String getIn(String help, String ptrn, String invalid) {
        System.out.println(help);

        while (!sc.hasNext(ptrn)){
            sc.next();
            System.out.println(invalid);
        }
        return sc.next();
    }
    public static void main(String[] args) {
        
        Cat cat = new Cat();
        
        cat.changeName(Lab6_2.getIn(
            "ИМЯ КОТА: ",
            "\\w{3,}", 
            "Invalid name! Try again...")
        );
        
        System.out.println(cat.getInfo());

        Dog dog = new Dog();
        
        dog.name = Lab6_2.getIn(
            "ИМЯ СОБАКИ: ",
            "\\w{3,}", 
            "Invalid name! Try again..."
        );
        
        System.out.println(dog.getInfo());
        
    }
    
}
