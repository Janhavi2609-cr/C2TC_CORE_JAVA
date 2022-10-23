//constructor of abstract class is called when an instance of a inherited class is created

package com.capgemini.oopconceptdemo;

abstract class Demo8
{
	Demo8(){
		System.out.println("Base Constructor Called");
	}
	abstract void fun();
}
class Derived1 extends Demo8{
	Derived1(){
		System.out.println("Derived Constructor Called");
	}
	void fun()
	{
		System.out.println("Derived fun() called");
	}
}
public class AbstractDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived1 d = new Derived1();
	}
	  
}
