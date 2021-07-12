package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class CustomannoationEx {
	@CustomAnnotation
    public void test1() {
        
        assertTrue(StringFunctions.isPalindrome("madam"));
        
        
    }
    
    @DisplayName("Negative Test")
    @RepeatedTest(5)
    @Test
    public void test2() {
        
        
        assertFalse(StringFunctions.isPalindrome("nikunj"));
    }
}
