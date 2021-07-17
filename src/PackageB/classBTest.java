package PackageB;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class classBTest {
	 @Tag("Sanity")
		@DisplayName("First Junit in Class B")
		@Test
		public void Test1() {
			System.out.println("Inside Test");
		}
}
