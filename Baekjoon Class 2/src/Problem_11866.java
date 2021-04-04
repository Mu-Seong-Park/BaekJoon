import java.io.*;
import java.util.*;
import java.util.Queue;
public class Problem_11866 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = new String[2];
		
		str = bf.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		
		int k = Integer.parseInt(str[1]);
		
		int cnt = 1;
		int check = 0;
		boolean[] people = new boolean[n];
		Queue<Integer> ans = new LinkedList<>();
		for(int i = 0 ; i < n ; i++)
		{
			people[i] = true;
		}
		int i = 0;
		while(true)
		{
			
			if(i >= n)
			{
				i = 0;	
			}
			if(cnt == k)
			{
				if(people[i] == true)
				{
					people[i] = false;
					ans.add(i + 1);
					cnt = 0;
				}
				else
				{
					cnt--;
				}
			}
			else if (cnt != k && !people[i])
			{
				cnt--;
				
			}
			
			if(cnt == 0)
			{
				check++;
			}
			else
			{
				check = 0;
			}
			
			
			cnt++;
			i++;
			if(check > n)
			{
				break;
			}
			
		}
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("<");
		for(int j = 0 ; j < n - 1 ; j++)
		{
			sb.append(ans.poll()).append(", ");

		}
		sb.append(ans.poll()).append(">");
		
		System.out.println(sb);
		bf.close();
			
	}
	
	

}
