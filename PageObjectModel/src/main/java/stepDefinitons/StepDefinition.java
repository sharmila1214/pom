 package stepDefinitons;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;




//
//import org.junit.After;
//import org.junit.Before;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EmailPage;
import pages.ForgotPassword;
import pages.HomePage;
import pages.LoginPage;
import pages.MainPage;
import salesforce.BaseClass;
import salesforce.ExtentReport;

public class StepDefinition extends BaseClass {
LoginPage  lm;
HomePage hm;
MainPage mp;
ForgotPassword fp;
EmailPage ep;
//ExtentReport em = new ExtentReport();
@Before
public void setup() throws IOException {
	System.out.println("inside setup");
	driver=initialisation();
	ExtentReport.extentRep();
	
}
@Given("^: Opened the sales force application$")
public void opened_the_sales_force_application() throws Throwable {
		
	   driver.get("https://www.salesforce.com/");
	   driver.manage().window().maximize();
	   ExtentReport.logger.log(LogStatus.INFO, "opened sales force ");
		
}

@When("^: click on the login in sales force$")
public void click_on_the_login_in_sales_force() throws Throwable {
	   lm = new LoginPage();
	   hm = lm.loginsales();
	   ExtentReport.logger.log(LogStatus.INFO, "clicked on the login");
	   
}

@Then("^: Valiadte the title of page \"([^\"]*)\"$")
public void valiadte_the_title_of_homepage(String arg1) throws Throwable {
	Thread.sleep(7000);
	hm.verifytitle(arg1);
	ExtentReport.logger.log(LogStatus.PASS, "homepage title verified");
}

@Then("^: Validate the dropDown$")
public void validate_the_dropDown() throws Throwable {
	
	    List<String> lm = new ArrayList<String>();
    lm.add("My Profile");
    lm.add("My Settings");
    lm.add("Developer Console");
    lm.add("Switch to Lightning Experience");
    lm.add("Logout");
    mp.validate(lm);
//    List<String> mp = new ArrayList<String>();
//    List<WebElement> e= driver.findElements(By.xpath("//div[@id='userNav-menuItems']//a"));
//   for(WebElement ab: e) {
//mp.add(ab.getText());
//}
// for(int i=0;i<lm.size();i++) {
//
//	   lm.get(i).equals(mp.get(i));
//
//    }
 
}

@When("^: clicked on rememberMeCheckBox$")
public void clicked_on_rememberMeCheckBox() throws Throwable {
   hm.rememberMe();
   ExtentReport.logger.log(LogStatus.INFO, "remember me clickedS");
   
}

@Then("^: Validate the rememberMecheckbox clicked$")
public void validate_the_rememberMecheckbox_clicked() throws Throwable {
	hm.ValidateRememberMe();
	ExtentReport.logger.log(LogStatus.INFO, "remember me clickedS"); 
}

@When("^: When clicking on userName$")
public void when_clicking_on_userName() throws Throwable {
	mp.loginNameClick();
	ExtentReport.logger.log(LogStatus.INFO, "loginName Clicked"); 
}

@When("^: When clicking on logOut$")
public void when_clicking_on_logOut() throws Throwable {
    mp.logout();
    ExtentReport.logger.log(LogStatus.INFO, "logout Clicked"); 
}



@When("^: entered the \"([^\"]*)\"$")
public void entered_the_username(String arg1) throws Throwable {
  hm.enteringData(arg1);
 ExtentReport.logger.log(LogStatus.INFO, "data enetered");
}


@When("^: entered the password \"([^\"]*)\"$")
public void entered_the_password(String arg1) throws Throwable {
   hm.enteringPassword(arg1);
   ExtentReport.logger.log(LogStatus.INFO, "password enetered");
}

@Then("^: validate the password \"([^\"]*)\" entered$")
public void validate_the_password_entered(String arg1) throws Throwable {
	Thread.sleep(7000); 
	hm.validateDataEnteredPassword(arg1);
	 
	  ExtentReport.logger.log(LogStatus.PASS, "data entered is validated");   
}



@Then("^: Validate the title of mainpage \"([^\"]*)\"$")
public void validate_the_title_of_mainpage(String arg1) throws Throwable {
    mp.verifytitleMain(arg1);
    ExtentReport.logger.log(LogStatus.PASS, "mainPage title verified");
}




@Then("^: validate \"([^\"]*)\" entered$")
public void validate_entered(String arg1) throws Throwable {
  hm.validateDataEnetered(arg1);
  ExtentReport.logger.log(LogStatus.PASS, "data is validated");
}

@When("^: clear the passsword field$")
public void clear_the_passsword_field() throws Throwable {
   hm.clearpassword();
   ExtentReport.logger.log(LogStatus.INFO, "password cleared");
}

@When("^: When clicking on login$")
public void when_clicking_on_login() throws Throwable {
   mp=hm.login();
   ExtentReport.logger.log(LogStatus.INFO, "login clicked");
}

@Then("^: validate the \"([^\"]*)\"$")
public void validate_the(String arg1) throws Throwable {
    hm.validateErrorMsd(arg1);
    ExtentReport.logger.log(LogStatus.PASS, "validated the error msg");
}

@When("^: clicked on forgotYourPasswword$")
public void clicked_on_forgotYourPasswword() throws Throwable {
   fp= hm.forgotPassword();
    ExtentReport.logger.log(LogStatus.INFO, "clicked on forgot password");
}

@Then("^: Validate the tittle of forgotPassword Page \"([^\"]*)\"$")
public void validate_the_tittle_of_forgotPassword_Page(String arg1) throws Throwable {


	fp.validatePage(arg1);

   ExtentReport.logger.log(LogStatus.PASS, "validated the title");
}

@When("^: Enter the username \"([^\"]*)\" in forgotPassword page$")
public void enter_the_username_in_forgotPassword_page(String arg1) throws Throwable {
   fp.userForgot(arg1);
   ExtentReport.logger.log(LogStatus.INFO, "entered the mailid");
}

@Then("^: validate \"([^\"]*)\" entered in forgotPassword Page$")
public void validate_entered_in_forgotPassword_Page(String arg1) throws Throwable {
  fp.userIDValidate(arg1);
  ExtentReport.logger.log(LogStatus.PASS, "validated the emaiID");
}

@When("^: clicked on continue$")
public void clicked_on_continue() throws Throwable {
	ep=fp.clickContinue();
 ExtentReport.logger.log(LogStatus.INFO, "clicked on continue");
}

@Then("^: validate the title of emailPage \"([^\"]*)\"$")
public void validate_the_title_of_emailPage(String arg1) throws Throwable {
  ep.Emailtitle(arg1);
  ExtentReport.logger.log(LogStatus.PASS, "validated the title");
}

@Then("^: validate the msg \"([^\"]*)\"$")
public void validate_the_msg(String arg1) throws Throwable {
   ep.textGiven(arg1);
   ExtentReport.logger.log(LogStatus.PASS, "validated the text");
}

@Then("^: Validate the errorMsg in homePage \"([^\"]*)\"$")
public void validate_the_errorMsg_in_homePage(String arg1) throws Throwable {
 hm.cerdentialError(arg1);
}



@After
public void tearDown() {
	ExtentReport.reports.endTest(ExtentReport.logger);
	ExtentReport.reports.flush();
	driver.quit();
}



}
