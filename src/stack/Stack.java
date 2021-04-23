/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;
import java.util.*;
/**
 *
 * @author Adjeman-Cofie Gerald
 */
public class Stack {

    /**
     * @param args the command line arguments
     */
    
     // store elements of stack
  int elements[];
  // represent top of stack
  int top;
  // total capacity of the stack
  int capacity;

  // Creating a stack
  Stack(int size) {
    // initialize the array
    // initialize the stack variables
    elements = new int[size];
    capacity = size;
    top = -1;
  }

  // push elements to the top of stack
  public void push(int x) {
    if (isFull()) {
      System.out.println("Stack is Full");

      System.exit(1);
    }

    // insert element on top of stack
    System.out.println("Inserting " + x);
    elements[++top] = x;
  }

  // pop elements from top of stack
  public int pop() {

    // if stack is empty
    // no element to pop
    if (isEmpty()) {
      System.out.println("Stack is empty!");
     System.exit(1);
    }

    // pop element from top of stack
    return elements[top--];
  }

  // return size of the stack
  public int getSize() {
    return top + 1;
  }

  // check if the stack is empty
  public Boolean isEmpty() {
    return top == -1;
  }

  // check if the stack is full
  public Boolean isFull() {
    return top == capacity - 1;
  }

  // display elements of stack
  public void printStack() {
    for (int i = 0; i <= top; i++) {
      System.out.print(elements[i] + ", ");
    }
  }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
         Stack stack = new Stack(10);
         Scanner Gerald = new Scanner(System.in);
         int capa;
         int elements;
         System.out.println("Please specify the capacity of the stack");
        capa = Gerald.nextInt();
         System.out.println("Please enter the elements ");
         
         int count =1;
        int node;
        while (count<=capa) {
            //System.out.println("Please enter the nodes ");
             System.out.println("Element: " +count);
            elements= Gerald.nextInt();
            //Inserting the nodes
            stack.push(elements);
            count++;
        }
         

   /* stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(8);
    stack.push(7);
    stack.push(5);*/

    System.out.print("Stack: ");
    stack.printStack();
    System.out.print("\n");
    System.out.print("--------------------------------------");

    // remove last element inserted from stack
    stack.pop();
    System.out.println("\nAfter popping out last element stacked");
    stack.printStack();
    System.out.print("\n");
    System.out.print("--------------------------------------");
    
    stack.pop();
     System.out.println("\nAfter popping out current element on top");
    stack.printStack();
    System.out.print("\n");  
    System.out.print("--------------------------------------\n");
    }
    
}
