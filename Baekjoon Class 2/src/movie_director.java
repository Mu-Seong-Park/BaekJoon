import java.util.*;

public class movie_director {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		n = sc.nextInt();
		int count = 0;
		int start = 666;
		int count_start = 0;
		int num_length;
		int check_666 = 0;
		int count_666;
		while(true)
		{
			
			count_666 = 0;
			
			if(count == n)
			{
				start = start - 1;
				break;
			}
			
			num_length = (int)(Math.log10(start));
			
			for(int i = num_length; i >= 0 ; i--)
			{

				if(count_666 == 3)
				{
					break;
				}
				check_666 = (int)Math.pow(10,i);
				if (start / check_666 == 6)
				{
					count_666++;
				}
				else
				{
					count_666 = 0;
				}
				start = start - (start / check_666) * check_666;
			}
			
			count_start++;
			start = 666 + count_start;
			
			if(count_666 == 3)
			{
				count++;
			}
			
			
			
			
		
		}
		
		
		System.out.println(start);
		
		sc.close();

	}

}
