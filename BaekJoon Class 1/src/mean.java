import java.util.Scanner;

public class mean {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		int check;
		int high;
		float sum = 0;
		while(true)
		{
			n = sc.nextInt();
			
			if(n > 0 && n <= 1000)
			{
				break;
			}
		}
		
		int[] score = new int[n];
		while(true) {
			check = 0;
			high = 0;
			for(int i=0;i<n;i++)
			{
				score[i] = sc.nextInt();
			
				if(score[i] >= 0 && score[i] <=100)
				{
					check++;
				}
				
				if(high < score[i])
				{
					high = score[i];
				}
			}
			
			if(check == n)
			{
				break;
			}
			
		}
		
		for(int i=0;i<n;i++)
		{
			sum += ((float)score[i]/(float)high)*100;
		}
		
		System.out.println(sum/n);
		
		sc.close();
	}

}
