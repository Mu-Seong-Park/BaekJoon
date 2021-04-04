import java.io.*;
import java.util.*;

public class Problem_1620 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(
				new InputStreamReader(System.in));
		
		String[] temp = new String[2];
		
		temp = bf.readLine().split(" ");
		int n,m;
		
		n = Integer.parseInt(temp[0]);
		m = Integer.parseInt(temp[1]);
		
		HashMap<String, String> pocket1 = new HashMap<>();
		HashMap<String, String> pocket2 = new HashMap<>();
		
		for(int i = 0 ; i < n ; i++)
		{
			String s = bf.readLine();
			pocket1.put(s, Integer.toString(i+1));
			pocket2.put(Integer.toString(i+1), s);
		}
		
		String[] quiz = new String[m];
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < m ; i++)
		{
			quiz[i] = bf.readLine();
		}
		
		for(int i = 0 ; i < m ; i++)
		{
			if(pocket1.containsKey(quiz[i]))
			{
				sb.append(pocket1.get(quiz[i])).append("\n");
			}
			else
			{
				sb.append(pocket2.get(quiz[i])).append("\n");
			}
		}
		
		System.out.println(sb);
		bf.close();
	}
	
//	public static <K,V> String getKey(HashMap<String, String> pocket, String quiz)
//	{
//		for(String key : pocket.keySet())
//		{
//			if(quiz.equals(pocket.get(key)))
//			{
//				return key;
//			}
//		}
//		
//		return null;
//	}

}
