import java.util.*;

public class RollDice {
    
    static Random rand = new Random();
    static Scanner keyb = new Scanner(System.in);    
    
    public static void main(String[] args) {
        System.out.println("Welcome to the Roll Two Dice Program");
        
        int numberOfSides = 6;
        int die_1 = rand.nextInt(numberOfSides) + 1; // produces a value from 1 to 6
        int die_2 = rand.nextInt(numberOfSides) + 1; // produces a value from 1 to 6
        int die_3 = rand.nextInt(numberOfSides) + 1; // produces a value from 1 to 6
        System.out.printf("die_1 --> %,d\n", die_1);
        System.out.printf("die_2 --> %,d\n", die_2);
        System.out.printf("die_3 --> %,d\n", die_3);

        // put the dice in order from greatest to least
        int high = 0, middle = 0, low = 0;
        if (die_1 > die_2) {
            if (die_1 > die_3) {
                high = die_1;
                if (die_2 > die_3) {
                    middle = die_2;
                    low = die_3;
                } else {
                    middle = die_3;
                    low = die_2;
                }
            } else {
                high = die_3;
                middle = die_1;
                low = die_2;
            }
        } else { // die_1 is not highest
            if (die_2 > die_3) {
                high = die_2;
                if (die_1 > die_3) {
                    middle = die_1;
                    low = die_3;
                } else {
                    middle = die_3;
                    low = die_1;
                }
            } else {
                high = die_3;
                middle = die_2;
                low = die_1;
            }
        }
        System.out.println("high " + high + ", middle " + middle + ", low " + low);
        
        if (die_1 > die_2 && die_1 > die_3) {
            System.out.println("die 1 is greatest");
        } else if (die_2 > die_1 && die_2 > die_3) {
            System.out.println("die 2 is greatest");
        } else if (die_3 > die_1 && die_3 > die_2) {
            System.out.println("die 3 is greatest");
        } else {
            System.out.println("At least two dice are tied for greatest");
        }                       
        
//         if (die_1 > die_2) {
//             System.out.println("Die 1 is greater -- " + die_1);
//         } else {
//             System.out.println("Die 2 is greater OR equal -- " + die_2);
//         }

//         if (die_1 > die_2) {
//             System.out.println("Die 1 is greater -- " + die_1);
//         } else if (die_2 > die_1) {
//             System.out.println("Die 2 is greater -- " + die_2);
//         } else {
//             System.out.println("The two dice are equal");
//         }
        
        System.out.println("That's the end");
    }
}