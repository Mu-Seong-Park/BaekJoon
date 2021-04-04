import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem_2579 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[n+1];
		int[] stairs = new int[n];
		
		
		
		for(int i = 0 ; i < n ; i++)
		{
			stairs[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = 0;
		dp[1] = stairs[0];
		boolean threeCheck = false;
		if(n >= 2)
		{
			dp[2] = dp[1] + stairs[1];
		}
		threeCheck = true;
		
		for(int i = 3 ; i <= n ; i++)
		{
			if(threeCheck) // 바로 전 단계 계단 오르기에서 마지막 계단을 올랐을 때 3개 연속일 경우
			{
				int temp1 = dp[i-3] + stairs[i-2] + stairs[i-1]; // 3개 전으로 돌아가서 + 1개 건너뛰고 2개 연속으로 밟을 경우
				int temp2 = dp[i-2] + stairs[i-1]; // 2개 전으로 돌아가서 + 1개 밟고 그 다음 건너뛰고 마지막걸 밟을 경우
				int max = Math.max(temp1, temp2); // 둘중에 큰거
				
				if(temp1 > temp2) // 2개 연속으로 밟게 되므로 다음에 다시 3개 연속인걸 체크해야함.
				{
					dp[i] = temp1;
					threeCheck = true;
				}
				else // 1개 밟고 건너뛰고 다시 밟기 때문에 연속 걱정 X
				{
					dp[i] = temp2;
					threeCheck = false;
				}
				
				
			}
			else 
			{
				int max = Math.max(dp[i-1], dp[i-2]); // 연속하지 않을 경우 전꺼랑 전전꺼를 비교함.
				if(max == dp[i-2]) // 전전 dp를 밟을 경우 3개연속은 죽어도 없음. 
				{	
					threeCheck = false;
				}
				else // 전 dp를 밟을 경우 3개연속이 생길 수 있음.
				{
					threeCheck = true;
				}
				dp[i] = max + stairs[i-1];
			}
		
		}

		
//		for(int i = 0; i <= n ; i++)
//		{
//			bw.write(Integer.toString(dp[i]) + "\n");
//		}
		bw.write(Integer.toString(dp[n]) + "\n");
		bw.flush();
		bw.close();
		br.close();
		

	}

}

//dp[0] = 0;
//dp[1] = stairs[0];
//boolean threeCheck = false;
//if(n >= 2)
//{
//	dp[2] = stairs[0] + stairs[1];
//	threeCheck = true;
//}
//
//if(n >= 3)
//{
//	if(threeCheck)
//	{
//		int max = Math.max(stairs[0], stairs[1]);
//		if(max == stairs[0])
//		{	
//			threeCheck = true;
//		}
//		else
//		{
//			threeCheck = false;
//		}
//		dp[3] = max + stairs[2];		
//	}
//}
//
//for(int i = 4 ; i <= n ; i++)
//{
//	if(threeCheck)
//	{
//		int temp1 = dp[i-3] + stairs[i-2] + stairs[i-1];
//		int temp2 = dp[i-2] + stairs[i-1];
//		int max = Math.max(temp1, temp2);
//		
//		if(temp1 > temp2)
//		{
//			dp[i] = temp1;
//			threeCheck = true;
//		}
//		else
//		{
//			dp[i] = temp2;
//			threeCheck = false;
//		}
//		
//		
//	}
//	else
//	{
//		int max = Math.max(dp[i-1], dp[i-2]);
//		if((max - dp[i-2]) == 0)
//		{	
//			threeCheck = false;
//		}
//		else
//		{
//			threeCheck = true;
//		}
//		dp[i] = max + stairs[i-1];
//	}
//
//}
