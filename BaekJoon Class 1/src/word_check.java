import java.util.Scanner;

public class word_check {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s;
		
		s = sc.nextLine();
		int check = 1;
		int start = -1;
		int end = -1;
		
		if(s.length() != 0)
		{
			if(s.charAt(0)==' ')
			{
				start = 1;
			}
			
			if(s.length() != 0 || s.charAt(s.length()-1)==' ')
			{
				end = 1;
			}
			
			if(s.length() > 1)
			{
				for(int i =0;i<s.length();i++)
				{
					if(start == 1 && i == 0)
					{
						i = i + 1;
					}
					
					if(end == 1 && i == s.length() - 1)
					{
						break;
					}
					
					if(s.charAt(i)==' ')
					{
						check++;
					}
				}
			}
			else if(s.length() == 1 && s.charAt(0) != ' ')
			{
				check = 1;
			}
			else
			{
				check = 0;
			}
			
		}
		else
		{
			check = 0;
		}
		
		System.out.println(check);
		
		sc.close();
	}

}
