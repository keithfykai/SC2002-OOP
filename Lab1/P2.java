

import java.util.*;

public class P2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary: $");
        int salary = sc.nextInt();
        System.out.print("Enter Merit Points: ");
        int merit = sc.nextInt();
        String grade = new String("grade");
        // Grade A
        if(merit<10){
            if(salary>599 && salary<650) grade="C";
            else grade="B";
        }
        else if(merit <20){
            if(salary>699 && salary<800) grade ="B";
            else grade="A";

        }
        else grade="A";
        System.out.println("salary: $"+salary+",merit: "+merit+"- Grade "+grade);
    }
}
