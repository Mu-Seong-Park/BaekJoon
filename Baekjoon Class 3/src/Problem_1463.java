import java.io.*;
import java.util.*;

public class Problem_1463 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[n+1];
		
		if(n >= 2)
		{
			dp[2] = 1;
		}
		if(n >= 3)
		{
			dp[3] = 1;
		}
		
		int min = -1;
		for(int i = 4 ; i <= n ; i++)
		{
			min = Integer.MAX_VALUE;
			int temp;
			if(i % 2 == 0)
			{
				temp = i / 2;
				min = Math.min(min,dp[temp]);
				temp = i - 1;
				min = Math.min(min,dp[temp]);
				if(i % 6 == 0)
				{
					temp = i / 3;
					min = Math.min(min,dp[temp]);
				}
				//6으로 나누어 떨어질 때 3도 함께 비교해줘야함.
			}
			else if(i % 3 == 0)
			{
				temp = i / 3;
				min = Math.min(min,dp[temp]);
				temp = i - 1;
				min = Math.min(min,dp[temp]);
			}
			else
			{
				temp = i - 1;
				min = Math.min(min,dp[temp]);
			}
		
			
			dp[i] = min + 1;
		}
		
		System.out.println(Integer.toString(dp[n]));
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}
