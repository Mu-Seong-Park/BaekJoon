import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		for(int i = 1;i<10;i++)
		{
			System.out.println(num+" * "+i+" = "+num*i);
		}
		
		sc.close();
	}

}
