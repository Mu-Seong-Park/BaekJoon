
public class practice {

	
	public static void main(String[] args) {
		
		Student s1 = new Student(201611204,4,"박무성");
		Student s2 = new Student();// 디폴트 생성자.
		s1.address = "대구 북구 복현동 330-44번지";
		s1.showStudentInfo();
		System.out.println(s1);
	}
}
