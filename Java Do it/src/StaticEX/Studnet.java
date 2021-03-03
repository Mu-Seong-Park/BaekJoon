package StaticEX;

public class Studnet {
	private static int serialNum = 10000;
	public static int getSerialNum() {
		int i = 10; // 지역변수
		
		i++;

		System.out.println(i);
		return serialNum; // 스태틱 변수, 클래스 변수
	}

	int studentID; // 멤버변수, 인스턴스 변수
	String name;
	
	public Studnet() {
		serialNum++;
		studentID = serialNum;
	}

}
