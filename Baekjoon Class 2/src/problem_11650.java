import java.io.*;
import java.util.*;


public class problem_11650 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.valueOf(bf.readLine());
		
		
		ArrayList<ArrayList<Integer>> y = new ArrayList<ArrayList<Integer>>();
		String[] temp = new String[2];
		String str;
		for(int i = 0 ; i < n ; i++)
		{
			ArrayList<Integer> x = new ArrayList<Integer>();
			temp = (bf.readLine()).split(" ");
			x.add(Integer.valueOf(temp[0]));
			x.add(Integer.valueOf(temp[1]));
			y.add(x);	
		}
		
		Collections.sort(y, new Comparator<ArrayList<Integer>>() {

			@Override
			public int compare(ArrayList<Integer> x1, ArrayList<Integer> x2) {
				if (x1.get(0) > x2.get(0))
				{	
					return 1;
				}
				else if (x1.get(0).equals( x2.get(0))) 
				{
					if (x1.get(1) > x2.get(1))
						return 1;
					else if (x1.get(1).equals( x2.get(1)))
						return 0;
					else
						return -1;
				} 
				else
				{
					return -1;
				}
				
			}
			
		});
		
		for(int i = 0 ; i < n ; i++)
		{
			sb.append(y.get(i)).append("\n");
			
		}
		
		str = sb.toString().replace("[", "");
		str = str.replace("]", "");
		str = str.toString().replace(",", "");
		
		System.out.println(str);
		bf.close();
	}

}
