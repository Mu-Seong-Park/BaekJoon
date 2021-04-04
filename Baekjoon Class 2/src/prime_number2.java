import java.io.*;


public class prime_number2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new
				InputStreamReader(System.in));
		
		
		String[] s = new String[2];
		s = bf.readLine().split(" ");
		
		int n,m;
		m = Integer.parseInt(s[0]);
		n = Integer.parseInt(s[1]);
		
		int[] num_pool = new int[n + 1];
		
		for(int i = 0; i < m ; i++)
		{
			num_pool[i] = -1;	
		}
		
		for(int i = m; i < n + 1 ; i++)
		{
			if(i == 0 || i == 1)
			{
				num_pool[i] = -1;
			}
			
			for(int j=2; j <= Math.sqrt(i); j++) 
			{
				if(i%j == 0) 
				{
					num_pool[i] = -1;
					break;
				}
				
			}
		}
		
		for(int i = 1; i < n + 1 ; i++)
		{
			if(num_pool[i] != -1)
			{
				System.out.println(i);
			}
		}
		
		bf.close();

	}

}

