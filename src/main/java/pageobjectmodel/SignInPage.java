package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.BaseClass;

public class SignInPage {

	public SignInPage() {

		PageFactory.initElements(BaseClass.driver, this);
	}

	@FindBy(xpath = "//a[@data-csa-c-slot-id='nav-link-accountList']")
	public static WebElement homeInPage;

	@FindBy(xpath = "//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][normalize-space()='Sign in']")
	public static WebElement signInPage;
	
	@FindBy(xpath = "//*[@id='ap_email']")
	public static WebElement mobileNumber;

	@FindBy(xpath = "//input[@id='continue']")
	public static WebElement continueButton;

}
