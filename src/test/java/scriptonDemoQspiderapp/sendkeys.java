package scriptonDemoQspiderapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0&scenario=1");
	driver.findElement(By.id("email")).sendKeys("Charanasree84@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.id("password")).sendKeys("Charan@007");
	Thread.sleep(1000);
	driver.findElement(By.id("confirmPassword")).sendKeys("Charan@007");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[text()='Press Enter to Submit']")).click();
	Thread.sleep(1000);
	driver.quit();
	}

}
