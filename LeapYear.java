import java.util.*;
public class LeapYear {
    
    static Scanner keyb = new Scanner(System.in);
    
    public static void main(String[] args){

        System.out.println("Welcome to the Leap Year Program!");
        
        System.out.print("Enter a year: ");
        int year = keyb.nextInt();
        
        int RemainderBy4 = year % 4;
        System.out.println("Remainder by 4 is " + RemainderBy4);
        
        int RemainderBy100 = year % 100;
        System.out.println("Remainder by 100 is " + RemainderBy100);
        
        int RemainderBy400 = year % 400;
        System.out.println("Remainder by 400 is " + RemainderBy400);
         
        if (RemainderBy4 == 0) {
            if (RemainderBy100 == 0) {
                if (RemainderBy400 == 0) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " is not a leap year");
                }
            } else {
                System.out.println(year + " is a leap year");
            } 
        } else {
            System.out.println(year + " is not a leap year");
        }
        
    }
}