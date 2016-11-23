/**
 * Created by Megan Ostby on 11/22/2016.
 */
package airtravel;

public class Seat {

    private int row;
    private char seat;
    private String assignment;

    public String toString(){

        this.assignment = "Seat: " + row + seat;
        return this.assignment;

    }

}
