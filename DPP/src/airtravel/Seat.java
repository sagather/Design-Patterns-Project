/**
 * Created by Megan Ostby on 11/22/2016.
 */
package airtravel;
//Test
public class Seat {

    private int row;
    private char seat;
    private String assignment;

    public Seat(int iRow, char iSeat){

        this.row = iRow;
        this.seat = iSeat;

    }

    public String toString(){

        this.assignment = "Seat: " + row + seat;
        return this.assignment;

    }

}
