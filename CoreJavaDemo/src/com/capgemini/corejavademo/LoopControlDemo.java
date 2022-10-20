//program to demonstrate loop control statement (break and continue)

package com.capgemini.corejavademo;

public class LoopControlDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1; i<=10; i++)
        {
       	 if(i == 1)
       	 {
       		 continue;   // break;
       	 }
       	 System.out.println(i);
        }

	}

}
