import java.io.*;
import java.util.*;

public class num_card2_blog_10816 {

	static final int MAX_NUM = 20000001;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(bf.readLine());
		int[] checkCards = new int[MAX_NUM];
		StringTokenizer tokenizer = new StringTokenizer(bf.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < n ; i++)
		{
			checkCards[Integer.valueOf(tokenizer.nextToken()) + 10000000]++;
		}
		
		n = Integer.valueOf(bf.readLine());
		
		tokenizer = new StringTokenizer(bf.readLine());
		
		for(int i = 0; i < n ; i++)
		{
			sb.append(checkCards[Integer.valueOf(tokenizer.nextToken()) + 10000000] + " ");
		}
		
		System.out.println(sb.toString());
		
	}

}
