import java.util.*;
import java.io.*;

public class Num_Card2_10816 {
	
	public static int binarySearch(List<Integer> pool, int question, int start, int end, int result)
	{
		if(start < 0 || start > end)
		{
			return 0;
		}
		
		int mid = (start + end) / 2;
		if(pool.get(mid) == question)
		{
			result = result + binarySearch(pool, question , mid-1, end, result);
			return 1;
		}
		else if(pool.get(mid) > question)
		{
			binarySearch(pool, question,start, mid - 1, result);
		}
		else 
		{
			binarySearch(pool, question,mid + 1, end, result);
		}
		
		return 0;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(
				new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		List<Integer> pool = new ArrayList<>();
		String[] s = new String[n];
		
		s = bf.readLine().split(" ");
		
		for(int i = 0 ; i < n ; i++)
		{
			pool.add(Integer.parseInt(s[i]));
		}
		
		int m = Integer.parseInt(bf.readLine());
		
		String[] question = new String[m];
		int temp = 0;
		
		question = bf.readLine().split(" ");
		
		Collections.sort(pool);
		int ans = 0;
		
		for(int i = 0 ; i < m ; i++)
		{
			
			temp = binarySearch(pool,Integer.parseInt(question[i]), 0 , pool.size() - 1,0);
			if(i != 0 && pool.get(i) == pool.get(i-1))
			{
				ans += temp;
			}
			else
			{
				);
			}
		}
	
		
		
		bf.close();
		
	}

}
