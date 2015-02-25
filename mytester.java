//package MyCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class mytester {

	
	
	// test factorial of zero
	@Test
	public void test0factorial() {
		MyCalculator fac = new MyCalculator();
		int res = fac.nfactorial(0);
		assertEquals("0!",1,res,0.0);
	}

	// test factorial of positive numbers
	@Test
	public void testnfactorial() {
		MyCalculator fac = new MyCalculator();
		int res = fac.nfactorial(1);
		assertEquals("1!",1,res,0.0);
	}
	
	// test factorial of negative numbers
	@Test
	public void testnegfactorial() {
		MyCalculator fac = new MyCalculator();
		int res = fac.nfactorial(-1);
		assertEquals("-1!",-1,res,0.0);
	}
	
	
	// search middle
	@Test
	public void binarymsearch() {
		MyCalculator fac = new MyCalculator();
		int[] a = {1,2,3,4,5};
		int res = fac.binarySearch(a, 3);
		assertEquals("a",2,res,0.0);
	}
	
	// search upper
	@Test
	public void binaryusearch() {
		MyCalculator fac = new MyCalculator();
		int[] a = {1,2,3,4,5};
		int res = fac.binarySearch(a, 5);
		assertEquals("a",4,res,0.0);
	}
	
	// search lower
	@Test
	public void binarylsearch() {
		MyCalculator fac = new MyCalculator();
		int[] a = {1,2,3,4,5};
		int res = fac.binarySearch(a, 1);
		assertEquals("a",0,res,0.0);
	}
	
	// search not in array
	@Test
	public void binarynotsearch() {
		MyCalculator fac = new MyCalculator();
		int[] a = {1,2,3,4,5};
		int res = fac.binarySearch(a, 6);
		assertEquals("a",1,res,0.0);
	}
	
}