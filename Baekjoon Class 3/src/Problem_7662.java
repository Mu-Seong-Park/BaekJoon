import java.util.*;
import java.io.*;
import java.util.Map;
import java.util.HashMap;

public class Problem_7662 {// 잘못 생각했음 다시 풀자.

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(bf.readLine());
		String[] temp = new String[t];
		int[] q = new int[t];
		
		for(int i = 0 ; i < t ; i++)
		{
			q[i] = Integer.parseInt(temp[i]);
		}
		
		for(int i = 0 ; i < t ; i++)
		{
			// 이중 우선순위 큐 생성.
			for(int j = 0 ; j < q[i] ; j++)
			{
				q[i] = Integer.parseInt(temp[i]);
			}
			// 큐 내용물이 존재하는지 없는지 확인하고 EMPTY 혹은 존재하면 값 출력하기
			
		}
		
		bf.close();
	}
	
	

}

class DualQueue
{
	int size = 0;
	int negative = 0;
	int positive = 0;
	private Map<Integer,Integer> myQueue;
	
	DualQueue(int size)
	{
		this.size = size;
		myQueue= new HashMap<>(size);
	}
	
	void push(int n)
	{
		for(int i = 0 ; i < size ; i++)
		{
			if(!myQueue.containsKey(0))
			{
				myQueue.put(n,0);
			}
			else 
			{
				if(n > myQueue.get(positive))
				{
					myQueue.put(n,++positive);
				}
				else if(n < myQueue.get(negative))
				{
					myQueue.put(n,--negative);
				}
				else
				{
					myQueue.put(n, 0);
				}	
			}
		}
	}
	
	void delete_negative()
	{
		
		if(myQueue.containsKey(negative))
		{
				
			
		}
		
		negative++;
		
	}
	
	void delete_positive(int n)
	{
		
	}
}
