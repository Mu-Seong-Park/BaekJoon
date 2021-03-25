import java.io.*;
import java.util.ArrayList;

//���� 1874��
public class stack_sequence {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> ans = new ArrayList();
		int n;
		
		n = Integer.parseInt(bf.readLine());
		
		Stack1 stack = new Stack1(n);
		int[] seq = new int[n];
		int temp = -1;	
		
		for(int i = 0 ; i < n ; i++)
		{
			seq[i] = Integer.parseInt(bf.readLine());
		}
		
		
			
		for(int i = 1 ; i < n + 1 ; i++)
		{
			stack.push(i);
			ans.add("+");
			for(int j = 0 ; j < i ; j++)
			{
				temp = stack.pop();
				stack.push(temp);
				if(temp < seq[j])
				{
					break;
				}
				else if(temp == seq[j])
				{
					stack.pop();
					ans.add("-");
					if(stack.getIndex() == -1)
					{
						break;
					}
				}
				
			}
			
		}
		
		for(String x:ans)
		{
			if(stack.getIndex() != -1)
			{
				System.out.println("NO");
				break;
			}
			else
			{
				System.out.println(x);
			}
		}
		
		
	
		bf.close();
	}

}

class Stack1
{
	private int[] stack;
	private int size = 0;
	private int index = -1;
	
	Stack1(int size){
		this.size = size;
		this.stack = new int[size];
	}
	
	public void push(int data)
	{
		if(isFull())
		{
			throw new StackOverflow();
		}
		stack[++index] = data;
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			throw new StackUnderflow();
		}
		
		int temp = stack[index--];
		return temp;
	}
	
	public boolean isEmpty()
	{
		if(index == -1)
		{
			return true;
		}
		return false;
	}
	
	public boolean isFull()
	{
		if(index == (size-1))
		{
			return true;
		}
		
		return false;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public int getIndex()
	{
		return index;
	}
	
	static class StackOverflow extends RuntimeException
	{
		
	}
	
	static class StackUnderflow extends RuntimeException
	{
		
	}
	
}