package TYmoreTest;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MoreTest {
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
	driver.findElement(By.xpath("//a[text()='More']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@name='Campaigns']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	Thread.sleep(2000);
	String CompagineName="TestYantraa"+randNum;
	driver.findElement(By.name("campaignname")).sendKeys(CompagineName);
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.name("campaigntype"));
	Select sel= new Select(ele);
	sel.selectByValue("Partners");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
	Thread.sleep(1000);
    String CompagineTest = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
	if(CompagineTest.contains(CompagineName))
	{
		Reporter.log("testcase is pass", true);
	}else {
		Reporter.log("testcase is pass", false);
	}
	driver.findElement(By.xpath("(//a[text()='Opportunities'])[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//img[@alt='Create Opportunity...']")).click();
	Thread.sleep(1000);
    String  opportunityName = "Qspider"+randNum;
	driver.findElement(By.name("potentialname")).sendKeys(opportunityName);
	Thread.sleep(2000);
	if(opportunityName.contains(opportunityName))
	{
		Reporter.log("testcase is pass", true);
	}else {
		Reporter.log("testcase is pass", false);
	}
WebElement administrator=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
Actions act=new Actions(driver);
act.moveToElement(administrator).perform();
driver.findElement(By.xpath("//a[.='Sign Out']")).click();
}

	}


