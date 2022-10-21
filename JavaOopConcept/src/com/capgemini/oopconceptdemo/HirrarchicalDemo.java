package com.capgemini.oopconceptdemo;

class Demo1{
	void disp1() {
		System.out.println("One");
	}
}
class Demo5 extends Demo1{
	void disp2() {
		System.out.println("Two");
	}
}
class Three extends Demo1{
	void disp3() {
		System.out.println("Three");
	}
}
class Four extends Demo1{
	void disp4() {
		System.out.println("Four");
	}
}
public class HirrarchicalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Four obj1 = new Four();
		obj1.disp1();
		obj1.disp4();
		
		Three obj2 = new Three();
		obj2.disp1();
		obj2.disp3();
		
		Two obj3 = new Two();
		obj3.disp1();
		obj3.disp2();
		
	}

}
