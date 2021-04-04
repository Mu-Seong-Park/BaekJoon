import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1003_blog_ver {
//참고 블로그 : https://st-lab.tistory.com/124 , https://zorba91.tistory.com/79
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(
				new InputStreamReader(System.in));
		
		
		int n = Integer.parseInt(bf.readLine());
		int[] zeroCount = new int[41];
		int[] oneCount = new int[41];
		
		zeroCount[0] = 1;
		oneCount[0] = 0;
		zeroCount[1] = 0;
		oneCount[1] = 1;
		
		int[] num = new int[n];
		
		for(int i = 0 ; i < n ; i++)
		{
			num[i] = Integer.parseInt(bf.readLine());
		}
		
		for(int i = 2; i < 41 ; i++)
		{
			zeroCount[i] = zeroCount[i-1] + zeroCount[i-2];
			oneCount[i] = oneCount[i-1] + oneCount[i-2];
		}
		
		for(int i = 0 ; i < num.length; i++)
		{
			System.out.println(zeroCount[num[i]] + " " + oneCount[num[i]]);
		}

	}

}
