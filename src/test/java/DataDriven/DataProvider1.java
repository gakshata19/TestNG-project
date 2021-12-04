package DataDriven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {

	@Test(dataProvider= "FreeCRM")
	public void freeCrmLogin(String username, String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://ui.cogmento.com/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		String name= driver.findElement(By.className("user-display")).getText();
		System.out.println("Username: "+name);
		Thread.sleep(5000);
		driver.close();
	}
	
	@DataProvider (name ="FreeCRM")
	public Object [][] exceldata() throws IOException{
		ExcelReader ex=new ExcelReader("C:\\Users\\akshatag\\Desktop\\Automation\\User.xlsx");
		int count=ex.rowcount(2);
		Object [][] data=new Object[count][2];
		for(int i=0; i<count; i++) {
			data[i][0]=ex.getdata(2,i,0);
			data[i][1]=ex.getdata(2,i,1);
		}	
		return data;
	}
	
	
}
