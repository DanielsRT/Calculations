import java.util.*;
public class Growth {
    static Scanner keyb = new Scanner(System.in); 
    
    public static void main(String[] args){
        System.out.println("Welcome to the Growth Program!");
        
        double initial_money = 1000;
        double rate_pct = 5; // 5% == 0.05
        int years = 10;
        double total_money = initial_money;
        
        for (int r = 1; r <= years; r++) {
            double new_growth = total_money * (rate_pct / 100.0);
            total_money = total_money + new_growth;
            System.out.printf("%2d    %,6.2f    %,9.2f\n", r, new_growth, total_money);
        }
        
    }
}