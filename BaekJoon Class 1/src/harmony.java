import java.util.Scanner;

public class harmony {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s;
		
		char temp = '0';
		int check = 0;
		
		s = sc.nextLine();
		for(int i = 0; i < s.length();i++)
		{
			if (i == 0)
			{
				temp = s.charAt(i);
			}
			else
			{
				if(s.charAt(i) == ' ')
				{
					continue;
				}
				else
				{
					
					if(((int)temp - (int)s.charAt(i)) == 1)
					{
						check--;
					}
					else if(((int)temp - (int)s.charAt(i)) == -1)
					{
						check++;
					}
					temp = s.charAt(i);
				}
			}
			
		}
		
		if(check == 7)
		{
			System.out.println("ascending");
		}
		else if(check == -7)
		{
			System.out.println("descending");
		}
		else
		{
			System.out.println("mixed");
		}
		sc.close();
	}

}
