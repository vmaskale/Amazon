package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.BaseClass;

public class PasswordPage {
	
	PasswordPage() {

		PageFactory.initElements(BaseClass.driver, this);
	}

	@FindBy(xpath = "//*[@id='ap_password']")
	public static WebElement passwordField;
	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	public static WebElement signinButton;
	
}
