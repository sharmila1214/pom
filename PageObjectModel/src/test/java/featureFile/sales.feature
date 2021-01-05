Feature: Automate testCase in xero

Scenario Outline: Navigate to SFDC
Given : Opened the sales force application
When : click on the login in sales force
Then : Valiadte the title of page "<title>"
When : entered the "<username>"
Then : validate "<username>" entered
When : clear the passsword field
When : When clicking on login
Then : validate the "<error msg>" 
Examples:
|title|username|error msg|
|Login \| Salesforce|sweety.1428@gmail.com|Please enter your password.|
	
Scenario Outline: Login to SFDC
Given : Opened the sales force application
When : click on the login in sales force
Then : Valiadte the title of page "<title>"
When : entered the "<username>"
Then : validate "<username>" entered
When : entered the password "<password>"
Then : validate the password "<password>" entered
When : When clicking on login
Then : Validate the title of mainpage "<maintitle>"
Examples:
|title|username|password|maintitle|
|Login \| Salesforce|sweety.1428@gmail.com|Sharmi1214|Home Page ~ Salesforce - Developer Edition|

Scenario Outline: Check RemeberMe - 3
Given : Opened the sales force application
When : click on the login in sales force
Then : Valiadte the title of page "<title>"
When : entered the "<username>"
Then : validate "<username>" entered
When : entered the password "<password>"
Then : validate the password "<password>" entered
When : clicked on rememberMeCheckBox
Then : Validate the rememberMecheckbox clicked 
When : When clicking on login
Then : Validate the title of mainpage "<maintitle>"
When : When clicking on userName
When : When clicking on logOut
Then : Valiadte the title of page "<title>"
Then : validate "<username>" entered
Examples:
|title|username|password|maintitle|
|Login \| Salesforce|sweety.1428@gmail.com|Sharmi1214|Home Page ~ Salesforce - Developer Edition|

Scenario Outline: Forgot Password- 4 A
Given : Opened the sales force application
When : click on the login in sales force
Then : Valiadte the title of page "<title>"
When : clicked on forgotYourPasswword
Then : Validate the tittle of forgotPassword Page "<title1>"
When : Enter the username "<username>" in forgotPassword page
Then : validate "<username>" entered in forgotPassword Page
When : clicked on continue 
Then : validate the title of emailPage "<title2>"
Then : validate the msg "<message>"
Examples:
|title|title1|username|title2|message|
|Login \| Salesforce|Forgot Your Password \| Salesforce|sweety.1428@gmail.com|Check Your Email \| Salesforce|We’ve sent you an email with a link to finish resetting your password.|

Scenario Outline:Forgot Password- 4 B
Given : Opened the sales force application
When : click on the login in sales force
Then : Valiadte the title of page "<title>"
When : entered the "<username>"
Then : validate "<username>" entered
When : entered the password "<password>"
Then : validate the password "<password>" entered
When : When clicking on login
Then : Validate the errorMsg in homePage "<errorMsg>"
Examples:
|title|username|password|errorMsg|
|Login \| Salesforce|123|22131|Please check your username and password. If you still can't log in, contact your Salesforce administrator.|
@Smoke
Scenario Outline: Select user menu for <username> drop down
Given : Opened the sales force application
When : click on the login in sales force
Then : Valiadte the title of page "<title>"
When : entered the "<username1>"
Then : validate "<username1>" entered
When : entered the password "<password>"
Then : validate the password "<password>" entered
When : When clicking on login
Then : Validate the title of mainpage "<maintitle>"
When : When clicking on userName
Then : Validate the dropDown

Examples:
|title|username1|password|maintitle|
|Login \| Salesforce|sweety.1428@gmail.com|Sharmi1214|