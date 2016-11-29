package airtravel;

import java.util.HashMap;
//Test
/**
 * Created by Megan Ostby on 11/22/2016.
 */
//TODO: Megan
public class Airline
{
    private HashMap<String,Flight> flights;
    private String name;

    public Airline(String name)
    {
        this.name = name;
    }

    //public addFlight(Flight flight)
    //{

    //}

    //Maintains information about airlines
    //Airlines can have 0 or more flights associated with it
    //When created no flights are associated with an airline
    //Each flight (From flight class?) must have a unique ID for that particular airline

    public String toString()
    {
        String airline = name;

        return airline;
    }

    public String getName()
    {
        return this.name;
    }
}

