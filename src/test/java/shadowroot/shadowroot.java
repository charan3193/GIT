package shadowroot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowroot {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		//JavascriptExecutor js=(JavascriptExecutor)driver;
	//	WebElement element =(WebElement)js.executeScript("return document.querySelector('#userName')"
	//	             +".shadowRoot.querySelector('#app2').shadowRoot.querySelector('#pizza')");
      //   element.sendKeys("pizza");
		      //other way
		             WebElement shadowElement1=driver.findElement(By.xpath("//div[@id='userName']"));
		             SearchContext shadowRoot1 =shadowElement1.getShadowRoot();
		             WebElement shadowElement2 =shadowRoot1.findElement(By.cssSelector("#app2"));
		             SearchContext shadowRoot2=shadowElement2.getShadowRoot();
		             shadowRoot2.findElement(By.cssSelector("#pizza")).sendKeys("pizza");
		             
	}

}
