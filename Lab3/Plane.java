package Lab3;
import java.util.*;


public class Plane {
    public static final int NUMOFSEAT = 12;
    private PlaneSeat[] seat = new PlaneSeat[NUMOFSEAT];
    private int numEmptySeat;

    public Plane() {
        for (int i = 0; i < NUMOFSEAT; i++) {
            seat[i] = new PlaneSeat(i + 1);
        }
        numEmptySeat = 12;
    }
    
    private PlaneSeat[] sortSeats(){ // sort seats in ascending customerID. A copy of the original array is used for sorting instead of the original
        PlaneSeat[] sorting_array = new PlaneSeat[12]; // make a copy of the original array
        for(int i=0;i<NUMOFSEAT;i++){ // make a copy of original seats
            sorting_array[i]=seat[i];
        }
        // find min customerid then put, then iterate through whole loop
        for(int i=1;i<NUMOFSEAT;i++){
            for(int j=i;j>0;j--){
                if(sorting_array[j].getCustomerID() < sorting_array[j-1].getCustomerID()){
                    PlaneSeat temp = sorting_array[j-1];
                    sorting_array[j-1] = sorting_array[j];
                    sorting_array[j] = temp;
                }
            }
        }
        
        return sorting_array;
    }

    
    public void showNumEmptySeats(){ // method to display the number of empty seats
        System.out.println("There are " + numEmptySeat + " empty seats");
    }

    
    public void showEmptySeats(){ // a method to display the list of empty seats
        System.out.println("The following seats are empty:");
        for(int i=0; i<NUMOFSEAT ; i++){
            if(seat[i].isOccupied()==false){
                System.out.println("SeatID " + (i+1));
            }
        }
    }
    
    public void showAssignedSeats(boolean bySeatId){
        System.out.println("The seat assignments are as follow:");
        if(bySeatId==true){ // order will be by seatID
            for(int i=0; i<NUMOFSEAT; i++){
                if(seat[i].isOccupied()==true){
                    System.out.println("SeatID " + seat[i].getSeatID() + " assigned to CustomerID " + seat[i].getCustomerID());
                }
            }
        }
        else{ // order will be by CustomerID
            PlaneSeat[] temp = sortSeats();
            for(int i=0; i < NUMOFSEAT; i++){
                if(temp[i].isOccupied()==true){
                    System.out.println("SeatID " + temp[i].getSeatID() + " assigned to CustomerID " + temp[i].getCustomerID());
                }
            }
        }
    }
    
    public void assignSeat(int seatId, int cust_id){ // a method that assigns a customer ID to an empty seat
        // no need to initialize seatID as already done at the start.
        if(seat[seatId-1].isOccupied()==true){
            System.out.println("Seat already assigned to a customer.");
            return;
        }
        seat[seatId-1].assign(cust_id); // assigns customer_id to seat
        numEmptySeat--;
        System.out.println("Seat Assigned!");
    }

    // method that unassigns a seat
    public void unAssignSeat(int seatId){
        if(seat[seatId-1].isOccupied()==false){
            System.out.println("Seat already empty.");
            return;
        }
        seat[seatId-1].unAssign();
        numEmptySeat++;
        System.out.println("Seat Unassigned!");
    }
}
