import java.util.Scanner;
public class sangsu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		int[] temp = new int[3];
		
		temp[0] = a/100;
		temp[1] = (a-temp[0]*100)/10;
		temp[2] = (a - temp[0]*100 - temp[1]*10);
		
		a = temp[2]*100 + temp[1]*10 + temp[0];
		
		temp[0] = b/100;
		temp[1] = (b-temp[0]*100)/10;
		temp[2] = (b - temp[0]*100 - temp[1]*10);
		
		b = temp[2]*100 + temp[1]*10 + temp[0];
		
		if(b - a > 0)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(a);
		}

	}

}
