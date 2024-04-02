package TYcontactsTest;

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

import AssignIRCTC.generic;

public class ContactsTest {
	@Test
	
		public void ContactsTest() throws InterruptedException
		{
		Random ran= new Random();
		int randNum= ran.nextInt(1000);
		
		generic g=new generic();
	  WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver:8888/index.php?action=index&module=Home");
		Thread.sleep(2000);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("user_password")).sendKeys("admin",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		Thread.sleep(2000);
		 WebElement el = driver.findElement(By.name("salutationtype"));
		 Select sel= new Select(el);
		 sel.selectByValue("Ms.");
		 Thread.sleep(2000);
		 String contactsName="Test";
		 driver.findElement(By.name("firstname")).sendKeys(contactsName);
		 Thread.sleep(2000);
		 String LastName="yantraa";
		 driver.findElement(By.name("lastname")).sendKeys(LastName);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@alt='Select']")).click();
		 Thread.sleep(2000);
		 g.switchToWindow(driver, "Accounts&action" );
		 Thread.sleep(2000);
         driver.findElement(By.xpath("//a[text()='sree']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 Thread.sleep(2000);
		//verify whether the organization is created or not
			String createdContacts = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
					if( createdContacts.contains(contactsName))
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
