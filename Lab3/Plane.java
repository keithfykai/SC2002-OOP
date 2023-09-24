package Lab3;
import java.util.*;

public class Plane {
    private PlaneSeat[] seats;
    private int numEmptySeat;
    public static void main(String[] args){
    }
    // Constructor for the class plane
    public Plane() {
        seats = new PlaneSeat[12]; // Initialize the array with 12 seats
        for (int i = 0; i < 12; i++) {
            seats[i] = new PlaneSeat(i + 1); // Create a new PlaneSeat object for each seat
        }
        numEmptySeat = 12; // Initially, all seats are empty
    }
    // method to sort the seats according to ascending order of customerID. A copy of the original array is used for sorting instead of the original
    private PlaneSeat[] sortSeats(){
        
    }
        
    // method to display the number of empty seats
    public void showNumEmptySeats(){
        System.out.println("There are " + numEmptySeat + " empty seats");
    }
    // a method to display the list of empty seats
    public void showEmptySeats(){
        System.out.println("The following seats are empty:");
        for(int i=0; i<12; i++){
            if(seat[i].isOccupied() == false){
                System.out.println("SeatID " + (i+1));
            }
        }
    }
    // method to display the assigned seats with seat ID and customer ID. If bySeatID is true, the order will be by seatID
    // otherwise the order is by customerID.
    public void showAssignedSeats(boolean bySeatId){
        
    }
    // a method that assigns a customer ID to an empty seat
    public void assignSeat(int seatID, int cust_id){
        seat[seatID].PlaneSeat(seatID);
        customerId = cust_id;
        assigned = 
    }
    // method that unassigns a seat
    public void unAssignSeat(int seatId){
        
    }
}
