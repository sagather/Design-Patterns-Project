/**
 * Created by Megan Ostby on 11/22/2016.
 */
import airtravel.*;
import org.omg.CORBA.PRIVATE_MEMBER;

import java.util.*;

public class SystemManager
{
//Test
        private ArrayList<Airport> airports = new ArrayList<Airport>();
        private ArrayList<Airline> airlines = new ArrayList<Airline>();
        private ArrayList<Flight> flights = new ArrayList<Flight>();
        private FlightSection section;

        public SystemManager(){

        }

        public void createAirport(String iAirport){
                try
                {
                        if (iAirport.length() > 3 || iAirport.length() < 3) {
                                //Must be alphabetic characters
                                throw new IllegalArgumentException("Airport name must be exactly 3 characters long!");
                        }
                        if (!iAirport.matches("[a-zA-Z]+")) {
                                throw new IllegalArgumentException("Airport name must only contain alphabetic characters. ");
                        }

                        Airport airport = new Airport(iAirport);
                        airports.add(airport);
                }
                catch (IllegalArgumentException e)
                {
                System.out.println("This airport was not created due an issue with the name.");
                }
        }

        public void createAirline(String iAirline){
                try
                {
                        if (iAirline.length() > 6) {
                                throw new IllegalArgumentException("Airline name must be less than 6 characters long!");
                        }
                        for(Airline sAirline:airlines)
                        {
                                if (sAirline.getName().equals(iAirline)) {
                                        throw new IllegalArgumentException("Airline name must not be the same as another airline name.");
                                }
                        }
                        Airline airline = new Airline(iAirline);
                        airlines.add(airline);
                }
                catch (IllegalArgumentException e)
                {
                        System.out.println("This airline was not created due an issue with the name.");
                }
        }

        public void createFlight(String iLine, String iDeparture, String iArrival, int year, int month, int day, String iFlightNumber){
                Flight flight = new Flight(iLine,iDeparture,iArrival,year,month,day,iFlightNumber);
                flights.add(flight);
        }

        public void createSection(String iAirline, String iFlightNumber, int iRow, int iCols, SeatClass iClass){

                this.section = new FlightSection(iAirline, iFlightNumber, iRow, iCols, iClass);
                for(Flight fly : flights){
                	
                	if(fly.getID().equals(iFlightNumber)){
                		
                		fly.addFlightSection(section);
                		
                	}
                	
                }

        }

        public void findAvailableFlights(String iDeparture, String iArrival){
        	
        	System.out.println("\nAvailable Flights: \n");
        	int i = 0;
        	
        	try{
        	
        		for(Flight flight : flights){
        			
        			if(iDeparture.equals(flight.getDepartureCity())){
        			
        				if(iArrival.equals(flight.getArrivalCity())){
        				
        					System.out.println(flight.toString());
        					i++;
        				
        				}
        			
        			}
        		
        		}
        		
        		if(i == 0){
        			
        			throw new IllegalArgumentException();
        			
        		}

        	}
        	
        	catch(IllegalArgumentException e){
        		
        		System.out.println("There are no flights with the destination and arrival airport combination provided");
        		
        	}
        	

        }

        public void bookSeat(String iAirport, String iFlight, SeatClass iClass, int iRow, char iSeat){
        	
        	try{
        		
        		for(Flight fly : flights){
        			
        			if(fly.getID().equals(iFlight)){
        				
        				this.section = fly.getFlightSection(fly.getID());
        				
        				if(section.hasAvailableSeats()){
        					
        					try{
        						
            					section.bookSeat(iRow, iSeat, iClass);
        						
        					}
        					catch(IllegalArgumentException e){
        						
        						System.out.println("Looks like that seat doesn't exist or it's not booked yet");
        						
        					}

        					
        				}
        				
        			}
        			
        		}
        		
        	}
        	
        	catch(IllegalArgumentException e){
        		
        		System.out.println("Something's not right here, bro.");
        		
        	}

        }

        public void displaySystemDetails(){
        	
        	System.out.println("\nAirports:\n");
        	
        	for(Airport port : airports){
        		
        		System.out.println(port.toString());
        		
        	}
        	
        	System.out.println("\nAirlines:\n");
        	
        	for(Airline line : airlines){
        		
        		System.out.println(line.toString());
        		
        		
        	}
        	
        	System.out.println("\nFlights:\n");
        	
        	for(Flight fly : flights){
        		
        		System.out.println(fly.toString());
        		
        	}
        	
        	
        }

}
