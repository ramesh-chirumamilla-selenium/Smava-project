package com.kiran.smava.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserLoginPopUp {
	WebDriver driver;
	
	By userEmailTextBox = By.id("signonForm.email");
	By passwordTextBox = By.id("signonForm.password");
	By signInButton = By.xpath(".//*[@id='signonForm']/button");
	By ErrorOnInvaliedCredentials = By.xpath(".//*[@id='layout-wrapper']/div[3]/div[1]/div/div/div[1]/div/ul/li");
	By ErrorMessage = By.xpath(".//*[@id='layout-wrapper']/div[3]/div[1]/div/div/div[1]/div/ul/li");
	
	
	/**
	 * This method will creates WebDriver for this method
	 * @param driver
	 */
	public UserLoginPopUp(WebDriver driver)
	{
		this.driver = driver;
	}
	
	/**
	 * This method will enter user name in login popup.
	 * @param userName
	 */
	public void enterUserEmailInLoginPage(String userName)
	{
		driver.findElement(userEmailTextBox).sendKeys(userName);
	}
	
	/**
	 * This method will enter password in login popup.
	 * @param password
	 */
	public void enterPasswordInLoginPage(String password)
	{
		driver.findElement(passwordTextBox).sendKeys(password);
	}
	
	/**
	 * This method will click on Login button
	 */
	public void signInButton()
	{
		driver.findElement(signInButton).click();
	}
	
	public void LoginVerify(){
		if(driver.getPageSource().contains("Fehler")){
			System.out.println(driver.findElement(ErrorMessage).getText());
		}
		else{
			System.out.println("Login successfull");
		}
	}
}
