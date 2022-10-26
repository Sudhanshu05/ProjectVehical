package basiclasses;

public class Outlander extends Car {
	//attributes
	private int roadServiceMonth;
	
	//gettor and settor
	public int getRoadServiceMonth() {
		return roadServiceMonth;
	}

	public void setRoadServiceMonth(int roadServiceMonth) {
		this.roadServiceMonth = roadServiceMonth;
	}
	//Constructor
	public Outlander() {}
	public Outlander(int rsMonth) {
		this.roadServiceMonth = rsMonth;
	}
	
	
	//method
	public int speedchangegear(int speed) {
		int gear =0;
		if(speed ==0) {
			super.stop();
		}else if(speed <= 1 && speed >=20) {
			gear = 1;
		}else if(speed <=21 && speed >=30) {
			gear = 2;
		}else if(speed <=31 && speed >=50) {
			gear = 3;
		}else if (speed <=51) {
			gear = 5;
		}
		 return gear;
	}
}
