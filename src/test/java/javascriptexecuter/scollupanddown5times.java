package javascriptexecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scollupanddown5times {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		for(int i=0;i<5;i++)
		{
			js.executeScript("window.scrollBy(0, 900)");
			Thread.sleep(1000);
		}
       for(int i=0;i<5;i++)
       {
    	   js.executeScript("window.scrollBy(0, -900)");
			Thread.sleep(1000);
		}
       }
	}


