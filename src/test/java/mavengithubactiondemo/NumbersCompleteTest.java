package mavengithubactiondemo;

import junit.framework.*;

public class NumbersCompleteTest extends TestCase{
	
	//test add method
	//GIVEN two numbers
	//WHEN they are added 
	//THEN the results should be the sum of the numbers
	public void testAdd() {
		int num1 = 5;
		int num2 = 4;
	
		Object o = NumbersComplete.sum(num1,num2);
		assert(o instanceof Integer);
		assert(o.equals(19));
	}
	
	//test subtract method
	//GIVEN two numbers
	//WHEN they are subtracted 
	//THEN the results should be the difference between the numbers
	public void testSubtract() {
		int num1 = 5;
		int num2 = 4;
	
		Object o = NumbersComplete.subtract(num1,num2);
		assert(o instanceof Integer);
		assert(o.equals(1));
	}
	
	//test largest method
	//GIVEN two numbers
	//WHEN they are compared 
	//THEN the results should be the largest number
	public void testLargest() {
		int num1 = 5;
		int num2 = 4;
	
		Object o = NumbersComplete.largest(num1,num2);
		assert(o instanceof Integer);
		assert(o.equals(5));
	}

	//test smallest method
	//GIVEN two numbers
	//WHEN they are compared 
	//THEN the results should be the smallest number
	public void testSmallest() {
		int num1 = 5;
		int num2 = 4;
	
		Object o = NumbersComplete.smallest(num1,num2);
		assert(o instanceof Integer);
		assert(o.equals(4));
	}
}
