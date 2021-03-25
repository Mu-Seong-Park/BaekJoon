import java.io.*;
import java.util.*;

public class Problem_10866_blog_ver {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(
				new InputStreamReader(System.in));
		
		String[] s = new String[2];
		Deque<Integer> deque = new LinkedList<>();
		
		int n = Integer.parseInt(bf.readLine());
		
		for(int i = 0 ; i < n ; i++)
		{
			s = bf.readLine().split(" ");
			if(s[0].equals("push_front"))
			{
				deque.addFirst(Integer.parseInt(s[1]));
			}
			else if(s[0].equals("push_back"))
			{
				deque.addLast(Integer.parseInt(s[1]));
			}
			else if(s[0].equals("pop_front"))
			{
				if(deque.isEmpty())
				{
					System.out.println(-1);
				}
				else
				{
					System.out.println(deque.pop());
				}
			}
			else if(s[0].equals("pop_back"))
			{
				if(deque.isEmpty())
				{
					System.out.println(-1);
				}
				else
				{
					System.out.println(deque.removeLast());
				}
			}
			else if(s[0].equals("size"))
			{
				System.out.println(deque.size());
			}
			else if(s[0].equals("empty"))
			{
				System.out.println(deque.isEmpty()?1:0);
			}
			else if(s[0].equals("front"))
			{
				if(deque.isEmpty())
				{
					System.out.println(-1);
				}
				else
				{
					System.out.println(deque.peek());
				}
			}
			else if(s[0].equals("back"))
			{
				if(deque.isEmpty())
				{
					System.out.println(-1);
				}
				else
				{
					System.out.println(deque.peekLast());
				}
			}
			
		}

	}

}
