
public class Student {
	int sno;
	String studentName;
	int grade;
	String address;
	
	Student(int sno, int grade, String studentName){
		this.sno = sno;
		this.grade = grade;
		this.studentName = studentName;
	}
	
	Student() 
	{
		
	}
	public void showStudentInfo() 
	{
		System.out.println(studentName + "," + address);
	}
	

}
