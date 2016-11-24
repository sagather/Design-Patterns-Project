/**
 * Created by Megan Ostby on 11/22/2016.
 */
package airtravel;
//Test
public class FlightSection {

    private ArrayList<Seat> seat;
    private SeatClass sClass;
    private int rows;
    private int cols;

    public FlightSection(int seatRows, int seatCols, SeatClass isClass){

        this.rows = seatRows;
        this.cols = seatCols;
        this.sClass = isClass;

    }



}
