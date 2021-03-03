import java.util.*;
public class combination {
	public static int comb(int[] num, boolean[] visited, int start, int r, int count) {
		int n = num.length;
		
		if(r == 0) {
			count++;
		} 
		else 
		{
			for(int i = start; i < n; i++) 
			{
				visited[i] = true;
				count = comb(num, visited, i + 1, r - 1, count);
				visited[i] = false;
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n,k;
		n = sc.nextInt();
		k = sc.nextInt();
		
		int[] num = new int[n];
		boolean[] visited = new boolean[n];
		int count = 0;
		count = comb(num, visited,0,k,0);
		
		System.out.println(count);
		sc.close();
	}

}
