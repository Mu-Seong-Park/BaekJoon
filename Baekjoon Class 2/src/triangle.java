import java.io.*;

public class triangle {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(
				new InputStreamReader(System.in));
		
		String[] s = new String[3];
		double[] triangle = new double[3];
		while(true)
		{
			s = bf.readLine().split(" ");
			if(s[0].equals("0") && s[1].equals("0") && s[2].equals("0"))
			{
				break;
			}
			
			for(int i = 0 ; i < 3 ; i++)
			{
				triangle[i] = (double)(Integer.parseInt(s[i]));
			}
			
			if(Math.pow(triangle[0], 2) + Math.pow(triangle[1], 2) == Math.pow(triangle[2], 2))
			{
				System.out.println("right");
			}
			else if(Math.pow(triangle[1], 2) + Math.pow(triangle[2], 2) == Math.pow(triangle[0], 2))
			{
				System.out.println("right");
			}
			else if(Math.pow(triangle[2], 2) + Math.pow(triangle[0], 2) == Math.pow(triangle[1], 2))
			{
				System.out.println("right");
			}
			else	
			{
				System.out.println("wrong");
			}
		}
	}

}
