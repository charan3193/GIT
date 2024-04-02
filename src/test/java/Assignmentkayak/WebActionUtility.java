package Assignmentkayak;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.WebDriver;

public class WebActionUtility {

	public void switchToWindow(WebDriver driver, String URL)
	{
		Set<String> set=driver.getWindowHandles();
		java.util.Iterator<String> it=set.iterator();
		while(it.hasNext())
		{
			String ids=it.next();
			driver.switchTo().window(ids);
			String url= driver.getCurrentUrl();
			if(url.contains(URL)) 
			{
				break;
			}
		}
	}

	
		
	}
	


