package jsjf;

public class DropoutStack<T> extends LinkedStack<T> {

	
	
	private final int defaultCapacity = 5;
	
	
	private int size;
		
	public DropoutStack()
	{
		size = defaultCapacity;
		
		
	}
	public DropoutStack(int i)
    {
        if(i > 0)
            size = i;
        else
            size = defaultCapacity;
    }
	 public void push(T element)
	    {
		 if(count != size)
		 	{
		 		LinearNode<T> temp = new LinearNode<T>(element);
		        temp.setNext(top);
		        top = temp;
		        count++;
		 	}
		 else
		 	{
		 		LinearNode<T> temp = new LinearNode<T>(element);
		 		temp.setNext(top);
		 		top = temp;
		 		removeEnd();
		 		
		 	}
	    }
	    
	
}
