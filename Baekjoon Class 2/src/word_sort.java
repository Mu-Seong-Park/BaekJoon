import java.util.Scanner;

public class word_sort {

	public static String[] mergeSort(String[] s) {
        s = sort(s, 0, s.length);
        
        return s;
    }
	
	public static String[] sort(String[] s, int left, int right) {
		
		if (right - left < 2) {
            return s;
        }

        int mid = (left + right) / 2;
        sort(s, 0, mid);
        sort(s, mid, right);
        merge(s, left, right);
        
        return s;
	}
	
	public static String[] merge(String[] s, int left, int right) {
		int mid = (left + right)/2;
		String[] temp = new String[right - left];
		
		int t = 0, l = left, r = mid;
		
		while (l < mid && r < right) {
            if (s[l].length() < s[r].length()) {
                temp[t++] = s[l++];
            } else {
                temp[t++] = s[r++];
            }
        }

        while (l < mid) {
            temp[t++] = s[l++];
        }

        while (r < right) {
            temp[t++] = s[r++];
        }

        for (int i = left; i < right; i++) {
            s[i] = temp[i - left];
        }
		
		
	    
		return s;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String temp;
		int n = 0;
		
		n = sc.nextInt();
		
		String[] s = new String[n];
		
		
		for(int i = 0 ; i< n ; i++)
		{
			s[i] = sc.next();
		}
		
		
		s = mergeSort(s);
		
		for(int j = 0; j < n; j++)
		{
			for(int i = j+1 ; i < n; i++)
			{
				if(s[j].length() == s[i].length())
				{
					for(int k = 0 ; k < s[i].length() ; k++)
					{
						if(s[j].charAt(k) == s[i].charAt(k))
						{
							continue;
						}
						else if(s[j].charAt(k) > s[i].charAt(k))
						{
							temp = s[j];
							s[j] = s[i];
							s[i] = temp;
						}
						break;
					}
				}
				
			}
		}

		for(int j = 0 ; j < n ; j++)
		{			
			if(j != 0 && s[j].equals(s[j-1]))
			{
				continue;
			}
			System.out.println(s[j]);
		}
		
		sc.close();
	}

}

//for(int j = 0 ; j < n-1 ; j++)
//{
//	for(int i = n-1 ; i>j ; i--)
//	{
//		if(s[i].length() > s[i-1].length())
//		{
//			continue;
//		}				
//		else if(s[i].length() < s[i-1].length())
//		{
//			temp = s[i];
//			s[i] = s[i-1];
//			s[i-1] = temp;
//		}
//		else if(s[i].length() == s[i-1].length())
//		{
//			if(s[i].equals(s[i-1]))
//			{
//				continue;
//			}
//			
//			for(int k = 0 ; k < s[i].length() ; k++)
//			{
//				if(s[i].charAt(k) == s[i-1].charAt(k))
//				{
//					continue;
//				}
//				
//				else if(s[i].charAt(k) < s[i-1].charAt(k))
//				{
//					temp = s[i];
//					s[i] = s[i-1];
//					s[i-1] = temp;
//				}
//				break;
//
//			}
//		}
//	}
//}


//for(int j = 0; j < n; j++)
//{
//	for(int i = j+1 ; i < n ; i++)
//	{
//		if(s[j].length() > s[i].length())
//		{
//			 temp = s[j];
//			 s[j] = s[i];
//			 s[i] = temp;
//		}
//		
//	}
//}
//
//for(int j = 0; j < n; j++)
//{
//	for(int i = j+1 ; i < n; i++)
//	{
//		if(s[j].length() == s[i].length())
//		{
//			for(int k = 0 ; k < s[i].length() ; k++)
//			{
//				if(s[j].charAt(k) == s[i].charAt(k))
//				{
//					continue;
//				}
//				else if(s[j].charAt(k) > s[i].charAt(k))
//				{
//					temp = s[j];
//					s[j] = s[i];
//					s[i] = temp;
//					
//
//				}
//				break;
//			}
//		}
//		
//	}
//}
