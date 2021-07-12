package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstJunittest {
@BeforeEach
public void beforeEachMethod() {
	System.out.println("Inside Before each ");
}
@Test
public void testcase1() {
	System.out.println("Inside Test case1");

}

@AfterEach
public void afterEachMethod() {
	System.out.println("Inside After each ");
}
}

