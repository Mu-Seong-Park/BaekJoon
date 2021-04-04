import java.io.*;
import java.util.Stack;
import java.util.*;

public class Problem_9012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		
		String str;
		
		for(int i = 0 ; i < n ; i++)
		{
			str = bf.readLine();
			boolean ans = true;
			Stack<Character> stack = new Stack();
			char temp;
			
			for(int j = 0 ; j < str.length() ; j++)
			{
				temp = str.charAt(j);
				if(temp == '(')
				{
					stack.push(temp);
				}
				else
				{
					if(stack.isEmpty())
					{
						ans = false;
						break;
					}
					else
					{
						stack.pop();
					}
				}
			}
			
			if(!stack.isEmpty())
			{
				ans = false;
			}
			if(ans)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
		
		bf.close();
		
	}

}
