import java.util.*;
public class constant {

	public static void main(String[] args) {

		char[][] a = new char[5][5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<5;i++)
		{
			for(int j = 0; j<5;j++)
			{
				a[i][j] = sc.next().charAt(0);
			}
		}
	}

}
