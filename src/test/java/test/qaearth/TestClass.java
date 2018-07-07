package test.qaearth;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass {
	@Parameters("browser")
	@Test(groups="smoke")
	public void test(@Optional("chrome") String browser) {
		System.out.println("Browser "+browser);
	}
}
