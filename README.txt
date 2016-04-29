project folder:
guptaNswati-prject04

Brief description of submitted files:

cs1c/MillionSongDataSubset.java
    - One object of class MillionSongDataSubset parses a JSON data set and stores each entry in an array.

cs1c/SongEntry.java
    - One object of class SongEntry stores a simplified version of the genre data set from the Million Song Dataset.

cs1c/TimeConverter.java
    - Converts duration into a string representation.
    
queues/LinkedList.java
    - a generic LinkedList of Node objects that adds to the back of queue and removes first from queue

queues/Queue.java
    - Objects of type Queue manage generic items in a singly linked list for enqueue() from the front and dequeue() items from the end of the queue
    - Have two inner classes, Node class and QueueIterator class for iterating on Objects of Queue.

queues/Jukebox.java
    - An object of type Jukebox reads the input file to fill three Queue objects with SongEntry items.
    

src.stacks/MyTunes.java  
    - Creates an object of type MyTunes which simulates a playlist queue.
    - Enqueues and dequeues SongEntry objects from each playlist. 
    - Simulates playing each song and finally checks the state of each playlist.
    - Tests the implementation of Queue.java and Jukebox.java


lib/json-simple-1.1.1.jar
    - Java toolkit for JSON (JavaScript Object Notation) used to encode or decode JSON text.
    - https://code.google.com/p/json-simple/downloads/list
    
   
resources/tunes.txt
   - contains list of links

resources/tunes_empty.txt
   - contains empty playlist for testing boundary cases

resources/tunes_truncated.txt   
   - contains a small playlist for testing edge cases
 
resources/music_genre_subset.json
   - contains songs in json format  

resources/RUN.txt
   - console output of MyTunes.java

README.txt
   - description of submitted files
    
    