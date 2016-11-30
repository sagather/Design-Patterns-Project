/**
 * Created by Megan Ostby on 11/22/2016.
 */
package airtravel;
import java.util.*;
//Test
public class FlightSection {

    private ArrayList<Seat> seats = new ArrayList<Seat>();
    private SeatClass sClass;
    private int rows;
    private int cols;
    private String airline;
    private String flightNumber;

    public FlightSection(String iAirline, String iFlightNumber, int seatRows, int seatCols, SeatClass isClass){

        try{
        	
        	if(seatRows > 100 || seatCols > 10 || seatRows < 1 || seatCols < 1){

        		throw new IllegalArgumentException();
        
        	}

        	for(int i = 1; i <= seatRows; i++){
        		
        		char z = 'a';

        		for(int j = 0; j < seatCols; j++){   //not sure if this will work... in theory it will, but...

        			seats.add(new Seat(i, z));
        			z++;

        		}

        	}
        	
			this.airline = iAirline;
			this.flightNumber = iFlightNumber;
			this.sClass = isClass;

        	
        }
        
        catch(IllegalArgumentException e){
        	
        	System.out.println("Invalid number of rows and cols to create a flight");
        	
        }

    }

    public boolean hasAvailableSeats(){

        int i = 0;
        
        for(Seat s : seats){
        	
        	if(!s.isAssigned()){
        		
        		i++;
        		
        	}
        	
        }
        
        return i>0;

    }
    
    public void bookSeat(int iRow, char iCol, SeatClass iClass){
    	
    	int i = 0;
    	
    	for(Seat s : seats){
    		
    		if(s.getRow() == iRow){
    			
    			if(s.getCol() == iCol){
    				
    				s.setAssigned();
    				System.out.println("You successfully booked " + this.sClass + ", seat " + iRow + iCol);
    				i++;
    				
    			}
    			
    		}
    		
    	}
    	
    	if(i == 0){
    		
    		throw new IllegalArgumentException();
    	}
    	
    }

    public String toString(){

        return "For section " + sClass + " there is " + seats.toString();

    }
    
    public String getID(){
    	
    	return this.flightNumber;
    }

}
