package src.queues;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import src.cs1c.SongEntry;

public class Jukebox
{
    private Queue<SongEntry> favoritePL;
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

    private Queue<SongEntry> roadTripPL;
    private Queue<SongEntry> loungePL;
    
    Jukebox()
    {        
        this.favoritePL = new Queue<SongEntry>("Favorites");
        this.roadTripPL = new Queue<SongEntry>("road trip");
        this.loungePL = new Queue<SongEntry>("lounge");       
     }

    public void fillPlaylists(String requestFile, SongEntry[] allSongs)
    {
        try 
        {
            Scanner input = new Scanner (new File(requestFile));

            while(input.hasNextLine())
            {
                String[] token = input.nextLine().split(",");
                
                switch(token[0])
                {
                
                case "favorites" : this.favoritePL.enqueue(new SongEntry(token[1]));
                case "lounge" : this.loungePL.enqueue(new SongEntry(token[1]));
                case "road trip" : this.roadTripPL.enqueue(new SongEntry(token[1]));
                }
                
                
//                if(token[0].equals("lounge"))
//                {
//                    this.loungePL.enqueue(token[1]);
//                    
                }
            input.close();
        }

        // exception handling
        catch (FileNotFoundException e) 
        {
            System.out.println("File not found!");
        }
    }

}
