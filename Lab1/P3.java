/* Write a program to generate tables of currency conversions fromm SGD to USD. Use title and column headings. 
Assume the following conversion rate: 1 USD = 1.82 SGD
Allow the user to enter the starting value, ending value and the increment between lines in S$. The starting value,
ending value and increment are all integer values. Generates 3 output tables using the following loops with the same input
data from the user.
*/

import java.util.*;

public class P3 {
    public static final double CONVERSION=1.82;
    public static void main(String[] args){
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("starting : ");
        int starting = sc.nextInt();
        System.out.print(", ending : ");
        int ending = sc.nextInt();
        if(ending<=0) System.out.println("Error!");
        else{
            System.out.println("increment : ");
            int increment = sc.nextInt();
            if(increment<0) System.out.println("Error!");
            else{
                System.out.print("""
                    US$         S$
                    --------------
                    """);
                for(i=starting; i<=ending; i+=increment) System.out.println(i + "        " + i*CONVERSION);
            }   
        }
    }
}