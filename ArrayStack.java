package jsjf;
/*
 * @editedBy Matthew J. McKay
 * @university Thompson Rivers University
 * @assignment2_PP12.4
 */
import java.util.Arrays;


import jsjf.StackADT;

public class ArrayStack<T> implements StackADT<T>
{
   private final int DEFAULT_CAPACITY = 100;
   private int top;		 // indicates the actual top of the stack
   private int openSlot; // indicates the next open slot
   private T[] stack; 

   //-----------------------------------------------------------------
   //  Creates an empty stack using the default capacity.
   //-----------------------------------------------------------------
   @SuppressWarnings("unchecked")
public ArrayStack()
   {
	  openSlot = 0;
      top = -1;
      stack = (T[])(new Object[DEFAULT_CAPACITY]);
   }

   //-----------------------------------------------------------------
   //  Creates an empty stack using the specified capacity.
   //-----------------------------------------------------------------
   @SuppressWarnings("unchecked")
public ArrayStack (int initialCapacity)
   {
	  openSlot = 0;
	  top = -1;
      stack = (T[])(new Object[initialCapacity]);
   }

   //-----------------------------------------------------------------
   //  Adds the specified element to the top of the stack, expanding
   //  the capacity of the stack array if necessary.
   //-----------------------------------------------------------------
   public void push (T element)
   {
      if (size() == stack.length) 
         expandCapacity();

      stack[openSlot] = element;
      openSlot++;
      top++;
   }
 //-----------------------------------------------------------------
   //  Creates a new array to store the contents of the stack with
   //  twice the capacity of the old one.
   //-----------------------------------------------------------------
   private void expandCapacity()
   {
      stack = Arrays.copyOf(stack, stack.length*2);
   }

   //-----------------------------------------------------------------
   //  Removes the element at the top of the stack and returns a
   //  reference to it. Throws an EmptyStackException if the stack
   //  is empty.
   //-----------------------------------------------------------------
   public T pop() throws EmptyCollectionException
   {
      if (isEmpty())
         throw new EmptyCollectionException("stack");

      
      T result = stack[top];
      stack[top] = null; 
      top--;
      openSlot--;
      return result;
   }
   
   //-----------------------------------------------------------------
   //  Returns a reference to the element at the top of the stack.
   //  The element is not removed from the stack.  Throws an
   //  EmptyStackException if the stack is empty.  
   //-----------------------------------------------------------------
   public T peek() throws EmptyCollectionException
   {
       if (isEmpty())
         throw new EmptyCollectionException("stack");
	

       return stack[top];
   }

   //-----------------------------------------------------------------
   //  Returns true if the stack is empty and false otherwise. 
   //-----------------------------------------------------------------
   public boolean isEmpty()
   {
	return (openSlot == 0);
   }
 
   //-----------------------------------------------------------------
   //  Returns the number of elements in the stack.
   //-----------------------------------------------------------------
   public int size()
   {
	return openSlot;
   }

   //-----------------------------------------------------------------
   //  Returns a string representation of the stack. 
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = "";

      for (int index=0; index < openSlot; index++) 
         result = result + stack[index].toString() + "\n";

      return result;
   }

}