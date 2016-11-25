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

    public FlightSection(int seatRows, int seatCols, SeatClass isClass){

        for(int i = 0; i < seatRows i++){

            for(char j = 'a'; j < seatCols; j++){   //not sure if this will work... in theory it will, but...

                seats.add(new Seat(i, j));

            }

        }

    }

    public boolean hasAvailableSeats(){

        return seats.size()>0;

    }



}
