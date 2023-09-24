package Lab2;

import java.util.*;

public class Lab2P1 {
    public static void main(String[] args){
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            System.out.print("Please key in your choice: ");
            choice = sc.nextInt();
            int a, b, ans;
            switch (choice) {
                case 1: /* add mulTest() call */
                    mulTest();
                    break;
                case 2: /* add divide() call */
                    System.out.print("m = ");
                    a = sc.nextInt();
                    System.out.print(",n = ");
                    b = sc.nextInt();
                    ans = divide(a, b);
                    System.out.println(a + " / " + b + " = " + ans);
                    break;
                case 3: /* add modulus() call */
                    System.out.print("m = ");
                    a = sc.nextInt();
                    System.out.print(",n = ");
                    b = sc.nextInt();
                    ans = modulus(a, b);
                    System.out.println(a + " % " + b + " = " + ans);
                    break;
                case 4: /* add countDigits() call */
                    System.out.print("n : ");
                    a = sc.nextInt();
                    if(a<0) System.out.println(" - Error input!!");
                    else{
                        ans = countDigits(a);
                        System.out.println(" - count = " + ans);
                    }
                    break;
                case 5: /* add position() call */
                    System.out.print("n = ");
                    a = sc.nextInt();
                    System.out.print(",digit = ");
                    b = sc.nextInt();
                    ans = position(a, b);
                    if(ans==0) System.out.println("position = -1");
                    else System.out.println("position = " + ans);
                    break;
                case 6: /* add extractOddDigits() call */
                    System.out.print("n : ");
                    a = sc.nextInt();
                    long c = extractOddDigits(a);
                    System.out.println("oddDigits = " + c);
                    break;
                case 7: System.out.println("Program terminating ….");
                }
        }
        while (choice < 7);
    }
    
    /* add method code here */
    public static void mulTest(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numOfCorrectAns = 0;
        for(int i=0; i<5; i++){
            int number1 = random.nextInt(10);
            int number2 = random.nextInt(10);
            int correctanswer = number1 * number2;
            System.out.println("How much is " + number1 + " times " + number2 + " ? ");
            int answer = scanner.nextInt();
            if(answer==correctanswer) numOfCorrectAns++;
        }
        System.out.println(numOfCorrectAns + " answers out of 5 are correct.");
    }
    public static int divide(int m, int n){
        if(n>m) return 0;
        int numOfDivisions = 1;
        while(m>n){
            m-=n;
            numOfDivisions++;
        }
        return numOfDivisions;
    }
    public static int modulus(int m, int n){
        return m % n;
    }
    public static int countDigits(int n){
        int count=1;
        if(n<0){
            System.out.println("Error");
            return 0;
        }
        while(n>10){
            n = n/10;
            count++;
        }
        return count;
    }
    public static int position(int n, int digit){
        int index = 1;
        while(n!=0){
            if(n%10==digit) return index;
            index++;
            n=n/10;
        }
        return 0;
    }
    public static long extractOddDigits(long n){
        long oddNum = 0;
        long times = 1;
        while(n > 0){
            if((n % 10) % 2 == 1){ // odd number
                oddNum = oddNum + times * (n % 10);
                times = times * 10;
            }
            n = n/10;
        }
        if(oddNum == 0 ) return -1;
        return oddNum;
    }
}