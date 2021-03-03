package reference;

public class Student {
	int studentID;
	String studentName;
	
	Subject korea;
	Subject math;
	
	Student()
	{
		korea = new Subject("국어");
		math = new Subject("수학");
	}
	
	Student(int id, String name)
	{
		this.studentID = id;
		this.studentName = name;
		
		korea = new Subject("국어");
		math = new Subject("수학");
	}
	
	public void setKorea(int score)
	{
		korea.setScore(score);
	}
	
	public void setMath(int score)
	{
		math.setScore(score);
	}
	
	public void showStudentInfo()
	{
		int total = korea.getScore() + math.getScore();
		
		System.out.println(studentName + ": "+total);
	}
}
