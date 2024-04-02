package scriptonDemoQspiderapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class copypastepwd {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0&scenario=1");
	WebElement	ele=driver.findElement(By.id("password"));
		ele.sendKeys("abcd");
		Thread.sleep(1000);
		WebElement	ele1=driver.findElement(By.id("confirmPassword"));
		ele.sendKeys(Keys.CONTROL+"a");
		ele.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(1000);
		ele1.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(1000);

	}

}
