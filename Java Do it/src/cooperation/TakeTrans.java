package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student james = new Student("James", 50000);
		Bus bus3000 = new Bus(3000);
		Subway line2 = new Subway(2);
		james.takeBus(bus3000);
		james.takeSubway(line2);
		
		james.showInfo();
	}

}
