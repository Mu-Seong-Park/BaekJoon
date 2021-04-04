import java.util.Scanner;

public class r {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		int ans = 0;
		for(int i = 0; i< 10;i++)
		{
			num[i] = sc.nextInt();
		}
		
		for(int i = 0; i< 10;i++)
		{
			num[i] = (num[i])%42;
		}
		
		for(int j = 0; j < 10; j++)
		{
			for(int i=0;i<9;i++)
			{
				if(num[i]>num[i+1])
				{
					int temp;
					temp = num[i];
					num[i] = num[i+1];
					num[i+1] = temp;
				}
			}
		}
		
		for(int i=0;i<9;i++)
		{
			if(num[i] == num[i+1])
			{
				ans++;
			}
		}
		
		
		System.out.println(10 - ans);
		sc.close();
	}

}
