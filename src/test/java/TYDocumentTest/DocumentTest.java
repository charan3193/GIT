package TYDocumentTest;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.Test;

public class DocumentTest {
	@Test
	public void MoreTest() throws InterruptedException {
		Random ran= new Random();
		int randNum= ran.nextInt(1000);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver:8888/index.php?action=index&module=Home");
		Thread.sleep(2000);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("user_password")).sendKeys("admin",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Documents']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Create Document...']")).click();
		Thread.sleep(2000);
		String DocumentName="Spider"+randNum;
		driver.findElement(By.name("notes_title")).sendKeys( DocumentName);
		Thread.sleep(2000);
		WebElement frame1 = driver.findElement(By.xpath("//td[@class='dvtCellLabel']"));
		driver.switchTo().frame(0);
	    Thread.sleep(2000);
		
}
}
