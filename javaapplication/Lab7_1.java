/*
 * 
 * седьмая лаба 1
 * 
 */
package lab7_1;

class Cow {
    
    public void getName() {
        System.out.println("Я корова");
    }
}

class Whale extends Cow{
    
    public void getName() {
        System.out.println("Я не корова, я кит");
    }
}

class Cat {
    
    public Cat getChild() {
        System.out.println("Cat is borned");
        return new Cat();
    }
}

class Dog extends Cat {
    
    public Dog getChild() {
        System.out.println("Dog is borned");
        return new Dog();
    }
}
class Huskey {
}

/**
 *
 * @author pashila
 */
public class Lab7_1 {

    private Lab7_1() {
        throw new AssertionError();
    }

    static void printClassName(Object obj) {
        System.out.println("Class name: " + obj.getClass().getSimpleName());
    }

    static void print(int data) {
        System.out.printf("Type: int\n%d\n", data);
    }
    
    static void print(String data) {
        System.out.printf("Type: string\n%s\n", data);
    }
    
    static void print(long data) {
        System.out.printf("Type: long\n%d\n", data);
    }
    
    static void print(float data) {
        System.out.printf("Type: float\n%f\n", data);
    }
    
    static void print(double data) {
        System.out.printf("Type: double\n%f\n", data);
    }

    static int min(int a, int b) {
        return (a<b)?a:b;
    }
    
    static long min(long a, long b) {
        return (a<b)?a:b;
    }
    
    static double min(double a, double b) {
        return (a<b)?a:b;
    }

    static int max(int a, int b) {
        return (a>b)?a:b;
    }
    
    static long max(long a, long b) {
        return (a>b)?a:b;
    }
    
    static double max(double a, double b) {
        return (a>b)?a:b;
    }
    
    public static void main(String[] args) {
        
        Cow cow = new Whale(); cow.getName(); 
            
            System.out.println("\n");
                Cat cat = new Cat(); cat.getChild();
                Dog dog = new Dog(); dog.getChild();
            
            System.out.println("\n");
                Lab7_1.printClassName(cat);
                Lab7_1.printClassName(dog);
            
            System.out.println("\n");
                Lab7_1.print(Lab7_1.max(1,2));	
                Lab7_1.print(Lab7_1.max(1l,2l));
                Lab7_1.print(Lab7_1.max(1d,2d));
            
            System.out.println("\n");
                Lab7_1.print(Lab7_1.min(1,2));	
                Lab7_1.print(Lab7_1.min(1l,2l));
                Lab7_1.print(Lab7_1.min(1d,2d));
        
    }
    
}
