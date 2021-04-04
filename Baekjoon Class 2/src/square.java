import java.util.Scanner;

public class square {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x,y,w,h = 0;
		
		x = sc.nextInt();
		y = sc.nextInt();
		w = sc.nextInt();
		h = sc.nextInt();
		
		int[] ans = new int[4];
		int min = 1000;
		
		ans[0] = x - 0;
		ans[1] = y - 0;
		ans[2] = w - x;
		ans[3] = h - y;
		
		for(int i = 0; i<4;i++)
		{
			if(min > ans[i])
			{
				min = ans[i];
			}
		}
		
		System.out.println(min);
				
		sc.close();
	}

}
