package thisex;

class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
	
}
public class ThisExample {

	public static void main(String[] args) {
		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();
		Birthday b3 = new Birthday();
		
		b1.setYear(2018);
		
		b1.printThis();
		System.out.println(b1);
		
		b2.printThis();
		System.out.println(b2);
		
		b3.printThis();
		System.out.println(b3);
		
	}

}
