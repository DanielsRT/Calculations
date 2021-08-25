import java.util.*;
public class sumVals {
    static Scanner keyb = new Scanner(System.in);
  
    public static void main(String[] args){
        System.out.println("Welcome to the Sum of Values Program");
        System.out.print("How many values do you have? ");
        int numVals = keyb.nextInt();
        int sumVal = 0;
        for(int i = 0; i < numVals; i++) {
            //System.out.println("i is " + i);
            System.out.print("Enter a value: ");
            int val = keyb.nextInt();
            sumVal = sumVal + val;
            //System.out.println("The sum of values is " + sumVal);
        }
        System.out.printf("The sum of the %d values is %d\n", numVals, sumVal);
        System.out.println("Thank you and good night!");
    }
}