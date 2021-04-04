import java.io.*;
import java.util.*;

public class Problem_1541 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf =new BufferedReader(
				new InputStreamReader(System.in));
		
		String[] temp = new String[2];
		String str = bf.readLine();
		int[] num = new int[100000];
		int cnt = 0;
		
		int oper = 0;
		int[] operIndex = new int[100000];
		
		for(int i = 0 ; i < str.length() ; i++)
		{
			
			if(str.charAt(i) == '-')
			{
				operIndex[i] = -1;
				oper++;
			}
			else if(str.charAt(i) == '+')
			{
				operIndex[i] = 1;
				oper++;
			}
		}
		
		if(oper == 0)
		{	
			System.out.println(str);
		}
		else
		{
			String[] operationSymbol = new String[oper];
			
			for(int i = 0 ; i < str.length() ; i++)
			{
				
				if(str.charAt(i) == '-')
				{
					operationSymbol[cnt++] = "\\-";
					
				}
				else if(str.charAt(i) == '+')
				{
					operationSymbol[cnt++] = "\\+";
				}
			}
			
			
			int numCnt = 0;
			
			int temp4 = 0;
			String temp2 = str;
			String temp3 = "";
			for(int i = 0 ; i < str.length() ; i++)
			{
				if(operIndex[i] == -1)
				{
					temp3 = temp2.substring(0,i - temp4);
					temp2 = temp2.substring(i - temp4 + 1);
					num[numCnt] = Integer.parseInt(temp3);
					temp4 = i+1;
					numCnt++;
					
					
				}
				else if(operIndex[i] == 1)
				{
					
					temp3 = temp2.substring(0,i - temp4);
					temp2 = temp2.substring(i - temp4 + 1);
					num[numCnt] = Integer.parseInt(temp3);
					temp4 = temp4 + temp3.length() + 1;
					numCnt++;
				}
				
				if(i == str.length() - 1)
				{
					num[numCnt] = Integer.parseInt(temp2);
					numCnt++;
				}
				
			}
			
			
			int ans = num[0];
			String temp7 = operationSymbol[0];
			for(int i = 0 ; i < oper ; i++)
			{
				
				if(temp7.equals("\\-"))
				{
					ans = ans - num[i+1];
				}
				else
				{
					ans = ans + num[i+1];
					if(i != oper - 1 && operationSymbol[i+1].equals("\\-"))
					{
						temp7 = "\\-";
					}
				}
				
			}
			System.out.println(ans);
		}
		bf.close();
	}

}
