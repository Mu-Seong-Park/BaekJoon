import java.util.*;

public class sugar_delivery {

	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		int count = n/5;
		n = n - count*5;
		
		if(n == 1)
		{
			count++;
			System.out.println(count);
		}
		else if(n == 2 && count >= 2)
		{
			count = count + 2;
			System.out.println(count);
		}
		else if (n== 3)
		{
			count++;
			System.out.println(count);
		}
		else if(n == 4 && count > 0)
		{
			count = count + 2;
			System.out.println(count);
		}
		else if(n == 0)
		{
			System.out.println(count);

		}
		else 
		{
			System.out.println(-1);
		}
			
		
		
		sc.close();

	}

}
