import java.io.*;
import java.util.*;

public class Problem_11726 {
	//DP는 규칙찾기가 중요하다.
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[n+1];
		
		dp[1] = 1;
		if(n >= 2)
		{
			dp[2] = 2;
		}
		
		if(n >= 3)
		{
			dp[3] = 3;
		}
		
		for(int i = 4 ; i <= n ; i++)
		{
			dp[i] = ((dp[i-2] * 2) + dp[i-3]) % 10007;
			
		}
		
		bw.write(Integer.toString(dp[n]));
		
		bw.flush();
		br.close();
		bw.close();

	}

}
