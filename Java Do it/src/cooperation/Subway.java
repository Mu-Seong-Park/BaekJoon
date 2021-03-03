package cooperation;

public class Subway {
	int lineNumber;
	int passengerCount = 0;
	int money;
	
	public Subway(int lineNumber)
	{
		this.lineNumber = lineNumber;
		
	}
	
	public void take(int money)
	{
		passengerCount++;
		this.money += money;
	}
	
	public void showInfo()
	{
		System.out.println(lineNumber+"���� �°��� "+passengerCount+"���̰�, ������ "
				+money+"�Դϴ�.");
	}
}
