package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import salesforce.BaseClass;
import utility.Resuability;

public class ForgotPassword extends BaseClass {
	Resuability reuse = new Resuability();
	@FindBy(id="un")
	WebElement UserNameForgot;
	@FindBy(id="continue")
	WebElement clickContinue;
	ForgotPassword(){
		PageFactory.initElements(driver, this);
	}
	public EmailPage clickContinue() {
		reuse.click1(clickContinue, "continue");
		return new EmailPage();
	}
	public void userForgot(String input) {
		reuse.sendkeys(UserNameForgot, "UserName", input);
	}
	public void userIDValidate(String input) {
		reuse.validateData(UserNameForgot, "emailId", input);
	}
	public void validatePage(String arg1)
	{

reuse.validateTitle(arg1, "Page");
	}
}
