//Megan Ostby & Sam Agather
package airtravel;

import java.util.ArrayList;
public class Flight {
    private ArrayList<FlightSection> section = new ArrayList<FlightSection>();
    private String ID;
    private String airlineName;
    private String departureCity;
    private String arrivalCity;
    private int year;
    private int month;
    private int day;

    public Flight(String airlineName, String departCity, String arriveCity, int year, int month, int day, String flightNumber) {
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
        String flight = "Airline " + this.airlineName + ", departing from " + this.departureCity + ", on " + this.month + ", " + this.day + " " + this.year +
        		" arriving at " + this.arrivalCity + ", flight number " + this.ID + ".\n";

        for(FlightSection sect : section){

            flight += sect.toString();

        }

        return flight;
    }

    public String getDepartureCity()
    {
        return this.departureCity;
    }

    public String getArrivalCity()
    {
        return this.arrivalCity;
    }

    public String getID()
    {
        return this.ID;
    }

    public void addFlightSection(FlightSection fs)
    {
        section.add(fs);
    }

    public FlightSection getFlightSection(SeatClass iClass)
    {
        for(FlightSection sect : section){

            if(sect.classCompare(iClass)){

                return sect;

            }

        }
        
        return null;
    }
    
    public int sectionSize(){
    	
    	return section.size();
    }

}
