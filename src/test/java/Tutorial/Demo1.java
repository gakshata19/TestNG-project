package Tutorial;

import org.testng.annotations.Test;

public class Demo1 {

	//@Test(/annotation)(dependsOnMethods = {"akshata"}, priority=1)(//attributes)
	@Test(dependsOnMethods = {"akshata"}, priority=1)
	public void vinod() {
		System.out.println("Vinod Khandare");
	}
	
	@Test(priority=2)
	public void akshata() {
			System.out.println("Akshata Gaikwad");
	}
	
	
}
