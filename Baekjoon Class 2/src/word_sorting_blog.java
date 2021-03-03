import java.util.*;
public class word_sorting_blog {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		String[] s = new String[n];
		
		for(int i = 0 ;i < n; i++)
		{
			s[i] = sc.next();
		}
		
		Arrays.sort(s, new Comparator<String>() {
			public int compare(String s1, String s2)
			{
				if(s1.length() == s2.length())
				{
					return s1.compareTo(s2);
				}
				
				else {
					return s1.length() - s2.length();
				}
			}
		});
		
		for(int i = 0; i < n ; i++)
		{
			if(i !=0 && s[i].equals(s[i-1]))
			{
				continue;
			}
			System.out.println(s[i]);
		}
		
		sc.close();

	}

}
