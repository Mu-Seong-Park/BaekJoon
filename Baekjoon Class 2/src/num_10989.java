import java.io.*;
import java.util.*;

public class num_10989 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
//		ArrayList<Short> num_pool = new ArrayList<Short>();
		int[] num_pool = new int[n];
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < n ; i++)
		{
			num_pool[i] = Integer.parseInt(bf.readLine());
//			num_pool.add((short)Integer.parseInt(bf.readLine()));
		}

		Arrays.sort(num_pool);
//		Collections.sort(num_pool);
		
		for(int i = 0 ; i < n ; i++)
		{
			sb.append(num_pool[i]).append("\n");
//			System.out.println(num_pool.get(i));
		}
		
		System.out.println(sb);	
		bf.close();
	}

}
