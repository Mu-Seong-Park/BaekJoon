import java.io.*;
import java.util.*;

public class Problem_17626 {// �׸���δ� ���� ��ǰ.
	//���̵��� �¾Ҵµ� ��������� ���� ��α� ����.
	//https://steady-coding.tistory.com/18

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(
				new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		
		int[] pool = new int[n+1];
		
		pool[0] = 0;
		pool[1] = 1;
		int min = -1;
		
		for(int i = 2 ; i <= n ; i++)
		{
			min = Integer.MAX_VALUE;
			
			for(int j = 1 ; j * j <= i ; j++)
			{
				int temp = i - j*j;
				min = Math.min(min,pool[temp]);
			}
			// i���� i���� ���� ���������� �� dp[i - j * j] ��
            // �ּҸ� ���Ѵ�.
			
			pool[i] = min+1;
		}
		

		bw.write(Integer.toString(pool[n]));
		bw.flush();
		bf.close();
		bw.close();
		
	}
	
	

}

//if(n == 0)
//{
//	x = 1;
//	System.out.println("0ȣ��");
//}
//else if( n - 1 < 3)
//{
//	x = 1 * n ;
//	System.out.println("1ȣ��");
//	
//}
//else
//{
//	System.out.println("2ȣ��");
//	x = (int)Math.sqrt(n);
//	temp = n - x*x;
//	if(temp > 0 && temp < 4)
//	{
//		x = 1 + FourSquares(temp);
//	}
//	else if(temp == 0)
//	{
//		x = FourSquares(temp);
//	}
//	else
//	{
//		x = FourSquares((x-1)*(x-1));
//	}
//}

//public static void main(String[] args) throws IOException{
//	BufferedReader bf = new BufferedReader(
//			new InputStreamReader(System.in));
//	
//	int n = Integer.parseInt(bf.readLine());
//	
//	int k = (int)Math.sqrt((double)n);
//	int ans = 0;
//	int ans2 = -1;
//	
//	for(int i = k ; i > 0 ; i--)
//	{
//		if((n%(i*i))==0)
//		{
//			ans2 = n / (i * i);
//			break;
//		}
//	}
//	
//		
//	for(int i = k ; i > 0 ; i--)
//	{
//		
//		
//		n = n - (i*i);
//		if(n < 0)
//		{
//
//			n = n + (i*i);
//		}
//		else if(n > 0)
//		{
//
//			ans++;
//		}
//		else if(n == 0)
//		{
//
//			ans++;
//			break;
//		}
//		if((n % (i*i)) == 0)
//		{
//
//			ans = ans + (n / (i*i));
//			break;
//		}
//		
//	}
//	
//	if(ans > ans2 && ans2 != -1)
//	{
//		System.out.println(ans2);
//	}
//	else
//	{
//		System.out.println(ans);
//	}
//	bf.close();
//	
//}