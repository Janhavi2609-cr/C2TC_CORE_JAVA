package com.capgemini.oopconceptdemo;

class Demo{
	void disp1() {
		System.out.println("One");
	}	
}
class Demo2 extends Demo{
	void disp2() {
		System.out.println("Two");
	}
	
}
class Demo3 extends Demo2{
	void disp3() {
		System.out.println("Three");
	}
	
}
class Demo4 extends Demo3{
	void disp4() {
		System.out.println("Four");
	}
}
public class MultiLevelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo4 obj1 = new Demo4();
		obj1.disp1();
		obj1.disp2();
		obj1.disp3();
		obj1.disp4();
	}

}
