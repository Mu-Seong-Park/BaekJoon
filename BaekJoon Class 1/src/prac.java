import java.util.Scanner;

public class prac {

	public static void main(String[] args) {
	
		int num;
		Scanner sc = new Scanner(System.in);
        
        num = sc.nextInt();
        
		for(int i=1;i<num+1;i++)
		{
			for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
		}
		
		sc.close();
	}

}
