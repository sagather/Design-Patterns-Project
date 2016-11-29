/**
 * Created by Megan Ostby on 11/22/2016.
 */
package airtravel;
import java.util.*;
//Test
public class FlightSection {

    private ArrayList<Seat> seats;
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

        	for(int i = 0; i < seatRows; i++){

        		for(char j = 'a'; j < seatCols; j++){   //not sure if this will work... in theory it will, but...

        			seats.add(new Seat(i, j));

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

        return seats.size()>0;

    }

    public String toString(){

        return "For section " + sClass + " there is " + seats.toString();

    }
    
    public void bookSeat(){
    	
    
    	
    }
    
    public String getID(){
    	
    	return this.flightNumber;
    }

}
