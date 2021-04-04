import java.util.Scanner;
public class verification {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int s;
		
		
		
		int ans = 0;
		
		for(int i=0;i<5;i++)
		{
			s = sc.nextInt();
			
			ans = ans + s*s;
		}
		
		System.out.println(ans%10);
		
		sc.close();
	}

}
