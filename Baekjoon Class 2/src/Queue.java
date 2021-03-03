
public class Queue {
	private Object[] queue;
	private int size = 0;
	private int rear = -1;
	private int front = -1;
	
	Queue(int size){
		this.size = size;
		this.queue = new Object[size];
	}
	
	public void enQueue(Object data)
	{

		if(rear == size - 1)
		{
			rear = -1;
		}
		if(isFull())
		{
			throw new QueueOverflow();
		}

		queue[++rear] = data;
	}
	
	public Object deQueue() 
	{
		if(front == size - 1)
		{
			front = -1;
		}
		if(isEmpty())
		{
			throw new QueueUnderflow();
		}
		
		++front;
		Object temp = queue[front];
		
		queue[front] = null;
		
		if(isEmpty())
		{
			rear = -1;
			front = -1;
		}
		
		return temp;
	}
	
	public boolean isFull()
	{
		return rear == size - 1 ? true : false;
	}
	
	public boolean isEmpty()
	{
		if(front == rear && front == -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int getSize()
	{
		return size;
	}
	
	static class QueueOverflow extends RuntimeException
	{
		
	}
	
	static class QueueUnderflow extends RuntimeException
	{
		
	}
}
