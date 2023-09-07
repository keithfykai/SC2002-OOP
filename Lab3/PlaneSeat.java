package Lab3;
import java.util.*;

public class PlaneSeat {
    private int seatId;
    private boolean assigned;
    private int customerId;
    // Constructor for the class PlaneSeat
    public PlaneSeat(int seat_id){
        seatId = seat_id;
        assigned = true;
        customerId = 0;
    }
    // get method that returns the seat number
    public int getSeatID(){ 
        return seatId;
    }
    // get method that returns the customer number
    public int getCustomerID(){
        return customerId;
    }
    // method that returns a boolean on whether the seat is occupied
    public boolean isOccupied(){        
        return assigned;
    }
    // method that assigns a seat to a customer (setter for customerId)
    public void assign(int cust_id){
        customerId = cust_id;
    }
    // method that unassigns a seat
    public void unAssign(){
        assigned = false;
        seatId = 0;
        customerId = 0;
    }
}
