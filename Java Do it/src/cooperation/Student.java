package cooperation;

public class Student {

	String name;
	int grade;
	int budget;
	
	public Student(String name, int budget){
		
		this.name = name;
		this.budget = budget;
		
	}
	
	public void takeBus(Bus bus)
	{
		bus.take(1000);
		budget = budget - 1000;
	}
	
	public void takeSubway(Subway subway)
	{
		subway.take(1000);
		budget = budget - 1000;
	}
	
//	public void takeTrans(Trans trans)
//	{
//		
//	}
	
	public void showInfo()
	{
		System.out.println(name+"���� ���� ���� "+budget+"�Դϴ�.");
	}
}
