import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
	
	public static WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() {
		
prop = new Properties();
        
        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//com_professional//sample_project//data.properties");
        prop.load(file);
        
        String browser_Name = prop.getProperty("browser");
        System.out.println(browser_Name);
        
        if(browser_Name.equals("chrome")) {
        	System.setProperty("webdriver.chrome.driver", "/Applications/WEbDrivers/chromedriver");
        	driver = new ChromeDriver();
        	
        }
        else if(browser_Name.equals("firefox")) {
        	System.setProperty("webdriver.gecko.driver", "");
        	driver = new FirefoxDriver();
        }
        else if(browser_Name.equals("internetexplorer")) {
        	System.setProperty("webdriver.ie.driver", "");
        	driver = new InternetExplorerDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
		return driver;
	}
	

}
