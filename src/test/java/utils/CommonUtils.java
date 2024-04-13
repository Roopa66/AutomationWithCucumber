package utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class CommonUtils {

	
	public static void takeScreenshot(WebDriver driver, String imagename) {
		if(driver!=null) {
			String fileName=System.getProperty("user.dir")+File.separator+"target/screenshots/"+imagename+".png";
			File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			File destination =new File(fileName);
			try {
				Files.move(sourcePath, destination);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
