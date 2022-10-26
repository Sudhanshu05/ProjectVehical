package basiclasses;

public class Vehicle {
	//attributes
	private String name;
	private String bodyType;
	private int currentVelocity ;
	private int currentDirection ;
	//Constructors
	public Vehicle(){
		this.currentVelocity = 0;
		this.currentDirection = 0;
		
	}
	public Vehicle(String Name , String Bdtype) {
		this.name = Name;
		this.bodyType= Bdtype;
		
	}
	public Vehicle(String Name , String Bdtype, int crv , int crd) {
		this.name = Name;
		this.bodyType= Bdtype;
		this.currentVelocity =  crv;
		this.currentDirection = crd;
	}
	//getters and setters
	public int getCurrentDirection() {
		return currentDirection;
	}
	public void setCurrentDirection(int currentDirection) {
		this.currentDirection = currentDirection;
	}
	public int getCurrentVelocity() {
		return currentVelocity;
	}
	public void setCurrentVelocity(int currentVelocity) {
		this.currentVelocity = currentVelocity;
	}
	public String getBodyType() {
		return bodyType;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Methods
	public void stop() {
		this.currentVelocity = 0;
		this.currentDirection = 0;
	}
	public void steer(int dir) {
		 this.currentDirection = dir;
	}
	public void  move(int dir , int vel) {
		this.currentDirection = dir;
		this.currentVelocity = vel;
	}
	

}
