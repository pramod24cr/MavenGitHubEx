package com.lti.junitdemo;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demo.Product;

public class TestCases 
{
//	@Test
//	public void m5() 
//	{
//		ArrayList<String> list = new ArrayList<>();
//		list.add("Hello");
//		Assertions.assertFalse(list.isEmpty());
//		// assertTrue (list.isEmpty();
//	}
//	 
	@Test
	public void testCompanyName() 
	{
		Product p = new Product(101,"charger",10000.00,"Dmart");
		Assertions.assertEquals("Dmart",p.getCompanyName());
	}
	@Test 
	public void testEmptyArrayList() 
	{
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		Assertions. assertEquals(0, al.size()); 
		Assertions.assertTrue (al.isEmpty()); // assertTrue Method 
		// assertFalse (al.isEmpty();
	}
	@Test 
	public void testIntArrayList() 
	{
		ArrayList<Integer> myary = new ArrayList<Integer>(); 
		myary.add(5);
		myary.add(-14);
	}
	

}


  

 
