import java.io.*;
import java.util.*;

public class num_sort {
	
//	public static int[] mergeSort(int[] arr) {
//		sort(arr, 0, arr.length);
//				
//		return arr;
//	}
//	
//	public static void sort(int[] arr, int low, int high)
//	{
//		if (high - low < 2)
//		{
//			return;
//		}
//		
//		int mid = (low + high) / 2;
//		sort(arr, 0, mid);
//		sort(arr, mid, high);
//		merge(arr, low, mid, high);
//		
//	}
//	
//	public static void merge(int[] arr, int low, int mid, int high)
//	{
//		int[] temp = new int[high - low];
//		int t = 0, l = low, h = mid;
//		
//		while( l < mid && h < high)
//		{
//			if(arr[l] < arr[h])
//			{
//				temp[t++] = arr[l++];
//			}
//			else
//			{
//				temp[t++] = arr[h++];
//			}
//		}
//		
//		while( l < mid)
//		{
//			temp[t++] = arr[l++];
//		}
//		
//		while(h < high)
//		{
//			temp[t++] = arr[h++];
//		}
//		
//		for(int i = low; i < high; i++)
//		{
//			arr[i] = temp[i - low];
//		}
//	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new 
				InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n;
		
		String s ;
		s = bf.readLine();
		
		n = Integer.parseInt(s);
		
		List<Integer> num = new ArrayList<>();
		
		for(int i = 0 ; i < n ; i++)
		{
			s = bf.readLine();
			num.add(Integer.parseInt(s));
		}
		
		Collections.sort(num);
		
		for(int value : num)
		{
			sb.append(value).append("\n");
		}
		System.out.println(sb);
		
		bf.close();
	}

}
