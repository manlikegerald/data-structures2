/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qeues;

/**
 *
 * @author Adjeman-Cofie Gerald
 */
public class Qeues<T> {
     private Node<T> front;      //declaring first node
    private Node<T> rear;       //declaring last node

    private int length;         //declaring length variable which gives the size of the queue

    //CREATING NODE CLASS
  private static  class Node<T>
    {
        private final T data;   //declaring variable data which gets value
        private Node<T> next;   //declaring variable next for referencing


        //Constructor to initialize variables
        public Node (T data)
        {

            this.data = data;       //assign gotten data to variable data
            this.next = null;       //assign next node to null
        }

    }

    //INSERTING METHOD
    public void enQueue(T data) {

      //checking for empty queue
        if (front == null)
        {
            rear=  new Node <T>(data);       //create new node and assign to last node
            front =  rear;                  //assign last node to first.
        }else
            //if queue is not empty
        {
            rear.next = new Node <T>(data);     //adding node at the end of the queue
            rear= rear.next;                    //rear increments by 1
        }
        length++;        //size of queue increases
    }

    //DELETING FROM QUEUE METHOD
    public T deQueue(){

      //if queue is not empty
        if (front != null) {
            T result  = front.data;     //assign first value to new variable result
            front  = front.next;        //front points to following node
            length --;                  //size of queue decrements by 1
            return result;
        }
        //if queue is empty
        return null;        // exit system
    }
    //size returning method
    public int size(){
        return length;
    }

    //QUEUE DISPLAYING METHOD
    public void displayQueue(){
        Node <T> currentNode = front;       // assign first to currentNode
        while (currentNode!= null){         //if queue is not empty
            System.out.print(currentNode.data + " ");   //display node data
            currentNode = currentNode.next;         //assign next node to current node


            //display asci symbol after non-last items only
            if(currentNode !=rear.next){
                System.out.print(" <=== ");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Qeues queue = new Qeues();

        //INSERTING VALUES INTO QUEUE
        queue.enQueue("Gari");
        queue.enQueue("Beans");
        queue.enQueue("Korkor");
        queue.enQueue("Pepper");
        queue.enQueue("Oil");
        queue.enQueue("Rice");

        //display welcome message
        System.out.println("-------------------------------------------");
        System.out.println("WELCOME TO DAAVI BEANS. \nPlease eat until you get satisfied");
        System.out.println("-------------------------------------------\n");


        //DISPLAYING SIZE AND VALUES OF THE INITIAL QUEUE
        System.out.println("Initial number of food items in the queue: " + queue.size());
        System.out.println("\nLIST OF FOOD ITEMS IN THE QUEUE: ");
        queue.displayQueue();
        System.out.println("\n");     //next line

        //DELETING ITEM FROM QUEUE AND DISPLAY
        System.out.println( queue.deQueue() + " is more often bought\n");

        //DISPLAYING CURRENT SIZE OF QUEUE
        System.out.println("Current number of food items in the queue " + queue.size());

        //DISPLAYING QUEUE AFTER ITEM IS DELETED IS FROM THE QUEUE
        System.out.println("\nLIST OF FOOD ITEMS LEFT IN QUEUE: ");
        queue.displayQueue();

        System.out.println("\n");   //next line
    }
 }
    
