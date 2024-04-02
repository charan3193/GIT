package javascriptexecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolltillbottonofthepage {

	public static void main(String[] args) throws InterruptedException {
	//scroll till bottom of the page
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		 Thread.sleep(1000);
		 //scroll down
		JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(1000);
        //scroll up
       JavascriptExecutor js1= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
        //scroll till Element
     WebElement ele1 = driver.findElement(By.xpath("//a[text()='Facebook']"));
     js.executeScript("arguments[0].scrollIntoView()", ele1);
        //send data to text field
        JavascriptExecutor js2= (JavascriptExecutor) driver;
        WebElement ele2=driver.findElement(By.xpath("twotabsearchtextbox"));
        ele2.sendKeys("shoes");
        js.executeScript("arguments[0].value=arguments[1]", ele2,"puma shoes");
        //click on a element
        JavascriptExecutor js3= (JavascriptExecutor) driver;
        WebElement searchBtn=driver.findElement(By.id("nav-search-submit-button"));
        js.executeScript("arguments[0].clcik()",searchBtn);
        //click on element by ID 
        JavascriptExecutor js4= (JavascriptExecutor) driver;
        js.executeScript("document.getElementByid('nav-search-submit-button').click()");
        //get the text of the element from facebook
        driver.get("https://www.facebook.com/");
        JavascriptExecutor js5= (JavascriptExecutor) driver;
        WebElement element=driver.findElement(By.xpath("//button[@name='login']"));
        String text=(String)js.executeScript("return arguments[0].value;", element);
         System.out.println(text);
	}

}
