import java.util.Scanner;
public class common_factor {
	
	public static int recursive(int b, int r)
	{
		int x;
		int a;
		x = b % r;
		if(x > 0)
		{
			a = recursive(r,x);
			
			if(a != 0)
			{
				x = a;
			}
		}
		else if(x == 0)
		{
			x = r;
		}
		
		
		return x;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b = -1;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		int temp = -1;
		
		if ( a < b)
		{
			temp = a;
			a = b;
			b = temp;
		}
		
		int c = recursive(a,b);
		
		System.out.println(c);
		
		int d;
		d = (a/c)*(b/c)*c;
		
		System.out.println(c);
		System.out.println(d);
		sc.close();

	}

}
