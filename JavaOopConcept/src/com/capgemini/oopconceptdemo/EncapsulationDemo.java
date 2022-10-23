//program to study encapsulation

package com.capgemini.oopconceptdemo;

public class EncapsulationDemo {

		// TODO Auto-generated method stub
		private String name;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
}
class Test{
	public static void main(String args[]) {
		EncapsulationDemo ed = new EncapsulationDemo();
		ed.setName("vikas");
		System.out.println(ed.getName());
	}
}