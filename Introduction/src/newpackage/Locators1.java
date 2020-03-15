package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://login.salesforce.com");
	driver.findElement(By.id("username")).sendKeys("hello");
	driver.findElement(By.name("pw")).sendKeys("Password");
	//driver.findElement(By.className("button r4 wide primary")).click();
	driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
	System.out.println(driver.findElement(By.cssSelector("#error")).getText());
	driver.close();
	}

}
