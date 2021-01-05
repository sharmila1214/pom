package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import salesforce.BaseClass;
import utility.Resuability;

public class MainPage extends BaseClass{
	@FindBy(xpath ="//div[@id='userNav-arrow']")
	WebElement loginName;
	@FindBy(xpath ="//a[contains(text(),'Logout')]")
	WebElement logout;
	@FindBy(xpath ="//div[@id='userNav-menuItems']//a")
	List<WebElement> dropdown;
	public MainPage(){
		PageFactory.initElements(driver, this);
	}
	Resuability reuse = new Resuability();
	public void verifytitleMain(String mainpage) {

		reuse.validateTitle(mainpage, "Mainpage");
		}
	public void loginNameClick() throws InterruptedException {
		Thread.sleep(7000);
		//loginName.click();
		reuse.click1(loginName, "username Clicked");
	}
	public void logout() throws InterruptedException {
		reuse.click1(logout, "logout Clicked");
		Thread.sleep(5000);
	}
	public void validate(List<String> lm) {
		List<String> mp = new ArrayList<String>();
		 for(WebElement ab: dropdown) {
			 mp.add(ab.getText());
			 }
			  for(int i=0;i<lm.size();i++) {
System.out.println(lm.get(i));
			 	   lm.get(i).equals(mp.get(i));

			     }
	}
}
