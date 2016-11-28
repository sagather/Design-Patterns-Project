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

    public FlightSection(Airline iAirline, String iFlightNumber, int seatRows, int seatCols, SeatClass isClass){

        if(seatRows > 100 || seatCols > 10 || seatRows < 1 || seatCols < 1){

            System.out.println("Invalid number of rows and cols to create a flight");
            throw new RuntimeException();

        }

        for(int i = 0; i < seatRows; i++){

            for(char j = 'a'; j < seatCols; j++){   //not sure if this will work... in theory it will, but...

                seats.add(new Seat(i, j));

            }

        }

    }

    public boolean hasAvailableSeats(){

        return seats.size()>0;

    }

    public String toString(){

        return "For section " + sClass + " there is " + seats.toString();

    }



}
