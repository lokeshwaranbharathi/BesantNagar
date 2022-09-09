package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.Base;
import com.pom.POM;

import io.cucumber.java.en.*;

public class StepDefinition extends Base {
	public static WebDriver driver;
	
	POM p = new POM(driver);

	@Given("user launch the facebook application")
	public void user_launch_the_facebook_application() {
	    setUp("chrome");
	    getUrl("http://www.facebook.com");
	}
	@When("user enter the {string} in email field")
	public void user_enter_the_in_email_field(String username) {
	  sendKey(p.getUsername(), username);
	}
	@When("user enter the {string} in password field")
	public void user_enter_the_in_password_field(String password) {
	  
	}
	@Then("user click the login button")
	public void user_click_the_login_button() {
	   
	}

}
