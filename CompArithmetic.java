import java.util.*;
public class CompArithmetic {
    public static void main(String[] args){
        
        int myInt = 15;
        int myInt2 = 9;
        
        int quot = myInt / myInt2;  //integer division
        int rem = myInt % myInt2;   //modulus (remainder) operation
        
        System.out.printf("%d / %d is %d\n", myInt, myInt2, quot);
        System.out.printf("%d %% %d is %d\n", myInt, myInt2, rem);
    }
}