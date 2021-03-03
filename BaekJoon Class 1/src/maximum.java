import java.util.Scanner;

public class maximum {

	public static void main(String[] args) {
		
		int n = 9;
		int max = 0;
		int index = -1;
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[n];
		
		for(int i =0;i<n;i++)
		{
			num[i] = sc.nextInt();
			if(num[i]>max)
			{
				max = num[i];
				index = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
		
		sc.close();
	}

}
