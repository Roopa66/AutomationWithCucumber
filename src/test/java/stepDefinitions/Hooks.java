package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import PageObject.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utils.TestBase;
import utils.TestContextSetup;

public class Hooks {
	// TestContextSetup testContextSetup;
	public WebDriver driver;



	@After
	public void AfterScenario() {

		driver.close();
	}

	

	@Before("@ValidScenario")
	public void setUpLogin() {
		System.out.println("setup the input details");
	}

	@After
	public void tearDown() throws IOException {
		
		System.out.println("clear all details ");
	}

}
