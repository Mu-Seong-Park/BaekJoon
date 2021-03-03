import java.util.*;

public class check_num {
	
	public static boolean binarySearch(int[] numPool, int num, int start, int end) {
		
		boolean ans = false;
	
		if (start > end)
		{
			return ans;
		}
		
		if(num == numPool[(start + end) / 2]) 
		{
			ans = true;
		}
		
		else if (num < numPool[(start + end) / 2])
		{
			end = ((start + end) / 2) - 1;
			ans = binarySearch(numPool, num , start, end);
		}
		
		else if (num > numPool[(start + end) / 2])
		{
			start = ((start + end) / 2) + 1;
			ans = binarySearch(numPool, num , start, end);
		}
		
		return ans;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		int[] numPool = new int[n];
		
		for(int i = 0 ; i < n ; i++)
		{
			numPool[i] = sc.nextInt();
		}
		
		Arrays.sort(numPool);
		
		int m;
		boolean ans;
		m = sc.nextInt();
		
		int[] num = new int[m];
		for(int i = 0 ; i < m ; i++)
		{
			num[i] = sc.nextInt();
		}
		
		
		
		for(int i = 0 ; i < m ; i++)
		{
			ans = binarySearch(numPool, num[i], 0, n-1);
			
			if(ans == true)
			{
				System.out.println(1);
			}
			else
			{
				System.out.println(0);
			}
		}
		
		sc.close();
	
	}

}
