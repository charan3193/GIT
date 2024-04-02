package AssignIRCTC;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCassignment {

	public static void main(String[] args) throws InterruptedException {
		generic g=new generic();
	WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[text()=' BUSES ']")).click();
	    Thread.sleep(3000);
	    g.switchToWindow(driver, "home" );
	    Thread.sleep(2000);
		driver.findElement(By.id("departFrom")).sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("goingTo")).sendKeys("Hyderabad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Hyderabad']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("departDate")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='5']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Search Bus ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='After 6 pm']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[text()='Select Seat'])[19]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='Sleeper_V'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("bordTime")).click();
		Thread.sleep(1000);
         driver.findElement(By.xpath("//input[@type='radio']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("debordTime")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Proceed to Book']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("profile-tab")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("emailLogin")).sendKeys("Charanasree84@gmail.com",Keys.TAB,"7993758261",Keys.TAB,Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}
}