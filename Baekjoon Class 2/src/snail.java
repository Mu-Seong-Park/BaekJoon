import java.io.*;

public class snail {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(
				new InputStreamReader(System.in));
		
		double a,b,v, day;
		String[] s = new String[3];
		s = bf.readLine().split(" ");
		a = Integer.parseInt(s[0]);
		b = Integer.parseInt(s[1]);
		v = Integer.parseInt(s[2]);
		
		int ans;
		day = (( v -  b) / ( a - b ) );
		
		if(day - (int)day > 0)
		{
			ans = (int) day + 1;
		}
		else
		{
			ans = (int) day;
		}
		
		System.out.println(ans);
				
	}

}
