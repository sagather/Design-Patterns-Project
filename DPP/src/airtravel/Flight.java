/**
 * Created by Megan Ostby on 11/22/2016.
 */
package airtravel;

import java.util.ArrayList;
//Test
//TODO: Megan
public class Flight
{
    //ArrayList<FlightSection> section;
    private String ID;
    private String airlineName;
    private String departureCity;
    private String arrivalCity;
    private int year;
    private int month;
    private int day;

    //Maintains information about flights
    //A flight can be associated with 0 or more flight sections
    //In a flight
        //There can be only one flight section of a particular seat class
        //This will be determined by the enumerator from Sams section
    
    public Flight(String airlineName, String departCity, String arriveCity, int year, int month, int day, String flightNumber)
    {
        this.ID = flightNumber;
        this.airlineName = airlineName;
        this.departureCity = departCity;
        this.arrivalCity = arriveCity;
        this.year = year;
        this.month = month;
        this.day = day;
    }


    public String toString()
    {
        String flight = "";

        return flight;
    }
}
