package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		
		
		////tagname[@attribute='value'] -Xpath
		/*driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9502475789");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("9502475789");
		driver.findElement(By.xpath("//input[@value='Log In']")).click(); */
		
		//tagname[attribute='value'] -CSS
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Username");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Password");
		driver.findElement(By.cssSelector("input[aria-label='Log In']")).click();
		
	}

}
