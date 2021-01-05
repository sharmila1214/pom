package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import salesforce.BaseClass;
import utility.Resuability;

public class HomePage extends BaseClass{
	Resuability reuse = new Resuability();
	@FindBy(id="username")
	WebElement username1;
	@FindBy(id="password")
	WebElement password;
	@FindBy(xpath="//input[@id='Login']")
	WebElement login;
	@FindBy(xpath="//div[@id='error']")
	WebElement errorMsg;
	@FindBy(name="rememberUn")
	WebElement rememberMe;
	@FindBy(xpath="//a[@id='forgot_password_link']")
	WebElement forgot;
	@FindBy(xpath="//div[@id='error']")
	WebElement cerdentialError;
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	public ForgotPassword forgotPassword() {
		reuse.click1(forgot, "forgotPassword");
		return new ForgotPassword();
	}
public void verifytitle(String hometitle) {

reuse.validateTitle(hometitle, "HomePage");
}

public void enteringData(String usernameID) {

reuse.sendkeys(username1, "username", usernameID);
}
public void enteringPassword(String password1) {

reuse.sendkeys(password, "password", password1);
}

public void validateDataEnetered(String usernameID) {

reuse.validateData(username1, "validatedusername", usernameID);
}
public void clearpassword() {
	password.clear();
	
}
public MainPage login() {

reuse.click1(login, "Login");
return new MainPage();

}
public void validateErrorMsd(String msg) {
	reuse.ValidateErrorMsg(errorMsg,msg);
}
public void validateDataEnteredPassword(String arg1) {
	System.out.println(arg1);
	reuse.validateData(password, "validatedpassword", arg1);
	}
public void rememberMe() {
	reuse.click1(rememberMe, "rememberMeCheckBox");
}
public void ValidateRememberMe() {
	reuse.validatecheckbox(rememberMe);
}
public void cerdentialError(String msg) {
	reuse.ValidateErrorMsg(cerdentialError, msg);
}
}

