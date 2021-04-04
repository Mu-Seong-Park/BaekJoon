import java.util.*;
import java.io.*;

public class Problem_18870 {// 시간초과로 틀림.

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(
				new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		ArrayList<Integer> pool = new ArrayList();
		String[] ans = new String[n];
		
		ans = bf.readLine().split(" ");
		
		
		for(int i = 0 ; i < n ; i++)
		{

			pool.add(Integer.valueOf(ans[i]));
		}
		
		Collections.sort(pool);
		
		StringBuilder sb = new StringBuilder();
		int temp = 0;
		int k = 0;
		for(int i = 0 ; i < n ; i++)
		{
			int x = pool.get(i);
			
			if(i == 0)
			{
				sb.append(k);
				
			}
			else if(i != 0 && x == temp)
			{
				sb.append(k);
			}
			else
			{
				sb.append(++k);
			}
			
			temp = pool.get(i);
		}
		
		StringBuilder sb2 = new StringBuilder();
		
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = 0 ; j < n ; j++)
			{
				if(ans[i].equals(Integer.toString(pool.get(j))))
				{
					sb2.append(sb.charAt(j)).append(" ");
					break;
				}
			}
		}
		
		System.out.println(sb2);
		
		bf.close();
	}

}
