import java.util.*;

public class SwitchCalculator {
    
    static Scanner keyb = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Welcome to the Switch Calculator");
        System.out.print("What's the 1st number? ");
        int val1 = keyb.nextInt();
        System.out.print("What's the 2nd number? ");
        int val2 = keyb.nextInt();
        System.out.println("Choose an operation:");
        System.out.println("(1) add, (2) subtract, (3) multiply, (4) floating point quotient");
        System.out.println("(5) integer quotient, (6) modulus (remainder)");
        System.out.print("Enter your choice (1-6): ");
        int choice = keyb.nextInt();
        
        switch (choice) {
            case 1:
                int sum = val1 + val2;
                System.out.println("The sum of " + val1 + " plus " + val2 + " equals " + sum);
                break;
            case 2:
                int diff = val1 - val2;
                System.out.println("The difference of " + val1 + " minus " + val2 + " equals " + diff);
                break;
            case 3:
                int product = val1 * val2;
                System.out.println("The product of " + val1 + " times " + val2 + " equals " + product);
                break;
            case 4:
                // double floatQuot = 1.0 * val1 / val2;
                double floatQuot = (double)val1 / val2;
                System.out.println("The floating point quotient of " + val1 + " divided by " + val2 + " equals " + floatQuot);
                break;
            case 5:
                int intQuot = val1 / val2;
                System.out.println("The integer quotient of " + val1 + " divided by " + val2 + " equals " + intQuot);
                break;
            case 6:
                int rem = val1 % val2;
                System.out.println("The remainder of " + val1 + " divided by " + val2 + " equals " + rem);
                break;
            default:
                System.out.println("Please try again.");
        }
        
        System.out.println("\nThanks for using the Switch Calculator");
    }
}