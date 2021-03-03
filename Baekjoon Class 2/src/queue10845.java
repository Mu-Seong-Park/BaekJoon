import java.io.*;


public class queue10845 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(
				new InputStreamReader(System.in));
		
		String[] s = new String[2];
		Queue2 queue = new Queue2(10000);
		
		int n = Integer.parseInt(bf.readLine());
		
		for(int i = 0 ; i < n ; i++)
		{
			s = bf.readLine().split(" ");
			if(s[0].equals("push"))
			{
				queue.push(Integer.parseInt(s[1]));
			}
			else if(s[0].equals("pop"))
			{
				System.out.println(queue.pop());
			}
			else if(s[0].equals("size"))
			{
				System.out.println(queue.getSize());
			}
			else if(s[0].equals("empty"))
			{
				System.out.println(queue.check_empty());
			}
			else if(s[0].equals("front"))
			{
				System.out.println(queue.print_front());
			}
			else if(s[0].equals("back"))
			{
				System.out.println(queue.print_end());
			}
			
		}
	}

}

class Queue2{
	int front = -1;
	int end = -1;
	Object[] queue;
	int size;
	
	Queue2(int size)
	{
		this.size = size;
		this.queue = new Object[size];
	}
	
	public void push(Object x)
	{
		if(isFull())
		{
			throw new QueueOverflow();
		}

		queue[++end] = x;
	}
	
	public Object pop()
	{
		Object temp;
		
		if(isEmpty())
		{
			temp = -1;
			return temp;
		}
		
		temp = queue[++front];
		
		queue[front] = null;
		
		if(isEmpty())
		{
			end = -1;
			front = -1;
		}
		
		return temp;
	}
	
	public Object print_front()
	{
		Object temp;

		if(isEmpty())
		{
			temp = -1;
			return temp;
		}
		int index = front;
		temp = queue[++index];
		
		return temp;
	}
	
	public Object print_end()
	{
		Object temp;
		
		if(isEmpty())
		{
			temp = -1;
			return temp;
		}
		
		temp = queue[end];
		
		return temp;
	}
	
	public boolean isFull()
	{
		return end == size - 1 ? true : false;
	}
	
	public boolean isEmpty()
	{
		if(front == end)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int check_empty()
	{
		int temp;
		if(front == end && front == -1)
		{
			temp = 1;
			return temp;
		}
		else
		{
			temp = 0;
			return temp;
		}
	}
	
	public int getSize()
	{
		
		int temp = end - front;
		
		return temp;
	}
	
	static class QueueOverflow extends RuntimeException
	{
		
	}
	
	static class QueueUnderflow extends RuntimeException
	{
		
	}
	
	
}
