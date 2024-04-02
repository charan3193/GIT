package scriptonDemoQspiderapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0&scenario=1");
	Thread.sleep(1000);
	 WebElement ele=driver.findElement(By.id("email"));
	Actions act=new Actions(driver);
     act.sendKeys(ele,"sree").perform();
     driver.close();
     

	}

}
