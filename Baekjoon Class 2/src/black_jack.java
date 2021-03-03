import java.util.*;

public class black_jack {

	public static int comb(int[] card, boolean[] visited, int start, int r, int sum, int m) {
		int n = card.length;
		int new_sum = 0;
		
		if(r == 0) {

			for(int i = 0; i < n; i++) 
			{
				if(visited[i] == true)
				{
					new_sum = new_sum + card[i];
				}
			}
			
			if(sum == 0)
			{
				sum = new_sum;
			}
			else if(Math.abs(m - sum) > Math.abs(m - new_sum) && m - new_sum >= 0)
			{
				sum = new_sum;
			}
		} 
		else 
		{
			for(int i = start; i < n; i++) 
			{
				visited[i] = true;
				sum = comb(card, visited, i + 1, r - 1, sum, m);
				visited[i] = false;
			}
		}
		
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		int n,m;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		int[] card = new int[n];
		for (int i = 0 ; i < n ; i++)
		{
			card[i] = sc.nextInt();
		}
		//변수들 값 넣어주기.
		

		int sum;
		boolean[] visited = new boolean[n];
		sum = comb(card, visited, 0, 3, 0, m);
		
		System.out.println(sum);
		sc.close();
	}

}
