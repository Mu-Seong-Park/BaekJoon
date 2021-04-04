import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem_11727 {

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
			dp[2] = 3;
		}
		
		if(n >= 3)
		{
			dp[3] = 5;
		}
		
		for(int i = 4 ; i <= n ; i++)
		{
			dp[i] = ((dp[i-2] * 3) + (dp[i-3] * 2)) % 10007;
			
		}
		
		bw.write(Integer.toString(dp[n]));
		
		bw.flush();
		br.close();
		bw.close();


	}

}
