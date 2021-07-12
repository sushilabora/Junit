package test;
import static org.junit.jupiter.api.Assertions.assertTrue;
public interface TestInterface {
 public void method1();
 
	 default void test1() {
		 assertTrue(StringFunctions.isPalindrome("madam"));
		 
	 }
 
 }
 

