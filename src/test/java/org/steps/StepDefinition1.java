package org.steps;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition1 extends BaseClass {
	@Given("User is on home page")
	public void user_is_on_home_page() {
		findYourHappyPlaceUrlLaunch();
	}
	@When("User mouseover on shop button")
	public void user_mouseover_on_shop_button() throws InterruptedException {
		//Thread.sleep(3000);
		WebElement target = driver.findElement(By.xpath("(//span[text()='Shop'])[2]"));
		mouseOver(target);
		
	}
	@When("User can able to see the categories")
	public void user_can_able_to_see_the_categories() {
	    driver.findElement(By.xpath(null));
	}
	@Then("Validate the sub categories")
	public void validate_the_sub_categories() {
	
	}
}
