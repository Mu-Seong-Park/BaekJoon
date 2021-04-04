import java.util.*;
import java.util.HashMap;
import java.io.*;

public class Problem_1764 { // 1. 시간초과 
	// HashMap의 containsKey는 시간복잡도가 O(1)이지만, containsValue는 시간복잡도가 O(n)이다.
	// containKey는 final Node<K,V> getNode(Object key) 함수를 이용하는데 이게 O(1)만큼 걸리는 것 같고
	// conatinValue는 for문을 돌면서 값을 확인하기 때문에 n만큼 시간이 걸린다.
	// getNode는 나중에 좀 더 보면서 시간복잡도를 확인해보자.

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] temp = new String[2];
		int[] n = new int[2];
		
		temp = bf.readLine().split(" ");
		
		for(int i = 0 ; i < 2 ; i++)
		{
			n[i] = Integer.parseInt(temp[i]);
		}
		
//		String[] heard = new String[n[0]];
//		String[] saw = new String[n[1]];
		HashMap<String,String> list = new HashMap<String,String>(); 
		
		
		for(int i = 0 ; i < n[1] ; i++)
		{
			list.put(bf.readLine(),"heard");
//			saw[i] = bf.readLine();
		}
		
		ArrayList<String> ans = new ArrayList<>();
		
//		for(int i = 0 ; i < n[0] ; i++)
//		{
//			for(int j = 0 ; j < n[1] ; j++)
//			{
//				if(heard[i].equals(saw[j]))
//				{
//					ans.add(heard[i]);
//					break;
//				}
//			}
//		} // 배열로 풀어서 이중포문, 이부분에서 시간초과 생긴듯. => map으로 풀어보자.
		
		
		for(int i = 0 ; i < n[0] ; i++)
		{
			String saw = bf.readLine();
			if(list.containsKey(saw))
			{
				ans.add(saw);
			}
		}
		
		Collections.sort(ans);
	
		System.out.println(ans.size());
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < ans.size(); i++)
		{
			sb.append(ans.get(i)).append("\n");
		}
		System.out.println(sb);
		bf.close();
	}
	
}



