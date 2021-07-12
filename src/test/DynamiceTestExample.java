package test;

import org.junit.jupiter.api.TestFactory;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DynamicTest;

public class DynamiceTestExample {
	@TestFactory
	public Collection<DynamicTest> method1(){
	   return Arrays.asList(
               DynamicTest.dynamicTest("Positive Test",
                       () -> assertTrue(StringFunctions.isPalindrome("madam"))),
                 DynamicTest.dynamicTest("Negative Test Test",
                   () -> assertFalse(StringFunctions.isPalindrome("nikunj"))));
     
 }

}
