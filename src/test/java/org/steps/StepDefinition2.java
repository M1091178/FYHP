package org.steps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition2 extends BaseClass {

	@Given("To verify user need to be in home page")
	public void to_verify_user_need_to_be_in_home_page() {
		findYourHappyPlaceUrlLaunch();
	}

	@When("To verify user will click the bestsellers button")
	public void to_verify_user_will_click_the_bestsellers_button() {
		driver.findElement(By.xpath("(//div[@class='collection_scheama card-wrapper'])[1]")).click();
	}

	@When("User will click the product")
	public void user_will_click_the_product() {
		driver.findElement(By.xpath("(//*[@id='card_wrapper_list'])[1]")).click();
	}

	@Then("User will click add to cart button")
	public void user_will_click_add_to_cart_button() throws IOException {
		driver.findElement(By.xpath("//button[@name='plus']")).click();
	}

	@When("User will increase the quantity of the product")
	public void user_will_increase_the_quantity_of_the_product() {
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();

	}

	@When("User click on checkout button")
	public void user_click_on_checkout_button() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='button']")).click();
		// handlingContinue();
	}

	@When("User enter the Mandatory details")
	public void user_enter_the_mandatory_details() throws IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String mail = getExcelDataText("C:\\Project\\excel\\TestData.xlsx", "Keywords");
		String mobile = getExcelDataNum("C:\\Project\\excel\\TestData.xlsx", "Keywords");

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(mail);
		driver.findElement(By.xpath("(//input[@placeholder='PIN code'])[1]")).sendKeys("600093");
		driver.findElement(By.xpath("//input[@placeholder='Last name']")).sendKeys("Ayeesha");
		driver.findElement(By.xpath("//input[@placeholder='Address']")).sendKeys("2 venkatesapuram, Vandalur,Chennai");
		driver.findElement(By.xpath("//input[@placeholder='City']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys(mobile);

	}

	@When("Click on proceed")
	public void click_on_proceed() {
		driver.findElement(By.xpath("//button[@name='button']")).click();
		handlingContinue();
	}

}
