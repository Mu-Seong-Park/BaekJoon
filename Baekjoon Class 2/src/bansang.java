import java.util.*;

public class bansang {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t ;
		
		t = sc.nextInt();
		
		int[] k = new int[t];
		int[] n = new int[t];
		
		for(int i = 0 ; i < t ; i++)
		{
			k[i] = sc.nextInt();
			n[i] = sc.nextInt();
		}
		long nu;
		long deno;
		long ans;
		for(int i = 0 ; i < t ; i++)
		{
			deno = 1;
			nu = 1;
			
			for(int j = 1 ; j < n[i] ; j++)
			{
				deno = deno * (long)j ;
			}
			
			for(int j = 0 ; j < n[i] - 1 ; j++)
			{
				nu = nu * ((long)n[i] + (long)k[i] - (long)j) ;
			}
			
			ans = nu / deno;
			System.out.println(ans);
			
		}
		
		
		sc.close();
	}

}
