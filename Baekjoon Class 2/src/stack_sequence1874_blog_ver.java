import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class stack_sequence1874_blog_ver {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(
				new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		ArrayList<String> ans = new ArrayList();
		int[] seq = new int[n+1];
		Stack<Integer> stack = new Stack();
		
		for(int i = 1 ; i <= n ;i++)
		{
			seq[i] = Integer.parseInt(bf.readLine());
		}
		
		int j = 1;
		
		for(int i = 1 ; i <= n ;i++)
		{
			stack.push(i);
			ans.add("+");
			
			while(!stack.isEmpty() && stack.peek() == seq[j])
			{
				stack.pop();
				ans.add("-");
				j++;
			}
		}
		
		if(stack.isEmpty())
		{
			for(String s : ans)
			{
				System.out.println(s);
			}
		}
		else
		{
			System.out.println("NO");
		}
		
	}

}
