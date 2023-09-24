package Lab3;
import java.util.*;

public class PlaneApp {
    public static void main(String[] args){
        Plane plane = new Plane();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Perform the following methods:");
            System.out.println("(1) Show number of empty seats");
            System.out.println("(2) Show the list of empty seats");
            System.out.println("(3) Show the list of seat assignments by seat ID");
            System.out.println("(4) Show the list of seat assignments by customer ID");
            System.out.println("(5) Assign a customer to a seat");
            System.out.println("(6) Remove a seat assignment");
            System.out.println("(7) Exit");
            System.out.println("Enter the number of your choice: ");
            choice = sc.nextInt();
            int a, b, ans;
            switch (choice) {
                case 1: /* add showNumEmptySeats() call */
                    plane.showNumEmptySeats();
                    break;
                case 2: /* add showEmptySeats() call */
                    plane.showEmptySeats();
                    break;
                case 3: /* add modulus() call */
                    break;
                case 4: /* add countDigits() call */
                    break;
                case 5: /* add assign() call */
                    System.out.println(:"Assigning Seat...");
                    System.out.println("Please enter SeatID: ");
                    int seatID = sc.nextInt();
                    System.out.println("Please enter Customer ID: ");
                    int custID = sc.nextInt();
                    plane.assignSeat(seatID, custID);
                    break;
                case 6: /* add extractOddDigits() call */
                    break;
                case 7: System.out.println("Program terminating ….");
                }
        }
        while (choice != 7);
    }
    
    
}
