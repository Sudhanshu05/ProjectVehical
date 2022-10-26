package testapplication;
import basiclasses.*;
public class Testvehicle{
	public static void Main(String [] args) {
		//We are creating the objects of class vehicle"
		Vehicle vc = new Vehicle("honda","sedan" ,1,20);
		
		
		// We are creating the objects of classs Car"
		Car cr = new Car("Ford","Suv", 4,6,4, true,1);
		
	
		// We are creating the objects of class Car"
		Outlander ol = new Outlander(12);
		
		//method for Vehicle class
		vc.steer(4);
		vc.move(4, 10);
		vc.stop();
		
		 //method for Car class
		cr.changegear(5);
		cr.changeVelocity(5, 20);
		//method for Outlander Class
		ol.speedchangegear(10);
		

		
		
	}
}
