import java.util.*;
import java.io.*;
import java.util.Map;
import java.util.HashMap;

public class Problem_1003 { // 메모리 초과 틀림.

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(
				new InputStreamReader(System.in));
		
		
		int n = Integer.parseInt(bf.readLine());
		
		for(int i = 0 ; i < n ; i++)
		{
			int k = Integer.parseInt(bf.readLine());
			int[] ans = new int[2];
			
			ans = fibonacci_check(k);
			System.out.println(ans[0] + " "+ans[1]);
		}
		
	}
	
	public static int[] fibonacci_check(int n)
	{
		int[] zero_one = new int[2];
		int ans = 0;
		if(n == 0)
		{
			zero_one[0]++;
			return zero_one;
		}
		else if ( n == 1)
		{
			zero_one[1]++;
			return zero_one;
		}
		
		else
		{
			zero_one = fibonacci_check(n-1);
			int[] zero_one2 = zero_one.clone();
			zero_one2 = fibonacci_check(n-2);
			zero_one[0] = zero_one2[0] + zero_one[0];
			zero_one[1] = zero_one2[1] + zero_one[1];
			
			return zero_one;
		}
		

	}
	


}
