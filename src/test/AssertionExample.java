package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AssertionExample {
	@Test
	public void test1() {
		String expected="Hi there";
		String actual="Hi there";
		Assertions.assertEquals(expected, actual);
		
		assertEquals(expected,actual);
		String [] expectedArray= {"one","Two","three"};
		String [] resultArray= {"one","Two","three"};
		assertArrayEquals(expectedArray,resultArray);
		boolean flag=true;
		assertTrue(flag);
		
		
	
}
}
