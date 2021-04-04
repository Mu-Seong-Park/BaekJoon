import java.util.Scanner;

public class num_check {

	public static void main(String[] args) {
		
		int A;
		int B;
		int C;
		String total;
		int[] check = new int[10];
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			A = sc.nextInt();
			
			B = sc.nextInt();
			
			C = sc.nextInt();
			
			if(A>=100 && A < 1000 && B>=100 && B < 1000 && C>=100 && C < 1000)
			{
				break;
			}
		}
		
		total = Integer.toString(A*B*C);
		for(int i=0;i<total.length();i++)
		{
			if(total.charAt(i)=='1')
			{
				check[1] += 1;
			}
			else if(total.charAt(i)=='2')
			{
				check[2] += 1;
			}
			else if(total.charAt(i)=='3')
			{
				check[3] += 1;
			}
			else if(total.charAt(i)=='4')
			{
				check[4] += 1;
			}
			else if(total.charAt(i)=='5')
			{
				check[5] += 1;
			}
			else if(total.charAt(i)=='6')
			{
				check[6] += 1;
			}
			else if(total.charAt(i)=='7')
			{
				check[7] += 1;
			}
			else if(total.charAt(i)=='8')
			{
				check[8] += 1;
			}
			else if(total.charAt(i)=='9')
			{
				check[9] += 1;
			}
			else
			{
				check[0] += 1;
			}
		}
		
		for(int i=0;i<10;i++)
		{
			System.out.println(check[i]);
		}
		
		sc.close();
	}

}
