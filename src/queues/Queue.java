package src.queues;

import java.util.Iterator;


public class Queue<T> extends LinkedList<T> implements Iterable <T>
{
        private String name;
        private Node head;
        private Node tail;

        /**
         * @param top the top to set
         */
        public void setHead(Node top)
        {
            this.head = top;
        }

        /**
         * @return the top
         */
        @Override
        public Node getHead()
        {
            return head;
        }
        
        public void setTail(Node tail)
        {
            // TODO Auto-generated method stub
            this.tail = tail;            
        }

        Queue(String name)
        {
            this.name = name;    
            setHead(super.getHead());
            setTail(super.getTail());
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
         * This method should return the generic item dequeue-ed.
         */
        public T dequeue()
        {
//            if (super.isEmpty())
//            {
//                System.err.println("Empty Queue");
//                return null;
//            }        
            return super.removeFirst();
        }

        /**
         * Looks at the object at the top of this queue without removing it
         */
        public T peek()
        {
            if(super.isEmpty())
            {
                System.out.println("Empty Queue");
                return null;
            }
            return this.head.getData();        
        }

        // for emptying current stacklist
        public void emptyStackList()
        {      
            while(!super.isEmpty())
            {
                this.dequeue();
            }
        }

        @Override
        public Iterator<T> iterator()
        {
            // TODO Auto-generated method stub
            return new StackIterator();
        }
        /**
         * inner Node class having generic data
         * @author swati
         *
         */
        public class Node
        {
            private T data; 
            Node next;
            private Node prev;

            public Node(T element, Node next, Node prev) 
            {
                this.data = element;
                this.next = next;
                this.setPrev(prev);
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

            public Node getPrev()
            {
                return prev;
            }

            public void setPrev(Node prev)
            {
                this.prev = prev;
            }
        }

        /**
         * provides an iterator over the outer generic StackList.
         * @author swati
         *
         */    
        class StackIterator implements Iterator<T>
        {
            /**
             *  A generic field that keeps track of the current location being traversed.
             */
            private Node current;

            public StackIterator() 
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

        public String getName()
        {
            // TODO Auto-generated method stub
            return this.name;
        }
    }
