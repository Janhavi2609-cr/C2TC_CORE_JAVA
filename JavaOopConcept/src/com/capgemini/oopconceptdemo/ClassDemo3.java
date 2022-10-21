package com.capgemini.oopconceptdemo;

public class ClassDemo3 {
	
	private String doors;
	private int speed;
	
	public String getDoors() {
		return doors;
	}


	public void setDoors(String doors) {
		this.doors = doors;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String run() {
		if(doors.equals("closed") && speed > 0) {
			return "running";
		}
		else
			return "not running";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
