//program to study the concept of classes and objects.

package com.capgemini.oopconceptdemo;

class Car{
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.setSpeed(10);
		System.out.println(car.getSpeed());
	}

}
