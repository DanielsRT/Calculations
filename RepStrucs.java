import java.util.*;
public class RepStrucs {
    
    static Scanner keyb = new Scanner(System.in);
    
    public static void main(String[] args){

        System.out.println("Welcome to the Repetition Program");
        int times = 6;
        for (int n = 1; n <= times; n++) {
            System.out.println("N is " + n);
            int square = n * n;
            System.out.println(n + " squared is " + square);
        }
        
        System.out.println("\nSecond Example\n");
        Random q = new Random();
        times = 100;
        int min = 1;
        int count = 0;
        for (int k = 1; k <= times; k++) {
            int val = q.nextInt(100) + min;
            System.out.println("K is " + val);
            if (val > 60) { 
                count++;  //same as (count = count +1;)
            }
        }
        System.out.println("The count is " + count);
        System.out.println("That's it");
    }
}