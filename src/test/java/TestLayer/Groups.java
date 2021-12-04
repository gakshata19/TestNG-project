package TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Groups {
	
//	@BeforeSuite
//	public void testa() {
//		System.out.println("Before Suite");
//	}
	@BeforeTest
	public void testb() {
		System.out.println("Before Test");
	}
	@BeforeClass
	public void testc() {
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void testd() {
		System.out.println("Before Method");
	}
	@Test(groups= {"Regression Testing"}, alwaysRun=true)
	public void google() {
		System.out.println("Google");
	}
	
	@Test(groups= {"Sanity Testing"})
	public void facebook() {
		System.out.println("Facebook");
	}
	
	@Test(groups= {"Vinod"})
	public void amazon() {
		System.out.println("Amazon");
	}
	
	@AfterMethod
	public void testd1() {
		System.out.println("After Method");
	}
	@AfterClass
	public void testc1() {
		System.out.println("After Class");
	}
	@AfterTest
	public void testb1() {
		System.out.println("After Test");
	}
//	@AfterSuite
//	public void testa1() {
//		System.out.println("After Suite");
//	}
}
