package singleton;

public class Company {

	private static Company instance = new Company();
	
	private Company()
	{
		
	}
	
	static public Company getInstance() {
		
		if(instance == null)
		{
			instance = new Company();
		}
		return instance;
	}
}
