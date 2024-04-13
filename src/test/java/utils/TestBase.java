package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public WebDriver driver;

	public WebDriver webDriverManager() throws IOException {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//Global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("QAUrl");

		if (driver == null) {
			if(prop.getProperty("browser").equalsIgnoreCase( "chrome") ){
			System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir") + "//Users//Admin//Downloads//chromedriver-win64 (1)");
			driver = new ChromeDriver();
			}
			else {
				//firefox
			}
			driver.get(url);
			driver.manage().window().maximize();
		}
		return driver;
	}

}
