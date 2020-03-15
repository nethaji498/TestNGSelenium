package eMexoCoreJava;

public class Main240202 {

	public static void main(String[] args) {
		
		//Vehicle v=new Vehicle();  we can not create object for abstract Class
		Car2 c=new Car2();
		c.engine();
		c.brand();
		c.wheelCount();
		c.vehicleType();
		
		Vehicle v= new Car2();
		v.engine();
		v.wheelCount();
		v.vehicleType();

	}

}
