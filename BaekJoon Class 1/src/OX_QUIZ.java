import java.util.Scanner;

public class OX_QUIZ {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		int length;
		int temp;
		num = sc.nextInt();
		String[] s = new String[num];
		for(int i=0;i<num;i++)
		{
			s[i]=sc.next();
		}
		int[] score = new int[num];
		
		for(int i=0;i<num;i++)
		{
			temp = 0;
			score[i] = 0;
			length = s[i].length();
			for(int j=0;j<length;j++)
			{
				if(s[i].charAt(j)=='O')
				{
					temp = temp + 1;
					score[i] = score[i] + temp; 
				}
				
				else
				{
					temp = 0;
				}
			}
		}
		
		for(int i=0;i<num;i++)
		{
			System.out.println(score[i]);
		}
		
		sc.close();
	}

}
