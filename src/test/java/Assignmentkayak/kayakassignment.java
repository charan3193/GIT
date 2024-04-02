package Assignmentkayak;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class kayakassignment {

	public static void main(String[] args) throws InterruptedException {
    WebActionUtility wt= new WebActionUtility();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.kayak.co.in/");
	 Thread.sleep(4000);
    driver.findElement(By.xpath("//input[@placeholder='From?']")).sendKeys("Bangalore");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[text()='Bengaluru, Karnataka, India (BLR)']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@placeholder='To?']")).sendKeys("Hyderabad");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[text()='Hyderabad, Telangana, India (HYD)']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[@aria-label='Start date calendar input']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@aria-label='Monday 5 February, 2024']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[@aria-label='End date calendar input']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@aria-label='Thursday 8 February, 2024']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
    Thread.sleep(2000);
  wt.switchToWindow(driver,"bestflight");
  Thread.sleep(500);
  driver.findElement(By.xpath("//span[text()='Cheapest']")).click();
 List<WebElement> ele = driver.findElements(By.xpath("//div[@class='nrc6-price-section']"));
  int count=ele.size();
  System.out.println(count);
  for(WebElement el:ele)
  {
	  String text=el.getText();
	  System.out.println(text);
  }
  Thread.sleep(500);
  driver.quit();
	}

}
