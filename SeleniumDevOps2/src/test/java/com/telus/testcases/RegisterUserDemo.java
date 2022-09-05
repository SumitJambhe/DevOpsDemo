package com.telus.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegisterUserDemo {


	public WebDriver driver;

	//Parameterization of input values
	String url                  = "https://nxtgenaiacademy.com/";
	String expRegTitilValue     = "Register For Demo";
	String firstNameValue       = "Sumit";
	String lastNameValue        = "Jambhe";
	String streetAddressValue   = "At Post Karajgaon";
	String apartmentValue       = "Ward No.4 , Wathacha Pura";
	String cityNameValue        = "Amravati";
	String stateNameValue       = "Maharashtra";
	String postalCodeValue      = "444809";
	String countryDropDownValue = "India";
	String emialIdValue         = "abc@gmail.com";
	String dateOfDemoValue      = "01/08/2022";
	String hourDropDownValue    = "11";
	String minuteDropDownValue  = "30";
	String mobileNumberValue    = "1234567890";
	String enterQueryValue      = "What is the scope of the \"Rest Assured\" ?";
	String expSuccessfulMsgValue= "Registration Form is Successfully Submitted.";


	// Parameterized all The WebElement Path
	By qaAutomationLocator     = By.xpath("//span[normalize-space()='QA Automation']");
	By pracAutomationLocator   = By.xpath("//span[normalize-space()='Practice Automation']");
	By registrationFormLocator = By.xpath(" //span[contains(text(),'Demo Site – Registration Form')]");
	By regTitleTextLacator     = By.xpath("//h3[contains(text(),'Register For Demo')]");
	By firstNameLocator        = By.xpath("//*[@id='vfb-5']");
	By lastNameLocator         = By.xpath("//*[@id='vfb-7']");
	By maleRadioButtonLocator  = By.xpath("//*[@id='vfb-8-1']");
	By streetAddressLocator    = By.xpath("//*[@id='vfb-13-address']");
	By apartmentLocator        = By.xpath("//*[@id='vfb-13-address-2']");
	By cityNameLocator         = By.xpath("//*[@id='vfb-13-city']");
	By stateNameLocator        = By.xpath("//*[@id='vfb-13-state']");
	By postalCodeLocator       = By.xpath("//*[@id='vfb-13-zip']");
	By countryDropDownLocator  = By.xpath("//*[@id='vfb-13-country']");
	By emialIdLocator          = By.xpath("//*[@id='vfb-14']");
	By dateOfDemoLocator       = By.xpath("//*[@id='vfb-18']");
	By hourDropDownLocator     = By.xpath("//*[@id='vfb-16-hour']");
	By minuteDropDownLocator   = By.xpath("//*[@id='vfb-16-min']");
	By mobileNumberLocator     = By.xpath("//*[@id='vfb-19']");
	By testNGChckBoxLocator    = By.xpath("//*[@value='TestNG']");
	By coreJavaChckBoxLocator  = By.xpath("//*[@value='Core Java']");
	By enterQueryLocator       = By.xpath("//*[@id='vfb-23']");
	By verifcationCodeFieldCodeLocator = By.xpath("//*[@id='vfb-3']");
	By getVerificationCodeLocator= By.xpath("//*[text()='Example: 99']");
	By submitButtonLocator     = By.xpath("//*[@id='vfb-4']");
	By sucessfulMsgLocator     = By.xpath("(//*[@class='elementor-shortcode'])[1]");


	@Test (priority = 1)
	public void launchApplication() 
	{
		// Set the system property for the chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Creating instance of Chrome driver
		driver = new ChromeDriver();

		//page load wait-
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		//Implicit wait
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);


		// Maximize the application
		driver.manage().window().maximize();

		// Launch the application
		driver.get(url);
		System.out.println("URl of the Application is: "+ url );
		System.out.println("Welcome To NxtGen A.I Academy");
		System.out.println("Application is Lauched Successfully");
		System.out.println("");
		System.out.println("");

	}

	//============================================================================================

	@Test (priority=2)
	public void navigateToRegisterDemoForm()
	{
		// Create an Instance in Action Class by passing webdriver instance
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the qaAutomation
		WebElement qaAutomation = driver.findElement(qaAutomationLocator);
		action.moveToElement(qaAutomation).perform();
		System.out.println("Mouse hover action performed for QA Automation Link.");

		//Performing the mouse hover action on the practiceAutomation
		WebElement pracAutomation = driver.findElement(pracAutomationLocator);
		action.moveToElement(pracAutomation).perform();
		System.out.println("Mouse hover action performed for Practice Automation Link.");
		System.out.println();

		// Click on Registration Form 
		WebElement registrationForm = driver.findElement(registrationFormLocator);
		registrationForm.click();
		System.out.println("Demo Site – Registration Form option is clicked. ");

		System.out.println("Application is Navigated Successfully");

	}

	//============================================================================================


	@Test (priority=3)
	public void registerDemo() 
	{

		//getTitleMethod
		WebElement regTitleText = driver.findElement(regTitleTextLacator);

		//Verify the Registration Title is displayed		
		if(regTitleText.isDisplayed()) 
		{
			System.out.println("Registration Title is displayed");
		}
		else
		{
			System.out.println("Registration Title is not displayed");
		}
		// Validating the Registration Title 
		String actRegTitle = regTitleText.getText();
		String expRegTitil = expRegTitilValue;

		if(actRegTitle.equals(expRegTitil))
		{
			System.out.println("Registration Title of the page is: " + actRegTitle);
		}
		else
		{
			System.out.println("Actual Registration Title and Expected Registration Title is not same");
			System.out.println("Actual Registration Title is:" + actRegTitle);
			System.out.println("Expected Registration Title is:"+expRegTitil);
		}
		System.out.println("");
		System.out.println("");

		//---------------------------------------------------------------------------------------------------------

		//First Name field
		WebElement firstName = driver.findElement(firstNameLocator);

		// Verify the first name is displayed or not
		if(firstName.isDisplayed()) 
		{
			System.out.println("First Name is displayed");
		}
		else
		{
			System.out.println("First Name is not displayed");	
		}

		// Verify the first name is enabled or not
		if(firstName.isEnabled()) 
		{
			System.out.println("First Name is enabled");

			// Enter the First Name
			firstName.sendKeys(firstNameValue);
			System.out.println("First Name is: " + firstNameValue);
		}
		else
		{
			System.out.println("First Name is not enabled");
		}
		System.out.println("");
		System.out.println("");

		//-----------------------------------------------------------------------------------------
		//Last Name field
		WebElement lastName = driver.findElement(lastNameLocator);

		// Verify the Last name is displayed or not
		if(lastName.isDisplayed()) 
		{
			System.out.println("Last Name is displayed");
		}
		else
		{
			System.out.println("Last Name is not displayed");	
		}

		// Verify the Last name is enabled or not
		if(lastName.isEnabled()) 
		{
			System.out.println("Last Name is enabled");

			// Enter the Last Name
			lastName.sendKeys(lastNameValue);
			System.out.println("Last Name is: " + lastNameValue);
		}
		else
		{
			System.out.println("Last Name is not enabled");
		}
		System.out.println("");
		System.out.println("");


		//-----------------------------------------------------------------------------------------


		//Male Radio Button
		WebElement maleRadioButton = driver.findElement(maleRadioButtonLocator);

		// Verify the Male Radio Button is displayed
		if(maleRadioButton.isDisplayed()) 
		{
			System.out.println("Male Radio Button is displayed");
		}
		else
		{
			System.out.println("Male Radio Button is not displayed");
		}

		// Verify the Male Radio Button is enabled
		if(maleRadioButton.isEnabled()) 
		{
			System.out.println("Male Radio Button is enabled");
		}
		else
		{
			System.out.println("Male Radio Button is not enabled");
		}		

		// Verify the Male Radio Button is selected
		if(maleRadioButton.isSelected()) 
		{
			System.out.println("Male Radio Button is selected");
		}
		else
		{
			System.out.println("Male Radio Button is not selected");
			maleRadioButton.click();
		}


		// Verify the Male Radio Button is selected
		if(maleRadioButton.isSelected()) 
		{
			System.out.println("Male Radio Button is selected");
		}
		else
		{
			System.out.println("Male Radio Button is not selected");
		}
		System.out.println("");
		System.out.println("");

		//-----------------------------------------------------------------------------------------


		//Address 
		//Street Address
		WebElement streetAddress = driver.findElement(streetAddressLocator);

		// Verify the Street Address is displayed or not
		if(streetAddress.isDisplayed()) 
		{
			System.out.println("Street Address is displayed");
		}
		else
		{
			System.out.println("Street Address is not displayed");	
		}

		// Verify the Street Address is enabled or not
		if(streetAddress.isEnabled()) 
		{
			System.out.println("Street Address is enabled");

			// Enter the Street Address
			streetAddress.sendKeys(streetAddressValue);
			System.out.println("Street Address is: " + streetAddressValue);
		}
		else
		{
			System.out.println("Street Address is not enabled");
		}
		System.out.println("");
		System.out.println("");

		//-----------------------------------------------------------------------------------------

		//Apartment Number
		WebElement apartment = driver.findElement(apartmentLocator); 

		// Verify the Apartment Number is displayed or not
		if(apartment.isDisplayed()) 
		{
			System.out.println("Apartment Number is displayed");
		}
		else
		{
			System.out.println("Apartment Number is not displayed");	
		}
		// Verify the Apartment Number is enabled or not
		if(apartment.isEnabled()) 
		{
			System.out.println("Apartment Number is enabled");

			// Enter the Apartment Number
			apartment.sendKeys(apartmentValue);
			System.out.println("Apartment Number is: " + apartmentValue);
		}
		else
		{
			System.out.println("Apartment Number is not enabled");
		}
		System.out.println("");
		System.out.println("");

		//-----------------------------------------------------------------------------------------

		//City Name
		WebElement cityName = driver.findElement(cityNameLocator);

		// Verify the City Name is displayed or not
		if(cityName.isDisplayed()) 
		{
			System.out.println("City Name is displayed");
		}
		else
		{
			System.out.println("City Name is not displayed");	
		}
		// Verify the City Name is enabled or not
		if(cityName.isEnabled()) 
		{
			System.out.println("City Name is enabled");

			// Enter the City Name
			cityName.sendKeys(cityNameValue);
			System.out.println("City Name is: " + cityNameValue);
		}
		else
		{
			System.out.println("City Name is not enabled");
		}
		System.out.println("");
		System.out.println("");

		//-----------------------------------------------------------------------------------------

		//State Name
		WebElement stateName = driver.findElement(stateNameLocator);

		// Verify the State Name is displayed or not
		if(stateName.isDisplayed()) 
		{
			System.out.println("State Name is displayed");
		}
		else
		{
			System.out.println("State Name is not displayed");	
		}

		// Verify the State Name is enabled or not
		if(stateName.isEnabled()) 
		{
			System.out.println("State Name is enabled");

			// Enter the State Name
			stateName.sendKeys(stateNameValue);
			System.out.println("State Name is: " + stateNameValue);
		}
		else
		{
			System.out.println("State Name is not enabled");
		}
		System.out.println("");
		System.out.println("");

		//-----------------------------------------------------------------------------------------

		//Postal Code
		WebElement postalCode = driver.findElement(postalCodeLocator);

		// Verify the Postal Code is displayed or not
		if(postalCode.isDisplayed()) 
		{
			System.out.println("Postal Code is displayed");
		}
		else
		{
			System.out.println("Postal Code is not displayed");	
		}


		// Verify the Postal Code is enabled or not
		if(postalCode.isEnabled()) 
		{
			System.out.println("Postal Code is enabled");

			// Enter the Postal Code
			postalCode.sendKeys(postalCodeValue);
			System.out.println("Postal Code is: " + postalCodeValue);
		}
		else
		{
			System.out.println("Postal Code is not enabled");
		}
		System.out.println("");
		System.out.println("");

		//-----------------------------------------------------------------------------------------

		//countryDropdown
		WebElement countryDropDown = driver.findElement(countryDropDownLocator);

		// Verify the Country DropDown is displayed
		if(countryDropDown.isDisplayed()) 
		{
			System.out.println("Country DropDown is displayed");

			// Verify the Country DropDown is enabled
			if(countryDropDown.isEnabled()) 
			{
				System.out.println("Country DropDown is enabled");

				// Create the select object	to select value from dropdown	
				Select cDropDown = new Select(countryDropDown);

				// Select using value
				cDropDown.selectByValue(countryDropDownValue);
				System.out.println(countryDropDownValue + " is selected");

			}
			else
			{
				System.out.println("Country DropDown is not enabled");
			}
		}
		else
		{
			System.out.println("Country DropDown is not displayed");
		}
		System.out.println("");
		System.out.println("");

		//-----------------------------------------------------------------------------------------

		//Email ID Input
		WebElement emialId = driver.findElement(emialIdLocator);

		// Verify the Email ID is displayed or not
		if(emialId.isDisplayed()) 
		{
			System.out.println("Email ID is displayed");
		}
		else
		{
			System.out.println("Email ID is not displayed");	
		}

		// Verify the Email ID is enabled or not
		if(emialId.isEnabled()) 
		{
			System.out.println("Email ID is enabled");

			// Enter the Email ID
			emialId.sendKeys(emialIdValue);
			System.out.println("Email ID is: " + emialIdValue);
		}
		else
		{
			System.out.println("Email ID is not enabled");
		}
		System.out.println("");
		System.out.println("");

		//-----------------------------------------------------------------------------------------

		//dateOfDemo
		WebElement dateOfDemo = driver.findElement(dateOfDemoLocator);

		// Verify the Mobile Number is Displayed or not
		if (dateOfDemo.isDisplayed()) 
		{
			System.out.println("Date of Demo is Displayed");
		} 
		else 
		{
			System.out.println("Date of Demo is not Displayed");
		}

		// Verify the Date of Demo is enabled or not
		if (dateOfDemo.isEnabled()) 
		{
			System.out.println("Date of Demo is Enabled");
			// Enter Date of Demo Value
			dateOfDemo.sendKeys(dateOfDemoValue);
			System.out.println(" Date of Demo Value is: " + dateOfDemoValue);
		} 
		else 
		{
			System.out.println("Date of Demo is not Enabled");
		}
		System.out.println("");
		System.out.println("");

		//-----------------------------------------------------------------------------------------

		//Hour DropDown 
		WebElement hourDropDown = driver.findElement(hourDropDownLocator);

		// Verify the Hour DropDown  is displayed
		if(hourDropDown.isDisplayed()) 
		{
			System.out.println("Hour DropDown is displayed");

			// Verify the Hour DropDown is enabled
			if(hourDropDown.isEnabled()) 
			{
				System.out.println("Hour DropDown is enabled");

				// Create the select object	to select value from dropdown	
				Select hDropDown= new Select(hourDropDown);	

				// Select using value
				hDropDown.selectByValue(hourDropDownValue);
				System.out.println(hourDropDownValue + " is selected");

			}
			else
			{
				System.out.println("Hour DropDown is not enabled");
			}
		}
		else
		{
			System.out.println("Hour DropDown is not displayed");
		}
		System.out.println("");
		System.out.println("");

		//-----------------------------------------------------------------------------------------

		//Minute Dopdown
		WebElement minuteDropDown = driver.findElement(minuteDropDownLocator);

		// Verify the Minute DropDown  is displayed
		if(minuteDropDown.isDisplayed()) 
		{
			System.out.println("Minute DropDown is displayed");


			// Verify the Minute DropDown is enabled
			if(minuteDropDown.isEnabled()) 
			{
				System.out.println("Minute DropDown is enabled");


				// Create the select object	to select value from dropdown	
				Select mDropDown= new Select(minuteDropDown);

				// Select using value
				mDropDown.selectByValue(minuteDropDownValue);
				System.out.println(minuteDropDownValue + " is selected");


			}
			else
			{
				System.out.println("Minute DropDown is not enabled");
			}
		}
		else
		{
			System.out.println("Minute DropDown is not displayed");
		}
		System.out.println("");
		System.out.println("");

		//-----------------------------------------------------------------------------------------
		//Mobile Number 
		WebElement mobileNumber = driver.findElement(mobileNumberLocator);

		// Verify the Mobile Number  is displayed or not
		if(mobileNumber.isDisplayed()) 
		{
			System.out.println("Mobile Number  is displayed");
		}
		else
		{
			System.out.println("Mobile Number  is not displayed");	
		}

		// Verify the Mobile Number  is enabled or not
		if(mobileNumber.isEnabled()) 
		{
			System.out.println("Mobile Number  is enabled");

			// Enter the Mobile Number 
			mobileNumber.sendKeys(mobileNumberValue);
			System.out.println("Mobile Number  is: " + mobileNumberValue);
		}
		else
		{
			System.out.println("Mobile Number  is not enabled");
		}
		System.out.println("");
		System.out.println("");

		//-----------------------------------------------------------------------------------------
		//Course Interested
		//TestNG
		WebElement testNGChckBox = driver.findElement(testNGChckBoxLocator);

		// Verify the TestNG Checkbox is displayed
		if(testNGChckBox.isDisplayed()) 
		{
			System.out.println("TestNG Checkbox is displayed");
		}
		else
		{
			System.out.println("TestNG Checkbox is not displayed");
		}

		// Verify the TestNG Checkbox is enabled
		if(testNGChckBox.isEnabled()) 
		{
			System.out.println("TestNG Checkbox is enabled");
		}
		else
		{
			System.out.println("TestNG Checkbox is not enabled");
		}

		// Verify the TestNG Checkbox is selected or not. 
		if(testNGChckBox.isSelected()) 
		{
			System.out.println("TestNG Checkbox is selected");
		}
		else
		{
			System.out.println("TestNG Checkbox is not selected");
			// Checking(Selecting) the TestNG Checkbox
			testNGChckBox.click();			
		}
		if(testNGChckBox.isSelected()) 
		{
			System.out.println("TestNG Checkbox is selected");
		}
		else
		{
			System.out.println("TestNG Checkbox is not selected");
		}
		System.out.println("");
		System.out.println("");


		//-----------------------------------------------------------------------------------------

		//Core Java		
		WebElement coreJavaChckBox = driver.findElement(coreJavaChckBoxLocator);

		// Verify the Core Java Checkbox is displayed
		if(coreJavaChckBox.isDisplayed()) 
		{
			System.out.println("Core Java Checkbox is displayed");
		}
		else
		{
			System.out.println("Core Java Checkbox is not displayed");
		}

		// Verify the Core Java Checkbox is enabled
		if(coreJavaChckBox.isEnabled()) 
		{
			System.out.println("Core Java Checkbox is enabled");
		}
		else
		{
			System.out.println("Core Java Checkbox is not enabled");
		}

		// Verify the Core Java Checkbox is selected or not. 
		if(coreJavaChckBox.isSelected()) 
		{
			System.out.println("Core Java Checkbox is selected");
		}
		else
		{
			System.out.println("Core Java Checkbox is not selected");
			// Checking(Selecting) the Core Java Checkbox
			coreJavaChckBox.click();			
		}
		if(coreJavaChckBox.isSelected()) 
		{
			System.out.println("Core Java Checkbox is selected");
		}
		else
		{
			System.out.println("Core Java Checkbox is not selected");
		}
		System.out.println("");
		System.out.println("");

		//-----------------------------------------------------------------------------------------

		//Enter your query
		WebElement enterQuery = driver.findElement(enterQueryLocator);

		// Verify the Enter your query  is displayed or not
		if(enterQuery.isDisplayed()) 
		{
			System.out.println("Enter your query  is displayed");
		}
		else
		{
			System.out.println("Enter your query  is not displayed");	
		}

		// Verify the Enter your query  is enabled or not
		if(enterQuery.isEnabled()) 
		{
			System.out.println("Enter your query  is enabled");

			// Enter the Enter your query 
			enterQuery.sendKeys(enterQueryValue);
			System.out.println("Enter your query  is: " + enterQueryValue);
		}
		else
		{
			System.out.println("Enter your query  is not enabled");
		}
		System.out.println("");
		System.out.println("");

		//-----------------------------------------------------------------------------------------

		//Verification Field 
		WebElement verifcationCodeFieldCode = driver.findElement(verifcationCodeFieldCodeLocator);

		// Verify the Verification Field is displayed or not
		if(verifcationCodeFieldCode.isDisplayed()) 
		{
			System.out.println("Verification Field is displayed");
		}
		else
		{
			System.out.println("Verification Field is not displayed");	
		}

		// Verify the Verification Field is enabled or not
		if(verifcationCodeFieldCode.isEnabled()) 
		{
			System.out.println("Verification Field is enabled");

			//Getting Verification Code 
			String getVerificationCode = driver.findElement(getVerificationCodeLocator).getText();

			//Retrive the Verification number from text shows in the filed
			String[] arrCodeMsg = getVerificationCode.split(":");
			String vCodeNumber = arrCodeMsg[1].trim();
			System.out.println("Verification Number is Retrived");	

			// Enter the Verification Field 
			verifcationCodeFieldCode.sendKeys(vCodeNumber);
			System.out.println("Verification Field Number Entered is: " + vCodeNumber);
		}
		else
		{
			System.out.println("Verification Field is not enabled");
		}
		System.out.println("");
		System.out.println("");

		//-----------------------------------------------------------------------------------------

		//Click on the submit button
		WebElement submitButton = driver.findElement(submitButtonLocator);

		// Verify the Submit Button is displayed
		if(submitButton.isDisplayed()) 
		{
			System.out.println("Submit Button is displayed");
		}
		else
		{
			System.out.println("Submit Button is not displayed");
		}

		// Verify the Submit Button is enabled
		if(submitButton.isEnabled()) 
		{
			System.out.println("Submit Button is enabled");
			//Click on Submit Button 
			submitButton.click();
			System.out.println("Submit Button is clicked");

			System.out.println("User is registerd Successfully.");
		}
		else
		{
			System.out.println("Submit Button is not enabled");
		}
		System.out.println("");
		System.out.println("");


	}

	//============================================================================================

	@Test (priority=4)
	public void validateSuccessfulMsg() 
	{

		//Successful message Text
		WebElement sucessfulMsg = driver.findElement(sucessfulMsgLocator);

		//Verify the Registration Title is displayed		
		if(sucessfulMsg.isDisplayed()) 
		{
			System.out.println("Successful  Message is displayed");
		}
		else
		{
			System.out.println("Successful  Message is not displayed");
		}

		// Validating the Successful Message
		String actSuccessfulMsg = sucessfulMsg.getText();
		String expSuccessfulMsg = expSuccessfulMsgValue;

		if(actSuccessfulMsg.contains(expSuccessfulMsg))
		{
			System.out.println("Actual and Expected Successful Message are same.");
			System.out.println("The Successful Message is: " + actSuccessfulMsg);

			//Retrive the tranaction number from the output message
			String[] arrSuccessfulMsg = actSuccessfulMsg.split(" : ");
			String transId = arrSuccessfulMsg[1].trim();
			System.out.println("The transaction ID is: " + transId);

			System.out.println("Successfully Validate the Messege.");
		}
		else
		{
			System.out.println("Actual and Expected Successful Message is NOT same.");
			System.out.println("Actual Successful Message is: " + actSuccessfulMsg);
			System.out.println("Expected Successful Messge is: "+ expSuccessfulMsg);
		}
		System.out.println("");
		System.out.println("");

	}

	//============================================================================================



	@Test (priority=5)
	public void closeApplication()
	{
		//close the Browser
		driver.close();
		System.out.println("Application is closed Successfully.");

	}
}
