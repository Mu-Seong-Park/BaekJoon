package StaticEX;

public class Studnet {
	private static int serialNum = 10000;
	public static int getSerialNum() {
		int i = 10; // ��������
		
		i++;

		System.out.println(i);
		return serialNum; // ����ƽ ����, Ŭ���� ����
	}

	int studentID; // �������, �ν��Ͻ� ����
	String name;
	
	public Studnet() {
		serialNum++;
		studentID = serialNum;
	}

}
