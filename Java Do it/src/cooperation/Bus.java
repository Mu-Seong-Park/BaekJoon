package cooperation;

public class Bus {
	
	int busNumber;
	int passengerCount = 0;
	int money;
	
	public Bus(int busNumber)
	{
		this.busNumber = busNumber;
		
	}
	
	public void take(int money)
	{
		passengerCount++;
		this.money += money;
	}
	
	public void showInfo()
	{
		System.out.println(busNumber+"���� �°��� "+passengerCount+"���̰�, ������ "
				+money+"�Դϴ�.");
	}

}
