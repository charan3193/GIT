package TYAssigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class vtigerAssign {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver:8888/index.php?action=index&module=Home");
		Thread.sleep(2000);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("user_password")).sendKeys("admin",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("accountname")).sendKeys("abcd");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.name("industry"));
		ele.click();
		Select sel=new Select(ele);
		sel.selectByValue("Banking");
		WebElement ty = driver.findElement(By.name("accounttype"));
		ty.click();
		Select sel1=new Select(ty);
		sel1.selectByValue("Partner");
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(2000);
		
		
	}

}
