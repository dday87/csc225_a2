package jsjf;
import java.util.ArrayDeque;
public class Driver {

	public static void main(String[] args) 
	{
		/* Assignment 2 - Question 3
		 * Implemented a Deque using Arrays from the class ArrayDeque in the java library
		 * 
		 */
		ArrayDeque<String> myDeque = new ArrayDeque<String>(10);
		myDeque.addFirst("element 1");
		myDeque.addFirst("element 2");
		myDeque.addFirst("element 3");
		myDeque.addFirst("element 4");
		myDeque.addFirst("element 5");
		myDeque.addLast("element 6");
		myDeque.addLast("element 7");
		myDeque.addLast("element 8");
		myDeque.addLast("element 9");
		myDeque.addLast("element 10");
		myDeque.addLast("element 11");
		System.out.println(myDeque.toString());
		
		/* 
		 * Assignment 2 - Question 4 - Part b
		 * Create a system using a queue to test if a string is a palindrome
		 */
		
		String palindrome = "hannah";						// Play with this string to test the output, it works!!!
		String tester = "";
		System.out.println(palindrome);
		final int h = palindrome.length();					// I had to really edit the CircularArrayQueue Class and QueueADT to get the class to except char
		CircularArrayQueue myPalindromeTester = new CircularArrayQueue(h);
		CircularArrayQueue temp = new CircularArrayQueue(h);
		for(int i = 0; i < h;i++)
		{
			myPalindromeTester.enqueue(palindrome.charAt(i));
		}
		System.out.println(myPalindromeTester.toString());
		char[] tempArray = new char[h+1];
		for(int i = h; i > 0; i--)
		{
			tempArray[i] = myPalindromeTester.dequeue();
			
		}
		for(int index = 1; index <= h; index++)
		{
			char j = tempArray[index];
			temp.enqueue(j);
		}
		tester = temp.toString();							// I have succeeded in reversing the order of the queue
		System.out.println(tester);
		System.out.println(palindrome);
	    if(tester.equalsIgnoreCase(palindrome) || tester == palindrome)
	    {
			System.out.println("This string is a palindrome!!!!");
		}
		else
		{
			System.out.println("This string is not a palindrome!!!!");
		}	 
		
	}
		
}


