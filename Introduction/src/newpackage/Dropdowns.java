package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Dropdowns {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\Softwares\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.cssSelector("div#divpaxinfo")).click();
		
		Select s=new Select(driver.findElement(By.cssSelector("select#ctl00_mainContent_ddl_Adult")));
		s.selectByValue("2");
		s.selectByIndex(5);
		s.selectByVisibleText("8");
		
int i=1;
		
		while(i<5) {
			
			driver.findElement(By.cssSelector("div#divpaxinfo")).click(); //write code that need t repeat
			i++;
		}
		
		for(int j=1;j<5;j++) {
			
			driver.findElement(By.cssSelector("div#divpaxinfo")).click(); //write code that need t repeat
			
		}
		
		System.out.println("Passed");
		driver.close();

	}

}
