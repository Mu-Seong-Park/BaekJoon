
public class ImplicitCoversion {

	public static void main(String[] args) {
//		byte bNum = 10;
//		int num = bNum;
//		
//		System.out.println(num);
//		
//		long lNum = 10;
//		float fNum = lNum;
//		
//		System.out.println(fNum);
//
//		
//		double dNum = fNum + num;
//		
//		System.out.println(dNum);
		
		String[] s = new String[5];
		
		s[0] = "abcde";
		s[1] = "ab";
		s[2] = "abc";
		s[3] = "abcde";
		s[4] = "abcd";
		
		for (int i = 0 ; i<5;i++)
		{
			if(i != 0 && s[i] == s[i-1])
			{
				System.out.println("무야호");
			}
			
			System.out.println("야호");
		}
		
		
	}

}
