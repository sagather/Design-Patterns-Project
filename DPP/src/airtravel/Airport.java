/**
 * Created by Megan Ostby on 11/22/2016.
 */
package airtravel;
//TODO: Megan
public class Airport
{
    String name;

    public Airport(String name) {
        try {
            if (name.length() > 3 || name.length() < 3)
            {
                //Must be alphabtic characters
                throw new IllegalArgumentException("Airport name must be exactly 3 characters long!");
            }

            this.name = name;
        } catch (IllegalArgumentException e) {
            System.out.println("This airport was not created due a size issue with the name.");
        }
    }

    public String toSting()
    {
        String airport = name;

        return airport;
    }
}
