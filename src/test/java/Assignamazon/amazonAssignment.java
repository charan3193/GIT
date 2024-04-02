package Assignamazon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class amazonAssignment {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']")).sendKeys("iphone");
	Thread.sleep(1000);
	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(1000);
 driver.findElement(By.xpath("//u[text()='+5 colours/patterns']")).click();
List<WebElement> ele = driver.findElements(By.xpath("//img[@class='imgSwatch']"));
for(WebElement web: ele)
{
	System.out.println(web.getAttribute("alt"));
	}

}
}
