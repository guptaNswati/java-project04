package queues;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import cs1c.SongEntry;
/**
 * An object of type Jukebox reads the input file to fill three Queue objects with SongEntry items.
 * @author swati
 *
 */
public class Jukebox
{
    private Queue<SongEntry> favoritePL;
    private Queue<SongEntry> roadTripPL;
    private Queue<SongEntry> loungePL;

    Jukebox()
    {        
        this.favoritePL = new Queue<SongEntry>("Favorites");
        this.roadTripPL = new Queue<SongEntry>("road trip");
        this.loungePL = new Queue<SongEntry>("lounge");       
    }

    /**
     * it reads the test file and adds songs to the appropriate playlist
     * @param requestFile  The name of the test file to read from.
     * @param allSongs The array of songs read from the JSON file
     */
    public void fillPlaylists(String requestFile, SongEntry[] allSongs)
    {
        try 
        {
            Scanner input = new Scanner (new File(requestFile));

            while(input.hasNextLine())
            {
                String[] token = input.nextLine().split(",");


                if(token[0].equals("lounge"))
                {
                    for(int i = 0; i < allSongs.length; i++)
                    {
                        if(allSongs[i].getTitle().equals(token[1]))
                        {                            
                            this.loungePL.enqueue(allSongs[i]);
                            break;
                        }
                    }                                          
                }

                else if(token[0].equals("favorites"))
                {
                    for(int i = 0; i < allSongs.length; i++)
                    {
                        if(allSongs[i].getTitle().equals(token[1]))
                        {
                            this.favoritePL.enqueue(allSongs[i]); 
                            break;
                        }

                    }                    
                }
                else if(token[0].equals("road trip"))
                {
                    for(int i = 0; i < allSongs.length; i++)
                    {
                        if(allSongs[i].getTitle().equals(token[1]))
                        {
                            this.roadTripPL.enqueue(allSongs[i]);
                            break;
                        }
                    }
                }

            }
            input.close();
        }

        // exception handling
        catch (FileNotFoundException e) 
        {
            System.out.println("File not found!");
        }
    }

    /**
     * @return the favoritePL
     */
    public Queue<SongEntry> getFavoritePL()
    {
        return favoritePL;
    }

    /**
     * @param favoritePL the favoritePL to set
     */
    public void setFavoritePL(Queue<SongEntry> favoritePL)
    {
        this.favoritePL = favoritePL;
    }

    /**
     * @return the roadTripPL
     */
    public Queue<SongEntry> getRoadTripPL()
    {
        return roadTripPL;
    }

    /**
     * @param roadTripPL the roadTripPL to set
     */
    public void setRoadTripPL(Queue<SongEntry> roadTripPL)
    {
        this.roadTripPL = roadTripPL;
    }

    /**
     * @return the loungePL
     */
    public Queue<SongEntry> getLoungePL()
    {
        return loungePL;
    }

    /**
     * @param loungePL the loungePL to set
     */
    public void setLoungePL(Queue<SongEntry> loungePL)
    {
        this.loungePL = loungePL;
    }

}
