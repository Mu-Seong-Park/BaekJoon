package reference;

public class practice {

	public static void main(String[] args) {
		
		Student studentJames = new Student(100,"James");
		studentJames.setKorea(100);
		studentJames.setMath(100);
		
		Student studentKim = new Student(101,"Kim");
		studentKim.setKorea(50);
		studentKim.setMath(60);
		
		studentJames.showStudentInfo();
		studentKim.showStudentInfo();
	}

}
