import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s;
		boolean palindrome;
		int x;
		while(true)
		{
			x = sc.nextInt();
			s = Integer.toString(x);
			
			palindrome = true;
			
			if(s.charAt(0) == '0')
			{
				break;
			}
			
			for(int i = 0; i<(s.length())/2;i++)
			{
				if(s.charAt(i) != s.charAt((s.length()-1)-i))
				{
					palindrome = false;
				}
			}
			
			if(palindrome == true)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
		
		sc.close();
	}

}
