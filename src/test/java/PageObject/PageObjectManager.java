package PageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public WebDriver driver;
	public LoginPage loginPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPage getLoginPage() {
		LoginPage loginPage = new LoginPage(driver);
		return loginPage;
	}

}
