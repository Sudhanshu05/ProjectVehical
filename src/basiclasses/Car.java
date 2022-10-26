package basiclasses;

public class Car extends Vehicle{
	//attributes
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentGears;
	//getters and setters
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public int getGears() {
		return gears;
	}
	public void setGears(int gears) {
		this.gears = gears;
	}
	public boolean isManual() {
		return isManual;
	}
	public void setManual(boolean isManual) {
		this.isManual = isManual;
	}
	public int getCurrentGears() {
		return currentGears;
	}
	public void setCurrentGears(int currentGears) {
		this.currentGears = currentGears;
	}
	//Constructors
	public Car( int rsMonth) {
		this.currentGears=1;
	}
	public Car(String Name , String Bdtype,int  Wheel, int door , int gear, boolean manual , int crgears) {
		super(Name,Bdtype);
		this.wheels = Wheel;
		this.doors = door;
		this.gears = gear;
		this.isManual = manual;
		this.currentGears = crgears;
	}
	public Car() {

	}
	public Car(int wheel, int door, int gear, boolean manual, int crgears) {
		this.wheels = wheel;
		this.doors = door;
		this.gears = gear;
		this.isManual = manual;
		this.currentGears = crgears;
	}
	//Methods
	public int changegear(int gear) {
		return this.currentGears = gear;
	}
	public void changeVelocity(int dir, int vel) {
		super.move(dir, vel);
	}
	
	
	
}

