package queues;
import java.util.Iterator;

/**
 * Objects of type Queue manage generic items in a singly linked list 
 * we can enqueue() from the front and 
 * dequeue() items from the end of the queue
 * @author swati
 * @param <T>
 */

public class Queue<T> extends LinkedList<T> implements Iterable <T>
{
    private String name;

    Queue(String name)
    {
        this.name = name;    
    }

    /**
     *  takes a generic item as the argument and adds the item to the end of the queue.
     */
    public void enqueue(T item)
    {
        addLast(item);
    }

    /**
     * removes the item from the front of the queue. 
     */
    public T dequeue()
    {    
        return removeFirst();
    }

    /**
     * Looks at the object at the top of this queue without removing it
     */
    public T peek()
    {
        if (head != null)
        {
            return head.getData();
        }
        else
            return null;        
    }
   
    public String getName()
    {
        // TODO Auto-generated method stub
        return this.name;
    }

    @Override
    public Iterator<T> iterator()
    {
        // TODO Auto-generated method stub
        return new QueueIterator();
    }
    
    /**
     * provides an iterator over the outer generic Queue
     * @author swati
     *
     */    
    class QueueIterator implements Iterator<T>
    {
        /**
         *  A generic field that keeps track of the current location being traversed.
         */
        private Node current;

        public QueueIterator() 
        {   current = head; }

        @Override
        public boolean hasNext() 
        {
            // check if the next node is valid
            // if node is invalid, return false
            if (current == null)
                return false;

            // otherwise we haven't reached the end of the list
            return true;
        }

        @Override
        public T next() 
        {   
            if (current == null)
            {
                throw new java.util.NoSuchElementException();
            }

            // if we're here, then we're looking at a valid current node
            // so grab the data portion, to give to the caller
            T data = current.data;

            // move in preparation for the next time.
            current = current.next;

            return data;  
        }

        @Override
        public void remove() 
        {
            throw new UnsupportedOperationException();
        }
    }

}
