package StaticEX;

public class StudentTest1 {

	public static void main(String[] args) {
		
		Studnet s1 = new Studnet();
		System.out.println(s1.studentID);
		
		Studnet s2 = new Studnet();
		System.out.println(s2.studentID);
		
		System.out.println(Studnet.getSerialNum());

	}

}
