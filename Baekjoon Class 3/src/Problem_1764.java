import java.util.*;
import java.util.HashMap;
import java.io.*;

public class Problem_1764 { // 1. �ð��ʰ� 
	// HashMap�� containsKey�� �ð����⵵�� O(1)������, containsValue�� �ð����⵵�� O(n)�̴�.
	// containKey�� final Node<K,V> getNode(Object key) �Լ��� �̿��ϴµ� �̰� O(1)��ŭ �ɸ��� �� ����
	// conatinValue�� for���� ���鼭 ���� Ȯ���ϱ� ������ n��ŭ �ð��� �ɸ���.
	// getNode�� ���߿� �� �� ���鼭 �ð����⵵�� Ȯ���غ���.

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
//		} // �迭�� Ǯ� ��������, �̺κп��� �ð��ʰ� �����. => map���� Ǯ���.
		
		
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



