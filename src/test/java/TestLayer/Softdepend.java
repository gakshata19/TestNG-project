package TestLayer;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Softdepend {
	
	@BeforeTest
	public void bt() {
		System.out.println("SD Before Test");
	}
	@BeforeClass
	public void bc() {
		System.out.println("SD Before Class");
	}
	@Test(dependsOnMethods= {"testp"}, alwaysRun=true)
	public void testm() {
		System.out.println("Test Case M");//Skip
	}
	
	@Test(priority=2)
	public void testp() {
		System.out.println("Test Case P");//fail
		Assert.assertEquals(12, 130);
	}
	
	
	@Test(priority=1)
	public void testb() {
		System.out.println("Test Case B");//1
	}
	
	@Test(priority=4)
	public void testk() {
		System.out.println("Test Case K");//2
	}
	
	@AfterClass
	public void ac() {
		System.out.println("SD After Class");
	}
	
	@AfterTest
	public void at() {
		System.out.println("SD After Test");
	}

}
