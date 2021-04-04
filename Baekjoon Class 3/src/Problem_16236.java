import java.io.*;
import java.util.*;

public class Problem_16236 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf =new BufferedReader(
				new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		int[][] pool = new int[n+2][n+2];
		
		for(int i = 0 ; i < n+2 ; i++)
		{
			if(i == 0 || i == n+1)
			{
				for(int j = 0 ; j < n+2 ; j++)
				{
					pool[i][j] = -1;
				}
			}
			else
			{
				pool[i][0] = -1;
				pool[i][n+1] = -1;
			}
		}
		Pair2 sharkLocation = new Pair2(1,1);
		String[][] temp = new String[n][n];
		for(int i = 1 ; i < n+1 ; i++)
		{
			
			temp[i-1] = bf.readLine().split(" ");
		
		}
		boolean fishExisted = false;
		
		for(int i = 1 ; i < n+1 ; i++)
		{
			for(int j = 1 ; j < n+1 ; j++)
			{
				pool[i][j] = Integer.parseInt(temp[i-1][j-1]);
				if(pool[i][j] == 9)
				{
					sharkLocation.setHorizon(i);
					sharkLocation.setVerti(j);
				}
				if(pool[i][j] != 9 && pool[i][j] != 0)
				{
					fishExisted = true;
				}
				
			}
			
		}
		
//		for(int i = 1 ; i < n+1 ; i++)
//		{
//			for(int j = 1 ; j < n+1 ; j++)
//			{
//				System.out.print(pool[i][j]);
//			}
//			System.out.println();
//		}
		

		int babyShark = 2;
//		System.out.println(sharkLocation.getHorizon()+ " " + sharkLocation.getVerti());
		
		if(fishExisted)
		{
			while(true)
			{
			
			}
		}
		else
		{
			System.out.println(0);
		}
		bf.close();
		
	}

}

class Pair2 {
	Integer y;
	Integer x;
	
	public Pair2(Integer x, Integer y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Integer getHorizon()
	{
		return x;
	}
	public Integer getVerti()
	{
		return y;
	}
	
	public void setHorizon(int x)
	{
		this.x = x;
	}
	public void setVerti(int y)
	{
		this.y = y;
	}

}
