package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import salesforce.BaseClass;
import utility.Resuability;

public class EmailPage extends BaseClass {
Resuability reuse = new Resuability();
@FindBy(xpath="//p[contains(text(),'We’ve sent you an email with a link to finish resetting your password.')]")
WebElement msg;	
public EmailPage() {
	PageFactory.initElements(driver, this);
}
	public void Emailtitle(String input) {
		reuse.validateTitle(input, "emailtitle");
	}
	public void textGiven(String input) {
		reuse.ValidateErrorMsg(msg, input);
	}
}
