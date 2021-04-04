import java.io.*;
import java.util.*;

public class Problem_15829 {

	public static void main(String[] args) throws IOException {
		
		long r = 1; // 처음 풀었을 때는 pow를 써서 시간을 많이 잡아먹었지만, 이게 사실상 31을 for문 끝날 떄마다 곱해줘서 31^i로 만들어주면 되기 떄문에 pow를
		// 쓰지 않아도 괜찮음.
		long M = 1234567891;
		
		//1. (a + b) mod n = {(a mod n) + (b mod n)} mod n
		//2. (a - b) mod n = {(a mod n) - (b mod n)} mod n
		//3. (a * b) mod n = {(a mod n) * (b mod n)} mod n


		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int L = Integer.parseInt(bf.readLine());
		
		String str = bf.readLine();
		long ans = 0;
		for(int i = 0 ; i < L ; i++)
		{

			//ans = (ans % M + ((str.charAt(i) - 'a' + 1) * r) % M) ;
			
			ans = (ans + (str.charAt(i) - 'a' + 1) * r) % M ;
			
			//r = (r % M) * 31 ;
			r = (r * 31) % M ;
		}
		
		System.out.println(ans);
		bf.close();
	}

}
