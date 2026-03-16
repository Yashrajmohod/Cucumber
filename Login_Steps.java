package com.Step_Defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Steps {

	WebDriver driver;
	@Given("user should open chrome broswer")
	public void user_should_open_chrome_broswer() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("user enter valid username")
	public void user_enter_valid_username() {
		driver.findElement(By.name("username")).sendKeys("student");
	}

	@And("user enter valid password")
	public void user_enter_valid_password() {
		driver.findElement(By.name("password")).sendKeys("Password123");

	}

	@And("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("submit")).click();

	}

	@Then("page should br nagetive into dashboard page")
	public void page_should_br_nagetive_into_dashboard_page() {
	Assert.assertEquals(driver.getTitle(), "Logged In Successfully | Practice Test Automation" );
	}

	@And("close the broswer")
	public void close_the_broswer() {
		driver.close();
	}

}
