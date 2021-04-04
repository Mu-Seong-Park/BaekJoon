import java.io.*;
import java.util.*;

public class Problem_17219 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf =new BufferedReader(
				new InputStreamReader(System.in));
		
		String[] temp = new String[2];
		temp = bf.readLine().split(" ");
		
		int n = Integer.parseInt(temp[0]);
		int m = Integer.parseInt(temp[1]);
		
		HashMap<String, String> notepad = new HashMap<>();
		
		for(int i = 0 ; i < n ; i++)
		{
			temp = bf.readLine().split(" ");
			notepad.put(temp[0], temp[1]);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < m ; i++)
		{
			temp[0] = bf.readLine();
			sb.append(notepad.get(temp[0])).append("\n");
		}
		
		System.out.println(sb);
		bf.close();
		
		
	}

}
