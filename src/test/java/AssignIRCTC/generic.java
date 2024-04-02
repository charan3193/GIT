package AssignIRCTC;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class generic {
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
