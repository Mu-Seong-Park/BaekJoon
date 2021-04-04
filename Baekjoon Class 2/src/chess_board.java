import java.util.Scanner;

public class chess_board {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m= -1, n = -1;
		int min = 51;
		while(true)
		{
			n = sc.nextInt();
			m = sc.nextInt();
			
			if(m>=8 && n>=8 && m<=50 && n<=50)
			{
				break;
			}
		}
		
		char[][] board = new char[n][m];
		String[] input_board = new String[n];
		char[][] temp = new char[n][m];
		
		for(int i = 0;i<n;i++)
		{
			input_board[i] = sc.next();
		}
		
		for(int i = 0;i<n;i++)
		{
			for(int j = 0;j<m;j++)
			{
				board[i][j] = input_board[i].charAt(j);
			}
		}
		int[][] ans = new int[n-7][m-7];
		
		for(int i = 0;i<n-7;i++)
		{
			for(int j = 0;j<m-7;j++)
			{
				ans[i][j] = 0;
			}
		}
		
		
		for(int i = 0;i<n-7;i++)
		{
			for(int j = 0;j<m-7;j++)
			{
				for(int k = 0;k<8;k++)
				{
					for(int l = 0; l<8;l++)
					{
						temp[k][l] = board[i+k][j+l];
					}
				}
				
				for(int k = 0;k<8;k++)
				{
					for(int l = 0; l<8;l++)
					{
						if(k == 0 && l == 0)
						{
							
						}
						else if(k == 0 && l != 0)
						{
							if(temp[k][l-1] == 'B' && temp[k][l] == 'B')
							{
								temp[k][l] = 'W';
								ans[i][j]++;
							}
							else if(temp[k][l-1] == 'W' && temp[k][l] == 'W')
							{
								temp[k][l] = 'B';
								ans[i][j]++;
							}
						}
						else
						{
							if(l == 0)
							{
								if(temp[k-1][l] == 'B' && temp[k][l] == 'B')
								{
									temp[k][l] = 'W';
									ans[i][j]++;
								}
								else if(temp[k-1][l] == 'W' && temp[k][l] == 'W')
								{
									temp[k][l] = 'B';
									ans[i][j]++;
								}
							}
							else
							{
								if(temp[k][l-1] == 'B' && temp[k][l] == 'B')
								{
									temp[k][l] = 'W';
									ans[i][j]++;
								}
								else if(temp[k][l-1] == 'W' && temp[k][l] == 'W')
								{
									temp[k][l] = 'B';
									ans[i][j]++;
								}
							}
						}
						
					}
				}
			}
		}
		
		for(int i = 0;i<n-7;i++)
		{
			for(int j = 0;j<m-7;j++)
			{
				if( ans[i][j] > 32)
				{
					ans[i][j] = 64 - ans[i][j];
				}
			}
		}

		for(int i = 0;i<n-7;i++)
		{
			for(int j = 0;j<m-7;j++)
			{
				if(min > ans[i][j])
				{
					min = ans[i][j];
				}
			}
		}


		System.out.println(min);
		
		sc.close();
	}

}
