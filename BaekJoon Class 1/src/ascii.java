import java.util.Scanner;

public class ascii {

	public static void main(String[] args) {
	char a;
	
	Scanner sc = new Scanner(System.in);
	
	a = sc.next().charAt(0);
	
	System.out.println(((int)a));
		
	sc.close();
	}

}
