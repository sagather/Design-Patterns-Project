/**
 * Created by Megan Ostby on 11/22/2016.
 */
import airtravel.*;
import java.util.*;

public class SystemManager
{
//Test
        private ArrayList<Airport> airports;
        private FlightSection section;

        public SystemManager(){

        }

        public void createAirport(String iAirport){
                //TODO: Megan
                //implement Airport class to create an airport
        }

        public void createAirline(String iAirline){
                //TODO: Megan
                //implement airline class to create an airline
        }

        public void createFlight(String iLine, String iDeparture, String iArrival, int year, int month,
                                 int day, String iFlightNumber){
                //TODO: Megan
                //implement flight class and given information to create a flight

        }

        public void createSection(String iAirline, String iFlightNumber, int iRow, int iCols, SeatClass iClass){

                this.section = new FlightSection(iAirline, iFlightNumber, iRow, iCols, iClass);

        }

        public void findAvailableFlights(String iDeparture, String iArrival){

        }

        public void bookSeat(String iAirport, String iFlight, SeatClass iClass, int iRow, char iSeat){



        }

        public void displaySystemDetails(){
        	
        	for(Airport port : airports){
        		
        		System.out.println(port.toString());
        		
        	}

        }

}

