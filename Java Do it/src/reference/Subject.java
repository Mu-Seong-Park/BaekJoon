package reference;

public class Subject {
	
	private String subjectName;
	private int score;
	
	Subject(String name)
	{
		this.subjectName = name;
	}
	public void setSubjectName(String name)
	{
		this.subjectName = name;
	}
	
	public int getScore()
	{
		return score;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setScore(int score) {
		this.score = score;
	}


	
}
