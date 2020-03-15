package practicePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Facebook {
	WebDriver driver;

	@BeforeTest
	public void browserInvoke() {
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.setHeadless(true);

		driver = new ChromeDriver(co);
	}

	@Test
	public void faceboolLogin() throws InterruptedException {

		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("UserName");
		System.out.println(driver.getTitle());
//		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		SoftAssert so=new SoftAssert();
		so.assertEquals("Login |Salesforce", driver.getTitle());
//		Assert.assertEquals("Login | Salesforce", driver.getTitle());
		System.out.println("Passed");
		so.assertAll();
	}

	@AfterTest
	public void browserClose() {
		driver.close();
	}

}
