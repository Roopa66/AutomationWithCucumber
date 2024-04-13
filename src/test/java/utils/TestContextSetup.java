package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObject.LoginPage;
import PageObject.PageObjectManager;

public class TestContextSetup {
	public WebDriver driver;
	public LoginPage loginPage;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;

	public TestContextSetup() throws InterruptedException, IOException {
		TestBase testBase= new TestBase();
		PageObjectManager pageObjectManager = new PageObjectManager(testBase.webDriverManager());
		
	}
}
