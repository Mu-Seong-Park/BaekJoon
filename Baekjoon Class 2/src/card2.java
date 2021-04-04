import java.util.*;


public class card2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		n = sc.nextInt();
		
		Queue card = new Queue(n);
		
		for(int i = 0 ; i < n ; i++)
		{
			card.enQueue(i + 1);
		}
		
		
		for(int i = 0 ; i < n - 1 ; i++)
		{
			card.deQueue();
			card.enQueue(card.deQueue());
			
		}
	
		System.out.println(card.deQueue());
		sc.close();	
		
		
	}

}

