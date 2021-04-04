import java.io.*;

public class stack10828 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(
				new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		Stack2 stack = new Stack2(10000);
		
		String[] s = new String[2];
		for(int i = 0 ; i < n ; i++)
		{
			s = bf.readLine().split(" ");
			if(s[0].equals("push"))
			{
				stack.push(Integer.parseInt(s[1]));
			}
			else if(s[0].equals("pop"))
			{
				System.out.println(stack.pop());
			}
			else if(s[0].equals("size"))
			{
				System.out.println(stack.getSize());
			}
			else if(s[0].equals("empty"))
			{
				System.out.println(stack.check_Empty());
			}
			else if(s[0].equals("top"))
			{
				System.out.println(stack.top());
			}
		}
		
		bf.close();
	}

}

class Stack2{
	
	Object[] stack;
	int index = -1;
	int size;
	
	Stack2(int size)
	{
		this.size = size;
		this.stack = new Object[size];
	}
	
	public void push(int x)
	{
		if(isFull())
		{
			throw new StackOverflow();
		}
		
		stack[++index] = x;
	}
	
	public Object pop()
	{
		Object temp;
		
		if(isEmpty())
		{
			temp = -1;
			return temp;
		}
		
		temp = stack[index--];
		
		return temp;
	}
	
	public Object top()
	{
		Object temp;
		
		if(isEmpty())
		{
			temp = -1;
			return temp;
		}
		
		temp = stack[index];
		
		return temp;
	}
	
	public int getSize()
	{
		return index + 1;
	}
	
	public boolean isFull()
	{
		if(index == size - 1)
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
		if(index == - 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int check_Empty()
	{
		int temp;
		if(index == -1)
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
	
	static class StackOverflow extends RuntimeException
	{
		
	}
	
}
