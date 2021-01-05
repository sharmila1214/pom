package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import salesforce.BaseClass;
import utility.Resuability;

public class LoginPage extends BaseClass{
	Resuability reuse = new Resuability();
public LoginPage(){
		PageFactory.initElements(driver, this);
	}
By login = By.xpath("//a[contains(text(),'Login')]");
WebElement r = driver.findElement(login);
@FindBy(xpath="//a[contains(text(),'Login')]")
WebElement login1;
public HomePage loginsales() {
	reuse.click1(login1,"login");
	return new HomePage();
}
}
