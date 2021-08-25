import java.util.*;
public class GrowthWhile {
    static Scanner keyb = new Scanner(System.in);
    
    public static void main(String[] args){
        double initialAmount = 1000;
        System.out.print("What is the rate? ");
        double rate = keyb.nextDouble();
        double targetAmount = 1500;
        
        double currentAmount = initialAmount;
        int years = 0;
        
        System.out.println("Growth   Current    Year");
        while (currentAmount < targetAmount) {
            double growth = currentAmount * rate;
            currentAmount = currentAmount + growth;
            years++;
            System.out.printf("%,7.2f  %,7.2f   %2d\n"
                              , growth, currentAmount, years);
        }
        System.out.println("\nIt took " + years + " years to reach the target amount.");
        
    }
}