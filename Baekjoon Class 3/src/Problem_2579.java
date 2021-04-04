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
			if(threeCheck) // �ٷ� �� �ܰ� ��� �����⿡�� ������ ����� �ö��� �� 3�� ������ ���
			{
				int temp1 = dp[i-3] + stairs[i-2] + stairs[i-1]; // 3�� ������ ���ư��� + 1�� �ǳʶٰ� 2�� �������� ���� ���
				int temp2 = dp[i-2] + stairs[i-1]; // 2�� ������ ���ư��� + 1�� ��� �� ���� �ǳʶٰ� �������� ���� ���
				int max = Math.max(temp1, temp2); // ���߿� ū��
				
				if(temp1 > temp2) // 2�� �������� ��� �ǹǷ� ������ �ٽ� 3�� �����ΰ� üũ�ؾ���.
				{
					dp[i] = temp1;
					threeCheck = true;
				}
				else // 1�� ��� �ǳʶٰ� �ٽ� ��� ������ ���� ���� X
				{
					dp[i] = temp2;
					threeCheck = false;
				}
				
				
			}
			else 
			{
				int max = Math.max(dp[i-1], dp[i-2]); // �������� ���� ��� ������ �������� ����.
				if(max == dp[i-2]) // ���� dp�� ���� ��� 3�������� �׾ ����. 
				{	
					threeCheck = false;
				}
				else // �� dp�� ���� ��� 3�������� ���� �� ����.
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
