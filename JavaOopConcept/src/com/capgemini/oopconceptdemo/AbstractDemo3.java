/*abstract class without any abstract method. This allows us to
create classes that cannot be instantiated, but can only be inherited.
*/

package com.capgemini.oopconceptdemo;

abstract class Demo9
{
	void fun()
	{
		System.out.println("Base fun() called");
	}
}

class Derived3 extends Demo9{
	
}

public class AbstractDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived3 d = new Derived3();
		d.fun();
	}

}
