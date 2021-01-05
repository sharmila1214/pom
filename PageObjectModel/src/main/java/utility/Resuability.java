package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pages.HomePage;
import salesforce.BaseClass;
import salesforce.ExtentReport;




public class Resuability extends ExtentReport {

public static void click1(WebElement obj,String ObjName) {
	if(obj.isEnabled()) {
		obj.click();
		System.out.println("clicked on :"+ObjName);
	}
}
public void sendkeys(WebElement obj,String ObjName,String input) {
	if(obj.isDisplayed()) {
		obj.sendKeys(input);
		System.out.println("enetered keys :"+ObjName);
	}
}
public void validateTitle(String input,String ObjName) {
	
String title =driver.getTitle();

Assert.assertEquals(title, input);
}
public void validateData(WebElement obj, String objName, String input) {
	System.out.println("reuse"+input);
	String textboxValue=obj.getAttribute("value");
	Assert.assertEquals(textboxValue, input);
	
}
public void ValidateErrorMsg(WebElement errorMsg, String msg) {
	String EMsg = errorMsg.getText();
	Assert.assertEquals(EMsg, msg);
	
}
public void validatecheckbox(WebElement obj) {
	//obj.isSelected();
	Assert.assertTrue(obj.isSelected());
}
}
