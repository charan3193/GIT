package TYorganisationtest;

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

public class OrganisationTest {
	
	@Test
	public void  OrganisationTest() throws InterruptedException {
		
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
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		Thread.sleep(2000);
		String OrganisationName="TestYantra"+randNum;
		driver.findElement(By.name("accountname")).sendKeys(OrganisationName);
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.name("industry"));
		ele.click();
		Select sel=new Select(ele);
		sel.selectByValue("Banking");
		WebElement ty = driver.findElement(By.name("accounttype"));
		ty.click();
		Select sel1=new Select(ty);
		sel1.selectByValue("Partner");
		//click on save button
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(2000);
		//verify whether the organization is created or not
		String createdOrganisation = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
				if(createdOrganisation.contains(OrganisationName))
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
