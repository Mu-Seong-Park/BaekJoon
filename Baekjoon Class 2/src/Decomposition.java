import java.util.*;


public class Decomposition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		n = sc.nextInt();
		int ans = 0;
		
		for(int i = 0 ; i < 1000000 ; i++)
		{
			if(n / 10 == 0)
			{
				if(i * 2 == n)
				{
					ans = i;
					break;
				}
				else
				{
					ans = 0;
				}
			}
			
			else if (n / 10 > 0 && n / 10 < 100 )
			{
				if(i/100 + (i % 100)/10 + i % 10 + i == n)
				{
					ans = i;
					break;
				}
				else
				{
					ans = 0;
				}
			}
			
			else if (n / 10 > 99 && n / 10 < 1000 )
			{
				if(i/1000 + (i % 1000)/100 + (i % 100)/10 + i % 10 + i == n)
				{
					ans = i;
					break;
				}
				else
				{
					ans = 0;
				}
			}
			
			else if (n / 10 > 999 && n / 10 < 10000 )
			{
				if(i/10000 + (i % 10000)/1000 + (i % 1000)/100 + (i % 100)/10 + i % 10 + i == n)
				{
					ans = i;
					break;
				}
				else
				{
					ans = 0;
				}
			}
			
			else if (n / 10 > 9999 && n / 10 < 100000 )
			{
				if(i/100000+ (i % 100000)/10000 + (i % 10000)/1000 + (i % 1000)/100 + (i % 100)/10 + i % 10 + i == n)
				{
					ans = i;
					break;
				}
				else
				{
					ans = 0;
				}
			}
			
			else if (n / 10 > 99999 && n / 10 <= 1000000 )
			{
				if(i/1000000+ (i % 1000000)/100000 + (i % 100000)/10000 + (i % 10000)/1000 + (i % 1000)/100 + (i % 100)/10 + i % 10 + i == n)
				{
					ans = i;
					break;
				}
				else
				{
					ans = 0;
				}
			}
		}
		
		System.out.println(ans);
		sc.close();
	}

}
