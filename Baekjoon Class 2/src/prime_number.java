import java.util.Scanner;

public class prime_number {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int n;
		int ans_count = 0;
		n = sc.nextInt();
		
		int[] num = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			num[i] = sc.nextInt();
		}
		
		
		int[] numPool = new int[1001];
		numPool[0] = -1;
		numPool[1] = -1;
		
		for(int i = 1; i < 1001; i++)
		{
			
			if(i > 1)
			{
				for (int k = 2; k < 1000/i + 1 ; k++)
				{
					numPool[i * k] = -1;
				}
				
			}
		}
	
		for(int i = 0; i < n; i++)
		{
			if(numPool[num[i]] == 0)
			{
				ans_count++;
			}
		}
		
		System.out.println(ans_count);
		
		sc.close();

	}

}

// 다른 사람 풀이 => a의 공약수 중 중간의 값인 루트a를 기준으로 약수가 있는지 없는지를 판단, 약수가 있다면 루트a보다 작거나 같은 약수가
// 무조건 존재함.
//for(int j=2; j<=Math.sqrt(a); j++) {
//	if(a%j==0) {
//		count++;
//		break;
//	}
//}
