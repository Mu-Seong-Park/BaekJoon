import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Problem_18870_blog_map_ver {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(
				new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		ArrayList<Integer> pool = new ArrayList();
		int[] ans = new int[n];
		String[] temp = new String[n];
		
		temp = bf.readLine().split(" ");
		for(int i = 0 ; i < n ; i++)
		{

			ans[i] = Integer.parseInt(temp[i]);
		}
		
		
		for(int i = 0 ; i < n ; i++)
		{

			pool.add(Integer.valueOf(ans[i]));
		}
		
		Collections.sort(pool);
		
		Map<Integer, Integer> map = new HashMap<>();
		
		int index = 0;
		
		for(int k : pool)
		{
			if(!map.containsKey(k))
			{
				map.put(k,index++);
			}
		}
		
		
		StringBuilder sb = new StringBuilder();
		
		for(int k : ans)
		{
			sb.append(map.get(k)).append(" ");
		}
		
		System.out.println(sb);
		
		bf.close();
	}

}
