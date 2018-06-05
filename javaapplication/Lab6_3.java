/*
 * 
 * лаба 6_3
 * 
 */
package lab6_3;
import java.util.Scanner;

class Fish {
    
    private boolean swimAbl = true;

    protected void changeSwimAbl(boolean b) {
        swimAbl = b;
    }
    
    protected boolean getSwimAbl() {
        return swimAbl;
    }
}
class Animal extends Fish {
    
    enum HairCowerType {
        FLUFFY, SHORT, BALD	
    }
    
    private HairCowerType hairCower = HairCowerType.SHORT;

    protected void changeHairType(HairCowerType type) {
        hairCower = type;
    }
    
    protected HairCowerType getHairCower() {
        return hairCower;
    }
}

class Ape extends Animal {
    
    private boolean likeBanana = true;

    protected void changeLikeBanana(boolean b) {
        likeBanana = b;
    }
    
    protected boolean isLikeBanana() {
        return likeBanana;
    }
}

class Human extends Ape {
    
    private boolean canSpeak = true;

    protected void changeCanSpeak(boolean b) {
        canSpeak = b;	
    }
    
    protected boolean getCanSpeak() {
        return canSpeak;
    }

    public void showInfo() {
        System.out.println(
            "1. Swim ability: " + ((getSwimAbl())?"true":"false")
            + "\n2. Hair: " + getHairCower().name()
            + "\n3. Like banana: " + ((isLikeBanana())?"true":"false")
            + "\n4. Can speak: " + ((canSpeak)?"true":"false")
        );

    }
}

/**
 *
 * @author pashila
 */
public class Lab6_3 {

    private Lab6_3() {
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
        
        Human human = new Human();
        while(true) {
            
            System.out.print("\033[H\033[2J");
            
            System.out.flush();
            
            human.showInfo();
            
            int num = Integer.parseInt(
                Lab6_3.getIn(
                    "Num to change: ",
                    "\\d+",
                    "Invalid number! Try again..."
                )
            );
            
            switch(num) {
                case 1:
                    human.changeSwimAbl(!human.getSwimAbl());
                    break;
                
                case 2:
                    
                    String hairMenu=""; int i = 1;
                    
                    for(Animal.HairCowerType type : Animal.HairCowerType.values())
                        hairMenu+=Integer.toString(i++)+" "+type.name()+" ";
                    System.out.println(hairMenu);
                    
                    human.changeHairType(
                        Animal.HairCowerType.values()[
                            Integer.parseInt(
                                Lab6_3.getIn(
                                    "Num of hair: ",
                                    "[1-"+(i-1)+"]",
                                    "Invalid number! Try again..."
                                )
                            )-1
                        ]
                    );
                break;
                case 3:
                    human.changeLikeBanana(!human.isLikeBanana());
                    break;
                case 4:
                    human.changeCanSpeak(!human.getCanSpeak());	
                    break;
            }
        }
        
    }
    
}
