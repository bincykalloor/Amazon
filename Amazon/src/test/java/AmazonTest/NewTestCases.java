package AmazonTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import AutomationCore.BaseClass;

public class NewTestCases extends BaseClass{
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void initialization(String browser) {
		driver=browserinitialization(browser);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println("Before method Example");
	}
	@Test(groups= {"Regression Test"})
	public void tc01() {
		System.out.println("testcase1");
	}
	
	@Test(groups= {"Regression Test"})
	public void tc02() {
		System.out.println("testcase2");
	}
	@Test(groups= {"Regression Test"})
	public void tc03() {
		System.out.println("testcase3");
	}
	@Test(groups= {"Smoke Test"})
	public void tc04() {
		System.out.println("testcase4");
		}
	@Test(groups= {"Smoke Test"})
	public void tc05() {
		System.out.println("testcase5");
	}
	
}
