import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem_6064 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		
		int cnt = Integer.parseInt(br.readLine());
		String[] temp = new String[4];
		
		long n,m,x,y;

		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < cnt ; i++)
		{
			long year = -1;
			
			temp = br.readLine().split(" ");
			m = Integer.parseInt(temp[0]);
			n = Integer.parseInt(temp[1]);
			x = Integer.parseInt(temp[2]);
			y = Integer.parseInt(temp[3]);
			
			
			if (x == 1 && y == 1)
			{
				year = 1;
			}
			else if(m == n && m == x && x == y)
			{
				year = x;
			}
			else if(x == m && y == n && x % y == 0)
			{
				if ( x > y)
				{
					year = x;
				}
				else
				{
					year = y;
				}
			}
			else if(x == m && y == n)
			{
				if(x % 2 == 0 && y % 2 == 0)
				{
					year = x * y / 2;
				}
				else
				{
					year = x * y;
				}
			}
			else
			{
				if(n == y)
				{
					y = 0;
				}
				else if(m == x)
				{
					x = 0;
				}
				if(m % n != 0)
				{
					for(int j = 0 ; j < n ; j++)
					{
						
//						long a = (j % n) * (m % n) + (x % n);
						long a = j * m + x;
						if((a % n) == y)
						{
							year = j * m + x;
							break;
						}
					}
				}
				else if(n % m != 0)
				{
					for(int j = 0 ; j < m ; j++)
					{
//						long a = (j % m) * (n % m) + (y % m);
						long a = j * n + y;
						if((a % m) == x)
						{
							year = j * n + y;
							break;
						}
					}
				}
			}
			
			if(year == -1)
			{
				sb.append("-1").append("\n");
			}
			else
			{
				sb.append(year).append("\n");
			}
		}
		System.out.println(sb);
		br.close();
	}

}