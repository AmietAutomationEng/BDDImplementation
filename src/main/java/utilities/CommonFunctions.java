package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;


public class CommonFunctions {
	
	public static String readPropertiesFile(String KeyName) throws IOException {
		Properties prop = new Properties();
		FileInputStream input = null;
		String KeyValue = null;
		try {
			input = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\resources\\configuration.properties");
			prop.load(input);
			KeyValue = prop.getProperty(KeyName);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return KeyValue;
	}
	
	public static void launchBrowser(String URL, WebDriver driver){
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().deleteAllCookies();
	}

	public static void closeApplication(WebDriver driver) {
		driver.quit();
	}
}
