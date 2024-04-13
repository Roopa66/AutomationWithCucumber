package PageObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By id = By.id("inputUsername");
	By inputPassword = By.name("inputPassword");
	By submit = By.className("submit");
	By txt = By.tagName("h2");
	By txt1 = By.tagName("h1");
	By txt2 = By.tagName("p");
	By incrtpwd = By.cssSelector("p.error");
	By logout = By.className("logout-btn");
	By forgotpswlink = By.linkText("Forgot your password?");
	By name = By.xpath("//input[@placeholder='Name']");
	By email = By.cssSelector("input[placeholder='Email']");
	By email1 = By.xpath("//input[@type='text'][2]");
	By phonenumber = By.xpath("//form/input[3]");
	By resetbtn = By.cssSelector(".reset-pwd-btn");
	By message = By.cssSelector("form p");
	By backtologin=By.className("go-to-login-btn");

	public void userDetails(String username, String password) {

		driver.findElement(id).sendKeys(username);
		driver.findElement(inputPassword).sendKeys(password);
		driver.findElement(submit).click();
	}

	public void getHomePageSuccefullyLogin() {

		System.out.println(driver.findElement(txt).getText());
		System.out.println(driver.findElement(txt1).getText());
		System.out.println(driver.findElement(txt2).getText());
	}

	public void getHomePageNotSuccefullyLogin() {

		String s = driver.findElement(incrtpwd).getText();
		System.out.println(s);
		assertEquals(s, "* Incorrect username or password");
	}

	public void getForgotPasswordLink() {
		driver.findElement(forgotpswlink).click();

	}

	public void getPasswordReset() throws InterruptedException {
		driver.findElement(name).sendKeys("roopa");

		driver.findElement(email).sendKeys("yrupa1839@gmail.com");
		Thread.sleep(2000);
		driver.findElement(email).clear();

		Thread.sleep(2000);
		driver.findElement(email1).sendKeys("abc@gmail.com");

		driver.findElement(phonenumber).sendKeys("67889786364");

		driver.findElement(resetbtn).click();
		Thread.sleep(2000);

		String password = driver.findElement(message).getText();
		String[] password1 = password.split("'");

		String[] pw = password1[1].split("'");
		String passwordactual = pw[0]; // -- actual password
		System.out.println(passwordactual);
		Thread.sleep(2000);
		driver.findElement(backtologin).click();

		driver.findElement(id).sendKeys("yrupa1839@gmail.com");
		
		driver.findElement(inputPassword).sendKeys(passwordactual);
		Thread.sleep(2000);
		driver.findElement(submit).click();

	}

	public void logOut() {
		driver.findElement(logout).click();

	}
}
