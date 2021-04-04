import java.util.Scanner;

public class compare {

	public static void main(String[] args) {
		int A;
		int B;
		Scanner sc = new Scanner(System.in);
		while(true) {
			A = sc.nextInt();
			B = sc.nextInt();
			if (A > -10000 && B > -10000 && A < 10000 && B < 10000)
			{
				break;
			}
		}
		if(A>B)
		{
			System.out.println(">");
		}
		else if(A<B)
		{
			System.out.println("<");
		}
		else
		{
			System.out.println("==");
		}
		
		sc.close();
	}

}
