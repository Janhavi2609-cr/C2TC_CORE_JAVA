package com.capgemini.oopconceptdemo;

class Super{
	void disp() {
		System.out.println("Super class");
	}
}
class subclass extends Super{
	
	@Override
	void disp() {
		super.disp();
		System.out.println("Only Super class");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subclass obj = new subclass();
		obj.disp();
	}

}
