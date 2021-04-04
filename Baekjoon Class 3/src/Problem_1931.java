import java.io.*;
import java.util.*;

// linkedlist의 get 은 O(n)이라는 사실을 깨달았고,  정렬을 끝나는 시간 기준으로 하고, 끝나는 시간이 같을경우 시작시간이 작은수부터 큰수로 정렬을 하면 자동으로 최적의 시간만큼 정렬된다는걸 깨달았음.
//그리고 comparable과 comparator 사용법에 대해 다시 한 번 공부를 했고, Pair 클래스 구현 연습을 해보았음.
class Pair implements Comparable<Pair>{
	Integer y;
	Integer x;
	
	public Pair(Integer x, Integer y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Integer start()
	{
		return x;
	}
	public Integer end()
	{
		return y;
	}
	
	public int compareTo(Pair p)
	{
		if(end() == p.end())
		{
			return start() - p.start();
		}
		else
		{
			return end() - p.end();
		}
	}
	
}

public class Problem_1931 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		String[][] temp = new String[n][2];
		
		for(int i = 0 ; i < n ; i++)
		{
			temp[i] = bf.readLine().split(" ");
		}
		
		ArrayList<Pair> meetingTime = new ArrayList<>();
		
		for(int i = 0 ; i < n ; i++)
		{
			Pair pair = new Pair(Integer.parseInt(temp[i][0]), Integer.parseInt(temp[i][1]));
			meetingTime.add(pair);
		}
		
		Collections.sort(meetingTime);

//		for(int i = 0 ; i < n ; i++)
//		{
//			System.out.println(meetingTime.get(i).start() + " " + meetingTime.get(i).end());
//		}
		
		int tempStart = 0;
		int ans = 0;
		tempStart = meetingTime.get(0).end();
		int checkFirst2 = meetingTime.get(0).end();
//		int[] checkEnd = new int[n];
//		
//		for(int i = n - 1 ; i >= 0 ; i--)
//		{
//			checkEnd[(n-1) - i] = meetingTime.get(i).end();
//			
//		}

		meetingTime.remove(0);
		ans++;
		
//		Comparator<Pair> comparator = new Comparator<Pair>() 
//		{
//			public int compare(Pair a, Pair b)
//			{
//				int x, y;
//				x = a.end() - a.start();
//				y = b.end() - b.start();
//				
//				if(x==y)
//				{
//					return a.start() - b.start();
//				}
//				else
//				{
//					return x - y;
//				}
//			}
//		};
		
//		Collections.sort(meetingTime,comparator);


		for(int i = 0 ; i < n - 1 ; i++)
		{
			//System.out.println(checkEnd[cnt]);
			if(tempStart <= meetingTime.get(i).start())
			{
				
				ans++;
//				System.out.println(meetingTime.get(i).start() + " " + meetingTime.get(i).end());
				tempStart = meetingTime.get(i).end();
				
			}
			
//			if(i != 0 && meetingTime.get(i).start()-meetingTime.get(i).end() != meetingTime.get(i-1).start()-meetingTime.get(i-1).end())
//			{
//				tempStart = checkFirst2;
//			}
		}
		
		System.out.println(ans);
		bf.close();
		
	}
	

}



//getKey메서드와 for문이 돌면서 n^2을 만들어내기 때문에 시간초과남.
//C++의 pair 클래스를 직접 구현해서 comaparator나 comparto를 이용해서
//정렬하도록 문제를 푼다.

//public static void main(String[] args) throws NumberFormatException, IOException {
//	//끝나는 시간이 젤 일찍 끝나는 애를 처음으로 잡고
//	//다음부터는 회의시간 짧은 순으로 배치.
//	
//	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//	
//	int n = Integer.parseInt(bf.readLine());
//	
//	String[][] temp = new String[n][2];
//	
//	for(int i = 0 ; i < n ; i++)
//	{
//		temp[i] = bf.readLine().split(" ");
//	}
//	
//	int[] start = new int[n];
//	
//	HashMap<Integer, Integer> meetingTime = 
//			new HashMap<Integer,Integer>(n);
//	HashMap<Integer, Integer> endTime = 
//			new HashMap<Integer,Integer>(n);
//	
//	for(int i = 0 ; i < n ; i++)
//	{
//		start[i] = Integer.parseInt(temp[i][0]);
//		endTime.put(i, Integer.parseInt(temp[i][1]));
//		meetingTime.put(i, ((Integer.parseInt(temp[i][1])) - start[i]));
//	}
//	
//	
//	List<Integer> meetTimeList = new ArrayList<>(meetingTime.values());
//	List<Integer> endTimeList = new ArrayList<>(endTime.values());
//	
//	Collections.sort(meetTimeList);
//	Collections.sort(endTimeList);
//
//
//	int ans = 0;
//	
//	
//	
//	int x = getKey(endTime,endTimeList.get(0));
//	int tempStart = 0;
//	ans++;
////	System.out.println(start[x] + " " + endTime.get(x));
//	int[] key = new int[n];
//	for(int i = 0 ; i < n ; i++)
//	{
//		key[i] = getKey(meetingTime,meetTimeList.get(i));
//	}
//	
//	for(int i = 0 ; i < n ; i++)
//	{
//		
//		if(i==0)
//		{
//			tempStart = endTime.get(x);
//		}
//		
//		
//		if(key[i] == x)
//		{
//			meetingTime.remove(x);
//			continue;
//		}
//		
//		
//		if(tempStart < start[key[i]])
//		{
//			ans++;
////			System.out.println(start[key] + " " + endTime.get(key));
//			if(tempStart == meetingTime.get(meetingTime.size()-1))
//			{
//				tempStart = endTime.get(x);
//			}
//			else
//			{
//				tempStart = endTime.get(i);
//			}
//		}
//		meetingTime.remove(key[i]);
//	}
//	
//	System.out.println(ans);
//	
//
//	
//	bf.close();
//}
//
//public static <K,V> K getKey(HashMap<K,V> map , V value)
//{
//	for(K key : map.keySet())
//	{
//		if(value.equals(map.get(key)))
//		{
//			return key;
//		}
//	}
//	return null;
//}