import java.util.Scanner;

public class stringalphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s;
		
		s = sc.next();
		
		int[] n = new int[26];
		
		for(int i = 0; i<26;i++)
		{
			n[i] = -1;
		}
		
		for(int i = 0; i<s.length();i++)
		{
			if(s.charAt(i)=='a' && n[0] == -1)
			{
				n[0] = i;
			}
			else if(s.charAt(i)=='b' && n[1] == -1)
			{
				n[1] = i;
			}
			else if(s.charAt(i)=='c' && n[2] == -1)
			{
				n[2] = i;
			}
			else if(s.charAt(i)=='d' && n[3] == -1)
			{
				n[3] = i;
			}
			else if(s.charAt(i)=='e' && n[4] == -1)
			{
				n[4] = i;
			}
			else if(s.charAt(i)=='f' && n[5] == -1)
			{
				n[5] = i;
			}
			else if(s.charAt(i)=='g' && n[6] == -1)
			{
				n[6] = i;
			}
			else if(s.charAt(i)=='h' && n[7] == -1)
			{
				n[7] = i;
			}
			else if(s.charAt(i)=='i' && n[8] == -1)
			{
				n[8] = i;
			}
			else if(s.charAt(i)=='j' && n[9] == -1)
			{
				n[9] = i;
			}
			else if(s.charAt(i)=='k' && n[10] == -1)
			{
				n[10] = i;
			}
			else if(s.charAt(i)=='l' && n[11] == -1)
			{
				n[11] = i;
			}
			else if(s.charAt(i)=='m' && n[12] == -1)
			{
				n[12] = i;
			}
			else if(s.charAt(i)=='n' && n[13] == -1)
			{
				n[13] = i;
			}
			else if(s.charAt(i)=='o' && n[14] == -1)
			{
				n[14] = i;
			}
			else if(s.charAt(i)=='p' && n[15] == -1)
			{
				n[15] = i;
			}
			else if(s.charAt(i)=='q' && n[16] == -1)
			{
				n[16] = i;
			}
			else if(s.charAt(i)=='r' && n[17] == -1)
			{
				n[17] = i;
			}
			else if(s.charAt(i)=='s' && n[18] == -1)
			{
				n[18] = i;
			}
			else if(s.charAt(i)=='t' && n[19] == -1)
			{
				n[19] = i;
			}
			else if(s.charAt(i)=='u' && n[20] == -1)
			{
				n[20] = i;
			}
			else if(s.charAt(i)=='v' && n[21] == -1)
			{
				n[21] = i;
			}
			else if(s.charAt(i)=='w' && n[22] == -1)
			{
				n[22] = i;
			}
			else if(s.charAt(i)=='x' && n[23] == -1)
			{
				n[23] = i;
			}
			else if(s.charAt(i)=='y' && n[24] == -1)
			{
				n[24] = i;
			}
			else if(s.charAt(i)=='z' && n[25] == -1)
			{
				n[25] = i;
			}
		}
		
		for(int i = 0; i<26;i++)
		{
			System.out.print(n[i]+" ");
		}
		
		sc.close();
	}

}
