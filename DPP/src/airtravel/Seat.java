//Megan Ostby & Sam Agather
package airtravel;

public class Seat {

    private int row;
    private char seat;
    private String assignment;
    private boolean assigned = false;

    public Seat(int iRow, char iSeat){

        this.row = iRow;
        this.seat = iSeat;

    }

    public String toString(){

        this.assignment = "Seat: " + row + seat;
        return this.assignment;

    }
    
    public boolean isAssigned(){
    	
    	return this.assigned;
    	
    }
    
    public void setAssigned(){
    	
    	this.assigned = !this.assigned;
    	
    }
    
    public int getRow(){
    	
    	return this.row;
    }
    
    public char getCol(){
    	
    	return this.seat;
    	
    }

}
