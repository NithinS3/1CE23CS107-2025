package com.abstraction;
class Car implements Vehicle {
	@Override
	
	public void start() {
		System.out.println("Car class start method");
	}
  public void stop() {	
		System.out.println("Car class stop method");
	}

}

public class Abstractinterface {
	public static void main(String[] args) {
		Car c=new Car();
		c.start();
		c.stop();
		Vehicle.display();
		
	}

}
