import java.util.Scanner;

public class alphabet_check {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] check = new int[26];
		String s;
		int most = 0;
		int temp = 0;
		s = sc.next();
		
		for(int i = 0; i < s.length();i++) 
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='A')
			{
				check[0] += 1;
			}
			else if(s.charAt(i)=='b'||s.charAt(i)=='B')
			{
				check[1] += 1;
			}
			else if(s.charAt(i)=='c'||s.charAt(i)=='C')
			{
				check[2] += 1;
			}
			else if(s.charAt(i)=='d'||s.charAt(i)=='D')
			{
				check[3] += 1;
			}
			else if(s.charAt(i)=='e'||s.charAt(i)=='E')
			{
				check[4] += 1;
			}
			else if(s.charAt(i)=='f'||s.charAt(i)=='F')
			{
				check[5] += 1;
			}
			else if(s.charAt(i)=='g'||s.charAt(i)=='G')
			{
				check[6] += 1;
			}
			else if(s.charAt(i)=='h'||s.charAt(i)=='H')
			{
				check[7] += 1;
			}
			else if(s.charAt(i)=='i'||s.charAt(i)=='I')
			{
				check[8] += 1;
			}
			else if(s.charAt(i)=='j'||s.charAt(i)=='J')
			{
				check[9] += 1;
			}
			else if(s.charAt(i)=='k'||s.charAt(i)=='K')
			{
				check[10] += 1;
			}
			else if(s.charAt(i)=='l'||s.charAt(i)=='L')
			{
				check[11] += 1;
			}
			else if(s.charAt(i)=='m'||s.charAt(i)=='M')
			{
				check[12] += 1;
			}
			else if(s.charAt(i)=='n'||s.charAt(i)=='N')
			{
				check[13] += 1;
			}
			else if(s.charAt(i)=='o'||s.charAt(i)=='O')
			{
				check[14] += 1;
			}
			else if(s.charAt(i)=='p'||s.charAt(i)=='P')
			{
				check[15] += 1;
			}
			else if(s.charAt(i)=='q'||s.charAt(i)=='Q')
			{
				check[16] += 1;
			}
			else if(s.charAt(i)=='r'||s.charAt(i)=='R')
			{
				check[17] += 1;
			}
			else if(s.charAt(i)=='s'||s.charAt(i)=='S')
			{
				check[18] += 1;
			}
			else if(s.charAt(i)=='t'||s.charAt(i)=='T')
			{
				check[19] += 1;
			}
			else if(s.charAt(i)=='u'||s.charAt(i)=='U')
			{
				check[20] += 1;
			}
			else if(s.charAt(i)=='v'||s.charAt(i)=='V')
			{
				check[21] += 1;
			}
			else if(s.charAt(i)=='w'||s.charAt(i)=='W')
			{
				check[22] += 1;
			}
			else if(s.charAt(i)=='x'||s.charAt(i)=='X')
			{
				check[23] += 1;
			}
			else if(s.charAt(i)=='y'||s.charAt(i)=='Y')
			{
				check[24] += 1;
			}
			else if(s.charAt(i)=='z'||s.charAt(i)=='Z')
			{
				check[25] += 1;
			}
				
		}
		
		for(int i = 0;i<26;i++)
		{
			if(most < check[i])
			{
				most = check[i];
				temp = i;
			}
			else if(most == check[i])
			{
				temp = -1;
			}
			
		}
		
		if(temp == -1)
		{
			System.out.println("?");
		}
		else
		{
			System.out.println((char)((int)'A' + temp));
		}
		
		sc.close();
		
	}

}
