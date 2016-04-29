package queues;

/**
 * @class LinkedList [a generic LinkedList of Node objects and its size]
 */
public class LinkedList<T>
{
    // keeps track of the front of the list
    protected Node head;

    // points to the end of the list
    protected Node tail;

    // keeps track of the number of nodes in the list
    private int size;

    /**
     *  Creates an new list that is empty.
     */
    public LinkedList()
    {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Checks if list is empty
     */
    public boolean isEmpty()
    {
        return size == 0;
    }

    /**
     * adds element at the end of the linked list
     * @param element
     */
    public void addLast(T element)
    {             
        Node temp = new Node(element);

        if (this.size == 0) 
        { 
            head = temp;
            tail = temp;
            size++;
            return;
        }

        tail.setNext(temp);                                    
        tail = temp;
        size++;            
    }
    /**
     * this method removes element from the start of the linked list
     * @return
     */
    public T removeFirst() 
    {
        if (this.size == 0) 
        {
            System.out.println("List is empty");
            return null;
        }

        Node temp = head;
        head = head.next;
        size--;
        return (T) temp.getData();
    }

    /**
     * The number of nodes in the list. 
     */
    public int size() 
    {
        return this.size;
    }

    @Override
    public String toString()
    {
        // Uses a StringBuffer to concatenate strings
        StringBuilder list = new StringBuilder();

        list.append("[");

        Node walker = this.head;

        while (walker != null)
        {
            list.append(walker.getData() + "\n"); 
            walker = walker.getNext();            
        }
        list.append("]");
        return list.toString();  

    }
    
    /**
     * inner Node class having generic data
     * @author swati
     *
     */
    public class Node
    {
        T data; 
        Node next;            

        public Node(T element) 
        {
            this.data = element;
            this.next = null;
        }

        public T getData()
        {
            // TODO Auto-generated method stub
            return this.data;
        }

        public void setNext(Node someNode)
        {
            // TODO Auto-generated method stub
            this.next = someNode;            
        }

        public Node getNext()
        {
            // TODO Auto-generated method stub
            return this.next;
        }

        @Override
        public String toString()
        {
            return this.data.toString();
        }
    }
}



