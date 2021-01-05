package salesforce;
//priyadharshini.dp.1011@gmail.com|priya@123
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public static WebDriver driver;
public static Properties prop ;
public static WebDriver initialisation() throws IOException {
	
	 prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\auhum\\eclipse-workspace\\PageObjectModel\\src\\main\\java\\salesforce\\config.properties");
	prop.load(fis);
	String browserName = prop.getProperty("browser");
	if(browserName.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\jar\\chromedriver.exe");
	driver= new ChromeDriver();
	
	
	}
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//driver.manage().window().maximize();
	return driver;
}
public void screenShot(String result) throws IOException {
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File(prop.getProperty("screenpath"+result+"screenshot.png")));

}
	
	

}
