import java.io.*;
import java.util.*;



public class Problem_10866 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader bf = new BufferedReader(
				new InputStreamReader(System.in));
		
		String[] s = new String[2];
		my_Deque deque = new my_Deque(10000);
		
		int n = Integer.parseInt(bf.readLine());
		
		for(int i = 0 ; i < n ; i++)
		{
			s = bf.readLine().split(" ");
			if(s[0].equals("push_front"))
			{
				deque.push_front(Integer.parseInt(s[1]));
			}
			else if(s[0].equals("push_back"))
			{
				deque.push_back(Integer.parseInt(s[1]));
			}
			else if(s[0].equals("pop_front"))
			{
				System.out.println(deque.pop_front());
			}
			else if(s[0].equals("pop_back"))
			{
				System.out.println(deque.pop_back());
			}
			else if(s[0].equals("size"))
			{
				System.out.println(deque.getSize());
			}
			else if(s[0].equals("empty"))
			{
				System.out.println(deque.ask_Empty());
			}
			else if(s[0].equals("front"))
			{
				System.out.println(deque.front());
			}
			else if(s[0].equals("back"))
			{
				System.out.println(deque.back());
			}
			
		}
	}

}

class my_Deque
{
	private Object[] my_Deque;
	private int size = 0;
	private int rear = -1;
	private int front = -1;
	private int data_memory_size = 0;
	my_Deque(int size){
		this.size = size;
		this.my_Deque = new Object[size];
	}
	
	public void push_front(Object data)
	{
		if(isFull())
		{
			throw new DequeOverflow();
		}
		
		if(front == -1 && rear != -1)
		{
			front = size - (rear + 1);
			my_Deque[front] = data;
		}
		else if(front == -1 && rear == -1)
		{
			front = 9999;
			my_Deque[front] = data;
		}
		else
		{
			my_Deque[--front] = data;
		}
		data_memory_size++;
	}
	
	public void push_back(Object data)
	{
		if(isFull())
		{
			throw new DequeOverflow();
		}
		
		my_Deque[++rear] = data;
		data_memory_size++;
	}
	
	public Object pop_front()
	{
		Object temp;
		
		if(isEmpty())
		{
			temp = -1;
			return temp;
		}
		
		temp = my_Deque[front];
		
		my_Deque[front] = null;
		front++;
		if(front == 10000)
		{
			front = -1;
		}
		
		if(isEmpty())
		{
			rear = -1;
			front = -1;
		}
		
		data_memory_size--;
		
		return temp;
		
		
		
	}
	
	public Object pop_back()
	{
		Object temp;
		
		if(isEmpty())
		{
			temp = -1;
			return temp;
		}
		
		if(!isEmpty() && rear == -1)
		{
			rear = front;
		}
		temp = my_Deque[rear];
		
		my_Deque[rear] = null;
		rear--;
		
		if(isEmpty())
		{
			rear = -1;
			front = -1;
		}

		data_memory_size--;
		return temp;
	}
	
	public Object front()
	{
		Object temp;
		
		if(isEmpty())
		{
			temp = -1;
			return temp;
		}
		
		temp = my_Deque[front];
	
		
		return temp;
	}
	
	public Object back()
	{
		Object temp;
		
		if(isEmpty())
		{
			temp = -1;
			return temp;
		}
		temp = my_Deque[rear];
		
		return temp;
	}
	
	public boolean isFull()
	{
		if(data_memory_size == size)
		{
			return true;
		}
		else
		{
			return false;
		}
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
	
	public int ask_Empty()
	{
		if(front == rear && front == -1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public int getSize()
	{
		
		return data_memory_size;
	}
	
	static class DequeOverflow extends RuntimeException
	{
		
	}
	
	static class DequeUnderflow extends RuntimeException
	{
		
	}
	
	
	
	
	
	
}
