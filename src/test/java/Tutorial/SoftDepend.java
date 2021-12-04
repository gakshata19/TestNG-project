package Tutorial;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftDepend {
	@Test(dependsOnMethods= {"testp"})
	public void testm() {
		System.out.println("Test Case M");//Skip
	}
	
	@Test(priority=2)
	public void testp() {
		System.out.println("Test Case P");//fail
		Assert.assertEquals(12, 130);
		System.out.println("test p ended");
	}
	
	
	@Test(priority=1)
	public void testb() {
		System.out.println("Test Case B");//1
		SoftAssert soft= new SoftAssert();
		soft.assertEquals(12,20);
		//soft.assertAll();
		System.out.println("test b ended");
	}
	
	@Test(priority=4)
	public void testk() {
		System.out.println("Test Case K");//2
	}

}
