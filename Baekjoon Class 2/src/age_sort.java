import java.io.*;
import java.util.*;

public class age_sort {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(
				new InputStreamReader(System.in));
		
		int n;
		n = Integer.parseInt(bf.readLine());
		
		String[][] people = new String[n][2];
		
		
		for(int i = 0 ; i < n ; i++)
		{
			people[i] = bf.readLine().split(" ");
		}
		
		Arrays.sort(people, new Comparator<String[]>() {
			
			public int compare(String[] s1, String[] s2)
			{
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
		});
		
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println(people[i][0] + " " + people[i][1]);
		}
		
	
		bf.close();
	}

}

//for(int j = 0 ; j < n ; j++)
//{
//	for(int i = 0 ; i < n - 1 ; i++)
//	{
//		if(Integer.parseInt(people[i][0]) > Integer.parseInt(people[i+1][0]))
//		{
//			change = people[i][0];
//			people[i][0] = people[i+1][0];
//			people[i+1][0] = change;
//			change = people[i][1];
//			people[i][1] = people[i+1][1];
//			people[i+1][1] = change;
//			change = people[i][2];
//			people[i][2] = people[i+1][2];
//			people[i+1][2] = change;
//		}
//		else if(Integer.parseInt(people[i][0]) == Integer.parseInt(people[i+1][0]))
//		{
//			if(Integer.parseInt(people[i][2]) > Integer.parseInt(people[i+1][2]))
//			{
//				change = people[i][0];
//				people[i][0] = people[i+1][0];
//				people[i+1][0] = change;
//				change = people[i][1];
//				people[i][1] = people[i+1][1];
//				people[i+1][1] = change;
//				change = people[i][2];
//				people[i][2] = people[i+1][2];
//				people[i+1][2] = change;
//			}
//		}
//	}
//}
