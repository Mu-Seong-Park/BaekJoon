import java.util.Scanner;

public class string_repeat {

	public static void main(String[] args) {
		
		
		int test;
		Scanner sc = new Scanner(System.in);
		
		test = sc.nextInt();
		int[] num = new int[test];
		String[] s = new String[test];
		
		for(int i=0; i<test;i++)
		{
			num[i] = sc.nextInt();
			s[i] = sc.next();
		}
		
		
		for(int i=0; i<test;i++)
		{
			for(int k=0;k<s[i].length();k++)
			{
				for(int j=0; j<num[i];j++)
				{
					System.out.print(s[i].charAt(k));
				}
			}
			System.out.println();
		}
		
		sc.close();

	}

}
