import java.util.Scanner;
public class big_small {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		int small=1000001,big=-1000001;
		while(true)
		{
			num = sc.nextInt();
			
			if (num >= 1 && num <= 1000000)
			{
				break;
			}
		}
		
		int[] n = new int[num];
		int check;
		while(true)
		{
			check = 0;
			for(int i=0;i<num;i++)
			{
				n[i] = sc.nextInt();
			}
			
			for(int i=0;i<num;i++)
			{
				if(n[i] > 1000000 || n[i] < -1000000)
				{
					check++;
				}
			}
			
			if(check>0)
			{
				continue;
			}
			break;
		}
		
		for(int i=0;i<num;i++)
		{
			
			if(big<n[i])
			{
				big = n[i];
			}
			
			if(small>n[i])
			{
				small = n[i];
			}
		}
		
		System.out.print(small+" "+big);
		
		
		sc.close();
	}

}
