/*Abstract classes can also have final methods (methods that cannot be overridden). For
example, the following program compiles and runs fine*/

package com.capgemini.oopconceptdemo;

abstract class Base2{
	final void fun() {
		System.out.println("Derived Fun() called");
		
	}
}

class Derived2 extends Base2{
	
}
public class AbstractDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base2 b = new Derived2();
		b.fun();
	}

}
