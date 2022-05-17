package com.java8;

import java.util.ArrayList;
import java.util.List;

class Utility
{
	
	Utility()
	{
		System.out.println("From default constructor of Utility()");
	}
	void method()
	{
		System.out.println("from instance method");
	}
	
	static void method2()
	{
		System.out.println("from static  method2()");
	}
}

interface  TestRefs
{
	void substitute();
}

public class TestMethodReferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility util = new Utility();
		TestRefs ref = util::method;//instance method reference
		ref.substitute();
		
		TestRefs ref2 = Utility::method2; // static method reference
		ref2.substitute();
		
		TestRefs ref3= Utility::new; //constructor is calling 
		ref3.substitute();
		
		//List<Integer> list=new ArrayList(1,2,3,4,5);
		
		
		
	}

}
