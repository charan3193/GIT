package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class firefoxscreenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");	
		File Src=((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		Files.copy(Src, new File("./ScreenShots/img.png"));
	}
}
