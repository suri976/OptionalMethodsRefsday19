package com.java8;

import java.util.Optional;


public class TestOptional {
	
	static void method(String input)
	{
		if(input!=null)
		{
			System.out.println(input.length());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str=null;
		String str2=new String ("hello");
		int x= str2.length();
		
		//optional
		//Optional optional1= Optional.of(str); //throws nullpointer exception
		//optional should not contain any null value
		// otherwise it will show error
		Optional optional1= Optional.of(str2);
		System.out.println(optional1.get());
		
		Optional optional2= Optional.of(x);
		System.out.println(optional2.get());
		
		//to avoid null pointer exception use ofNullable
		
		
		//Optional optional3= Optional.ofNullable(str);
		//System.out.println(optional3.get());//no such value present
		
		Optional optional3= Optional.ofNullable(str);
		if(optional3.isPresent())
			System.out.println(optional3.get());//doesnot throw no such value present
		else
			System.out.println("No value present");
		
		Optional optional4= Optional.ofNullable(str);
	    System.out.println(optional4.orElse("Alternate function"));
	    
	    Optional optional5= Optional.ofNullable(str2);
	    System.out.println(optional5.orElse("Alternate function"));
		
		
		
		
		
		
		
		
		
		
	}

}
