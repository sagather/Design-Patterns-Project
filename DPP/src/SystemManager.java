/**
 * Created by Megan Ostby on 11/22/2016.
 */
import airtravel.*;

public class SystemManager
{

        private Airline airline;
        private Airport airport;
        private Flight flight;
        private FlightSection section;

        public SystemManager(){

                //createAirline();
                //createAirport();
                //createFlight();
                //createSection();

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

        public void createSection(String iAirline, String iFlightNumber, int iRow, int iPassengers, SeatClass iClass){

        }

        public void findAvailableFlights(String iDeparture, String iArrival){

        }

        public void bookSeat(String iAirport, String iFlight, SeatClass iClass, int iRow, char iSeat){

        }

        public void displaySystemDetails(){

        }

}
