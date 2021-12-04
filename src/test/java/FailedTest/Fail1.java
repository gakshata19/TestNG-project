package FailedTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Fail1 {

	@Test(priority=1)
	public void m1() {
		Assert.assertEquals("Selenium", "Selenium");
	}
	
	@Test(priority=2)
	public void m2() {
		Assert.assertFalse(false);
	}
	@Test(priority=3)
	public void m3() {
		Assert.assertNotEquals("Java", "Selenium");
	}
	
	@Test(priority=4)
	public void m4() {
		Assert.assertTrue(true);
	}
}
