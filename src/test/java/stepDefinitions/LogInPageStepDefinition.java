package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.awt.Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonUtils;

public class LogInPageStepDefinition {
	public WebDriver driver;
	

	@Given("User is an landing page")
	public void user_is_an_landing_page() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}

	@When("User login into application with {string} and Passord {string}")
	public void user_login_into_application_with_and_passord(String username, String password)
			throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.userDetails(username, password);
		Thread.sleep(2000);
		CommonUtils.takeScreenshot(driver, "LoginPage");
	}

	@Then("HomePage is Successfully login")
	public void home_page_is_successfully_login() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.getHomePageSuccefullyLogin();
		Thread.sleep(2000);
		CommonUtils.takeScreenshot(driver, "LoginPage succefully landed");

	}

	@Then("HomePage is not Successfully login")
	public void home_page_is_not_successfully_login() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.getHomePageNotSuccefullyLogin();
		Thread.sleep(2000);
		CommonUtils.takeScreenshot(driver, "LoginPage not succefully landed");
	}

	
	@When("user clicks on the {string} link")
	public void user_clicks_on_the_link(String string) throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.getForgotPasswordLink();
		Thread.sleep(2000);
		CommonUtils.takeScreenshot(driver, "forgot password");
	}



@Then("reset the password")
public void reset_the_password() throws InterruptedException {
	LoginPage loginPage = new LoginPage(driver);
	loginPage.getPasswordReset();
	CommonUtils.takeScreenshot(driver, "reset password");
}
	

	@Then("logout the page")
	public void logout_the_page() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.logOut();
		CommonUtils.takeScreenshot(driver, "logout the page");
		;
	}

}
