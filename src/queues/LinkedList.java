package src.queues;

import src.queues.Queue.Node;


/**
 * @class LinkedList [a generic LinkedList of Node objects and its size]
 */
public class LinkedList<T>
{
        // keeps track of the front of the list
        private Node head;
        
        // points to the end of the list
        private Node tail;
        
        // keeps track of the number of nodes in the list
        private int size;

        /**
         *  Creates an new list that is empty.
         */
        public LinkedList()
        {
            this.head = null;
            this.tail = null;
            head.setNext(tail);
            tail.setPrev(head);
            this.size = 0;
        }

        /**
         * Checks if head is pointing to any node.
         */
        public boolean isEmpty()
        {
            return size == 0;
        }

        /**
         * adds the data to the front of list
         * @param data [type: generic, creates new node that is added to front]
         */
        public void addFirst(T element) 
        {
            // TODO: check it 
            Node temp = new Queue<T>("").new Node(element, head, null);
            
            if(head != null ) 
            {
                head.setPrev(temp);                
                
            }
            head = temp;
            
            if(tail == null) 
            { 
                tail = temp;
                
            }
            size++;
            System.out.println("adding: "+element);
        }
        
        /**
         * adds element at the end of the linked list
         * @param element
         */
        public void addLast(T element) {
             
            Node temp = new Queue<T>("").new Node(element, null, tail);
            
            if(tail != null) 
            {
                tail.next = temp;
            }
            tail = temp;
            
            if(head == null) 
            { 
                head = temp;
            }
            size++;
            System.out.println("adding: "+element);
        }
        /**
         * this method removes element from the start of the linked list
         * @return
         */
        public T removeFirst() 
        {
            if (size == 0) 
            {
                System.out.println("List is empty");
                return null;
            }
            Node temp = head;
            head = head.next;
            head.setPrev(null);
            size--;
            System.out.println("deleted: " + temp.getData());
            return (T) temp.getData();
        }
         
        /**
         * this method removes element from the end of the linked list
         * @return
         */
        public T removeLast() 
        {
            if (size == 0)
            {                
                System.out.println("List is empty");            
                return null;
            }
            Node temp = tail;
            tail = tail.getPrev();
            tail.next = null;
            size--;
            System.out.println("deleted: "+ temp.getData());
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

        public Queue<T>.Node getHead()
        {
            // TODO Auto-generated method stub
            return this.head;
        }

        public Queue<T>.Node getTail()
        {
            // TODO Auto-generated method stub
            return this.tail;
        }
    }

