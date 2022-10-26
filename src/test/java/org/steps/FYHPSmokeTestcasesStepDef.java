package org.steps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.pageclass.FyhpPC;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FYHPSmokeTestcasesStepDef extends BaseClass {

	public static FyhpPC fyhppc;

	@Given("To verify user need to be in home page")
	public void to_verify_user_need_to_be_in_home_page() throws Exception {

		findYourHappyPlaceUrlLaunch();
	}

	@When("To verify user will click the bestsellers button")
	public void to_verify_user_will_click_the_bestsellers_button() throws Exception {
		fyhppc = new FyhpPC();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		fyhppc.getBestSellersButton().click();
	}

	@When("User will click the product")
	public void user_will_click_the_product() throws IOException {
		fyhppc.getBestSellerProduct().click();
	}

	@When("User will increase the quantity of the product")
	public void user_will_increase_the_quantity_of_the_product() {
		fyhppc.getIncreaseQuantity().click();
	}

	@Then("User will click add to cart button")
	public void user_will_click_add_to_cart_button() throws IOException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		fyhppc.getAddToCart().click();
	}

	@When("User click on checkout button")
	public void user_click_on_checkout_button() throws InterruptedException {
		Thread.sleep(3000);
		fyhppc.getCheckout().click();
	}

	@When("User enter the Mandatory details")
	public void user_enter_the_mandatory_details() throws IOException, InterruptedException {

		String Email = getValue("Data", "Mandatory", "Emailid");
		String phone = getValue("Data", "Mandatory", "Mobile");
		fyhppc.getEmail().sendKeys(Email);
		fyhppc.getPincode().sendKeys("600093");
		fyhppc.getLastname().sendKeys("Ayeesha");
		fyhppc.getAddress().sendKeys("This is for Testing purpose, Do not deliver to this address");
		fyhppc.getCity().sendKeys("Chennai");
		fyhppc.getPhone().sendKeys(phone);
	}

	@Then("Click on proceed and proceed to pay")
	public void click_on_proceed_and_proceed_to_pay() throws InterruptedException {

		fyhppc.getProceedClick().click();
		fyhppc.getProceedToPay().click();
		Thread.sleep(10000);
		// implicitWait();
		driver.switchTo().frame(0);

		boolean isEleEnabled = fyhppc.getProceedValidation().isEnabled();
		Assertion assertion = new Assertion();
		assertion.assertTrue(isEleEnabled, "the element not same");

	
	}

///Request1

	@Given("User need to be in home page")
	public void user_need_to_be_in_home_page() {
		findYourHappyPlaceUrlLaunch();
	}

	@When("User will click the Search button and add product name")
	public void user_will_click_the_search_button_and_add_product_name() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		fyhppc = new FyhpPC();
		fyhppc.getSearchText().click();
		fyhppc.getSearchInput().sendKeys("Bath oil");
		fyhppc.getBathoilProductClick().click();
	}

	@When("To verify user will click add to cart button")
	public void to_verify_user_will_click_add_to_cart_button() {
		fyhppc.getAddtoCart1().click();
	}

///Request2

	@When("User will click the Bath & Shower button")
	public void user_will_click_the_bath_shower_button() throws InterruptedException {
		fyhppc = new FyhpPC();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		fyhppc.getBathAndShower().click();
	}

	@When("User click on add to cart button")
	public void user_click_on_add_to_cart_button() {
		fyhppc.getAddtoCart2().click();
	}

	@Then("User click on delete button")
	public void user_click_on_delete_button() throws InterruptedException {
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(3000);
		fyhppc.getDelete().click();

		boolean isElementEnabled = fyhppc.getEmptyCart().isEnabled();
		Assertion assertion = new Assertion();
		assertion.assertTrue(isElementEnabled, "the element not same");

	}

///Request3	

	@Given("User click on Come Find Yours")
	public void user_click_on_come_find_yours() throws InterruptedException {
		fyhppc = new FyhpPC();
		fyhppc.getComeFindYours().click();
	}

	@Given("To verify user will click 1st option")
	public void to_verify_user_will_click_1st_option() {
		fyhppc.getFirstSecondOption().click();
		fyhppc.getNext1().click();	}

	@Given("To verify user will click 2nd option")
	public void to_verify_user_will_click_2nd_option() throws InterruptedException {
		fyhppc.getFirstSecondOption().click();;
		Thread.sleep(2000);
		fyhppc.getNext2().click();;
	}

	@Given("To verify user will click 3rd option")
	public void to_verify_user_will_click_3rd_option() throws InterruptedException {
		fyhppc.getThirdFourOption().click();;
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(3000);
		fyhppc.getNext3().click();
	}

	@Given("To verify user will click 4th option")
	public void to_verify_user_will_click_4th_option() throws InterruptedException {
		fyhppc.getThirdFourOption().click();
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(3000);
		fyhppc.getNext4().click();
	}

	@Then("Validate the landed page")
	public void validate_the_landed_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean ref = fyhppc.getShopCollectionValidation().isDisplayed();
		Assertion assertion = new Assertion();
		assertion.assertTrue(ref, "the element not same");
	}
////request4:

	@When("To verify user able to click Candles button")
	public void to_verify_user_able_to_click_candles_button() {
		fyhppc = new FyhpPC();
		fyhppc.getCandles().click();

	}

	@When("User will click the one of the Candles product")
	public void user_will_click_the_one_of_the_candles_product() {
		fyhppc.getCandlesProduct().click();
	}

	@When("User should increase the quantity of the product")
	public void user_should_increase_the_quantity_of_the_product() throws InterruptedException {
		fyhppc.getIncreaseQuantity().click();
	}

	@When("User will decrease the quantity of the product")
	public void user_will_decrease_the_quantity_of_the_product() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		fyhppc.getDecreaseButton().click();
	}
///Request5:

	@When("User will click the Search button")
	public void user_will_click_the_search_button() {
		fyhppc = new FyhpPC();
		fyhppc.getSearchText().click();
	}

	@When("User search with invalid keyword -Toner")
	public void user_search_with_invalid_keyword_toner() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		fyhppc.getSearchInput().sendKeys("Toner");
		fyhppc.getTonerClick().click();
	}

	@When("Validate No reuslt found message displayed or not")
	public void validate_no_reuslt_found_message_displayed_or_not() {

		boolean ref = fyhppc.getNoResult().isDisplayed();
		Assertion assertion = new Assertion();
		assertion.assertTrue(ref, "the element not same");
	}

}
