import java.io.*;
import java.util.*;

// linkedlist�� get �� O(n)�̶�� ����� ���޾Ұ�,  ������ ������ �ð� �������� �ϰ�, ������ �ð��� ������� ���۽ð��� ���������� ū���� ������ �ϸ� �ڵ����� ������ �ð���ŭ ���ĵȴٴ°� ���޾���.
//�׸��� comparable�� comparator ������ ���� �ٽ� �� �� ���θ� �߰�, Pair Ŭ���� ���� ������ �غ�����.
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



//getKey�޼���� for���� ���鼭 n^2�� ������ ������ �ð��ʰ���.
//C++�� pair Ŭ������ ���� �����ؼ� comaparator�� comparto�� �̿��ؼ�
//�����ϵ��� ������ Ǭ��.

//public static void main(String[] args) throws NumberFormatException, IOException {
//	//������ �ð��� �� ���� ������ �ָ� ó������ ���
//	//�������ʹ� ȸ�ǽð� ª�� ������ ��ġ.
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