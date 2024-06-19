package AmazonTest;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import AutomationCore.BaseClass;

public class AmazonTestCases extends BaseClass{
	WebDriver driver;
	SoftAssert softassert;
	@BeforeMethod
	@Parameters("browser")
	public void initialization(String browser) {
		driver=browserinitialization(browser);
		softassert=new SoftAssert();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println("Before method Example");
	}
	@Test(priority=2)
	public void tc01() throws InterruptedException
	{
		System.out.println("test case1");
		
	//	driver.navigate().to("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
	//	driver.navigate().back();
	//	driver.navigate().forward();
	//	driver.navigate().refresh();
	//	driver.close();
	//	driver.quit();
	 // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	//    driver.findElement(By.name("field-keywords")).clear();
	//    driver.findElement(By.className("nav-input nav-progressive-attribute"));
	//    driver.findElement(By.linkText("Shop on Amazon Business")).click();
	 //   driver.findElement(By.partialLinkText("Conditions of")).click();
		
	   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Smart TV");  
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    List<WebElement> products=driver.findElements(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));
	    int productsize=products.size();
	    System.out.println(productsize);
	    softassert.assertEquals(productsize, 23);
	  
	    
	    //Actions action=new Actions(driver);
	 // action.contextClick().build().perform();
	   // action.doubleClick(driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[4]"))).build().perform();
	    String value=driver.findElement(By.xpath("//span[text()='Deals & Discounts']")).getText();
	    System.out.println(value);
	    softassert.assertEquals(value, "Deals & Discounts");
	    String value2=driver.findElement(By.xpath("//span[text()='Deals & Discounts']")).getTagName();
	    System.out.println(value2);
	    softassert.assertEquals(value2, "span");
	   String value3 =driver.findElement(By.id("twotabsearchtextbox")).getAttribute("name");
	   System.out.println(value3);
	   softassert.assertEquals(value3, "field-keywords");
	   driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
	   driver.findElement(By.id("s-result-sort-select_2")).click();
	  // driver.findElement(By.id("twotabsearchtextbox")).clear();
		  //  driver.findElement(By.className("s-image")).click();

	   /*driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
	   WebElement dropdown =driver.findElement(By.name("country"));
	   Select obj=new Select(dropdown);
	   obj.selectByValue("AMERICAN SAMOA");
	   obj.selectByVisibleText("ALGERIA");*/
	   
	  /* driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
	   WebElement source=driver.findElement(By.id("column-a"));
	   WebElement target=driver.findElement(By.id("column-b"));*/
	 // Actions action=new Actions(driver);
	  // action.dragAndDrop(source, target);
	  
	  // driver.navigate().to("https://www.amazon.in/");
	  // WebElement a=  driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
	  // action.moveToElement(a).build().perform();
	   
	   driver.navigate().to("https://www.91mobiles.com/phonefinder.php");
	   driver.findElement(By.id("latestandexpectprice101000001")).click();
	   driver.findElement(By.id("latestandexpectprice2000003000001")).click();
	   driver.findElement(By.id("mobraminmb614401000000")).click();
	   boolean buttonselectedstatus=driver.findElement(By.id("mobraminmb614401000000")).isSelected();  
	   System.out.println("buttonselectedstatus");
		boolean pricerangeboxVerification= driver.findElement(By.xpath("//div[contains(@class,'price_tag_finder new-finder-left')]")).isDisplayed();
		System.out.println("pricerangeboxVerification");
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		boolean signInsecurelyButton=driver.findElement(By.id("nav-search-submit-button")).isEnabled();
		System.out.println("signInsecurelyButtonn");
		
		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		driver.switchTo().alert().accept();
		softassert.assertAll();
		
	}
	@Test(priority=1)
	public void tc02() throws InterruptedException {
		/*driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]")));
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]")).click();
		String parent=driver.getWindowHandle();
		Set<String> s=driver.getWindowHandles();
		Iterator<String> i1=s.iterator();
		while(i1.hasNext()) {
			String childWindow=i1.next();
			if(!parent.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
			}
		}
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.navigate().refresh();
		Wait wait2=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
				
		
		driver.navigate().to("https://demoqa.com/frames");
		driver.switchTo().frame("frame1");
		String text =driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();*/
		
		        //table handling 
		driver.navigate().to("https://selenium.qabible.in/table-sort-search.php");
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Bruno");
		String age= driver.findElement(By.xpath("(//tr[@class='odd']//td)[4]")).getText();
		System.out.println(age);
		driver.findElement(By.xpath("//input[@type='search']")).clear();
		driver.navigate().refresh();
		List<WebElement> data = driver.findElements(By.xpath("//tr[@class='odd' or class='even']//td"));
		ArrayList<String>value1=new ArrayList<String>();
		for(int i=0;i<data.size();i++) {
			//String elementText=data.get(i).getText();
			value1.add(data.get(i).getText());
		}
		//System.out.println(value1);
		String name=value1.get(5);
		System.out.println(name);
		System.out.println("............");
		System.out.println(value1);
		
		ArrayList<String>value2=new ArrayList<String>();
		
		value2.add("Airi Satou");
		value2.add("Accountant");
		value2.add("Tokyo");
		value2.add("33");
		value2.add("2008/11/28");
		value2.add("$162,700");
		
		value2.add("Angelica Ramos");
		value2.add("Chief Executive Officer (CEO)");
		value2.add("London");
		value2.add("47");
		value2.add("2009/10/09");
		value2.add("$1,200,000");
		
		value2.add("Ashton Cox");
		value2.add("Junior Technical Author");
		value2.add("San Francisco");
		value2.add("66");
		value2.add("2009/01/12");
		
		value2.add("Bradley Greer");
		value2.add("Software Engineer");
		value2.add("London");
		value2.add("41");
		value2.add("2012/10/13");
		
		System.out.println(value2);
		boolean compareValue=value1.equals(value2);
		System.out.println(compareValue);
		}
	
	
	@Test
	public void tc03() {
		System.out.println("testcase3");
	     //java script executor
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("smart tv");
			//driver.findElement(By.id("nav-search-submit-button")).click();
			WebElement element=driver.findElement(By.id("nav-search-submit-button"));
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
			       //page scrolling
			executor.executeScript("window.scrollBy(0,1000)", "");
	
	      List<WebElement>productlist=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	      int productsize=productlist.size();
	      System.out.println("No of products="+productsize);
	      Assert.assertEquals(productsize, 23);
	}
	
	
	@BeforeSuite
	public void beforeSuiteExample() {
		System.out.println("Before suite Example");
	}
	
	@AfterSuite
	public void afterSuiteExample() {
		System.out.println("After suite Example");
	}
	
	@BeforeTest
	public void beforeTestExample() {
		System.out.println("Before TestExample");
	}
	
	@AfterTest
	public void afterTestExample() {
		System.out.println("After Test Example");
	}
	
	@AfterMethod
	public void afterMethodExample() {
		System.out.println("After method Example");
	}
	
	@BeforeClass
	public void beforeClassExample() {
		System.out.println("Before class Example");
	}
	
	@AfterClass
	public void afterClassExample() {
		System.out.println("After Class Example");
	}
	@Test(dataProvider="testData")
	public void tc04(String value1,String value2) {
		System.out.println("Testcase4");
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.findElement(By.id("value-a")).sendKeys(value1);
		driver.findElement(By.id("value-b")).sendKeys(value2);
		driver.findElement(By.id("button-two")).click();
	}
	@DataProvider(name="testData")
	public Object[][] testDataFeed(){
		Object[][] dataset=new Object[2][2];
		dataset[0][0]="5";
		dataset[0][1]="1";
		dataset[1][0]="6";
		dataset[1][1]="2";
		return dataset;
	}
	
}
