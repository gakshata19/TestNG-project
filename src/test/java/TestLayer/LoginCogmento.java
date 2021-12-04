package TestLayer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginCogmento {

	public class Demo {
		WebDriver driver;

		@Parameters("browserType")
		@BeforeTest
		public void setUp(String browserType) {
			if(browserType.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\seleniumSetup\\chromedriver_win32 (1)\\chromedriver.exe");
				driver = new ChromeDriver();
				System.out.println("Chrome Browser Test cases");
			}
			else if(browserType.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				System.out.println("Edge Browser Test cases");
			}
			else if(browserType.equalsIgnoreCase("opera")) {
				WebDriverManager.operadriver().setup();
				driver = new OperaDriver();
				System.out.println("Opera Browser Test cases");
			}
			else {
				System.out.println("No Browser is Provided in XML file");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		@Test(priority=1)
		public void validateFunctinality() throws InterruptedException {
			driver.get("https://ui.cogmento.com/");
			Thread.sleep(7000);
			driver.findElement(By.name("email")).sendKeys("praf002@gmail.com");
			driver.findElement(By.name("password")).sendKeys("Pr@ful0812");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[text()='Login']")).click();
			String loggeduser=driver.findElement(By.className("user-display")).getText();
			System.out.println(loggeduser);
		}
		
	}
}