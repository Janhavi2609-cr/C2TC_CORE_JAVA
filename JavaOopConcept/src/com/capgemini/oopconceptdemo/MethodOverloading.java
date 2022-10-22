package com.capgemini.oopconceptdemo;

public class MethodOverloading {
	
	void add(int x, int y) {
		System.out.println("Add is " + (x+y));
	}
	
	void add(int x, int y, int z) {
		System.out.println("Add is " +(x+y+z));;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		obj.add(5, 4);
		obj.add(5, 5,4);
	}

}
