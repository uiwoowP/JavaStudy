package cooperation;

public class TakeTrans {
	public static void main(String[] args) {
		Student james = new Student("james", 10000);
		Student peter = new Student("peter", 20000);
		Student star = new Student("star", 5000);
		
		Bus bus100 = new Bus(100);
		james.takeBus(bus100);
		james.showInfo();
		bus100.showInfo();
		
		Subway greenLine = new Subway("2호선");
		peter.takeSubway(greenLine);
		peter.showInfo();
		greenLine.showInfo();
		
		Taxi yellowTaxi = new Taxi("무지개택시");
		star.takeTaxi(yellowTaxi);
		star.showInfo();
		yellowTaxi.showInfo();
		
		
		
	}

}
