import java.io.*;

public class ACMhotel10250 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(
				new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(bf.readLine());
		
		String[] s = new String[3];
		String[] ans = new String[testCase];
		
		for(int i = 0 ; i < testCase ; i++)
		{
			
			s = bf.readLine().split(" ");
			int h,w,n;
			h = Integer.parseInt(s[0]);
			w = Integer.parseInt(s[1]);
			n = Integer.parseInt(s[2]);
			
			if(n%h == 0)
			{
				ans[i] = Integer.toString(h);
				if(n / h <= 9)
				{
					ans[i] = ans[i] + "0" + Integer.toString(n/h);
				}
				if(n / h > 9)
				{
					ans[i] = ans[i] + Integer.toString(n/h);
				}
			}
			else
			{
				ans[i] = Integer.toString(n % h);
				if(n / h < 9)
				{
					ans[i] = ans[i] + "0" + Integer.toString((n/h) + 1);
				}
				if(n / h >= 9)
				{
					ans[i] = ans[i] + Integer.toString((n/h) + 1);
				}
			}

		}
		
		for(int i = 0 ; i < testCase ; i++)
		{
			System.out.println(ans[i]);
		}
	}

}
