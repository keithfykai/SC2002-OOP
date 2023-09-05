/* Write a program that reads the height from a user and prints a pattern with the specified height. For example, when 
 * the user enters height = 3, the following pattern is printed:
 *  AA
 *  BBAA
 *  AABBAA
 */

import java.util.*;

public class P4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the height: ");
        int height = sc.nextInt();
        if(height<=0) System.out.println("Error!");
        else{
            for(int j=1; j<=height; j++){
                for(int i=j; i>0; i--){
                    if(i%2==1) System.out.print("AA");
                    else System.out.print("BB");
                    }
                    System.out.println();
                }
                
            }
        }
    }
