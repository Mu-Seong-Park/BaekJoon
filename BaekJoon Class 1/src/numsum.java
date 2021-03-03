import java.util.Scanner;

public class numsum {

	public static void main(String[] args) {
		int n;
		int sum = 0;
		String k;
		int alpha;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		k = sc.next();
		
		for(int i = 0;i <n;i++)
		{
			alpha = ((int)k.charAt(i))-48;
			sum = sum + alpha;
		}
	
		
		System.out.println(sum);
		
		sc.close();

	}

}
