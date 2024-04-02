package implicitandexplicit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sync {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement elementAddress =driver.findElement(By.id("twotabsearchtextbox"));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.alertIsPresent());
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("twotabsearchtextbox"))));
		elementAddress.sendKeys("text");
		wait.until(ExpectedConditions.elementToBeClickable(elementAddress));
		wait.until(ExpectedConditions.visibilityOf(elementAddress));
		wait.until(ExpectedConditions.titleContains("Online"));
		wait.until(ExpectedConditions.urlContains("amazon"));
		wait.until(ExpectedConditions.elementToBeClickable(elementAddress));
		//fluentWait
		FluentWait wt=new FluentWait(driver);
		wt.pollingEvery(Duration.ofSeconds(200));
		wt.ignoring(NoAlertPresentException.class);
		wt.until(ExpectedConditions.elementToBeClickable(elementAddress));
		//customWait
		int count=0;
		while(count<20);
		try {
			elementAddress.click();
		}
		catch(Exception e) {
			Thread.sleep(1000);
			count++;
		}
		

	}

}
