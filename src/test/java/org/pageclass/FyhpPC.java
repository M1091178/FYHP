package org.pageclass;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FyhpPC extends BaseClass {

	public FyhpPC() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[text()='Search'])[2]")
	private WebElement SearchText;

	@FindBy(xpath = "(//input[@type='search'])[2]")
	private WebElement SearchInput;

	@FindBy(xpath = "//button[@class='predictive-search__item--term button button--small button--full-width']")
	private WebElement BathoilProductClick;

	@FindBy(xpath = "(//div[@class='collection_scheama card-wrapper'])[1]")
	private WebElement BestSellersButton;

	@FindBy(xpath = "(//*[@id='card_wrapper_list'])[1]")
	private WebElement BestSellerProduct;

	@FindBy(xpath = "//button[@name='plus']")
	private WebElement IncreaseQuantity;

	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement AddToCart;

	@FindBy(xpath = "//button[@class='button']")
	private WebElement Checkout;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement Email;

	@FindBy(xpath = "(//input[@placeholder='PIN code'])[1]")
	private WebElement Pincode;

	@FindBy(xpath = "//input[@placeholder='Last name']")
	private WebElement Lastname;

	@FindBy(xpath = "//input[@placeholder='City']")
	private WebElement City;

	@FindBy(xpath = "//input[@placeholder='Phone']")
	private WebElement Phone;

	@FindBy(xpath = "//button[@name='button']")
	private WebElement ProceedClick;

	@FindBy(xpath = "(//button[@id='continue_button'])[1]")
	private WebElement ProceedToPay;

	@FindBy(xpath = "//input[@placeholder='Address']")
	private WebElement Address;

	@FindBy(xpath ="(//add-to-cart[text()='Add to cart'])[1]")
	private WebElement AddtoCart1;
	
	@FindBy(xpath="//*[text()='BATH & SHOWER']")
	private WebElement BathAndShower;

	@FindBy(xpath="(//add-to-cart[@class='product-form__submit button button--secondary button--small button--full-width'])[1]")
	private WebElement AddtoCart2;
	
	@FindBy(xpath="//a[@class='delete-product']")
	private WebElement Delete;
	
	@FindBy(xpath="(//menu-dropdown[@class='is-megamenu'])[1]")
	private WebElement HomePage;
	
	@FindBy(xpath="//div[text()='CANDLES']")
	private WebElement Candles;
	
	@FindBy(xpath="(//a[@class='full-unstyled-link'])[1]")
	private WebElement CandlesProduct;
	
	@FindBy(xpath="(//button[@class='quantity__button no-js-hidden'])[1]")
	private WebElement DecreaseButton;
	
	@FindBy(xpath="//button[@class='predictive-search__item--term button button--small button--full-width']")
	private WebElement TonerClick;
	
	@FindBy(xpath="//h2[text()='Check the spelling or use a different word or phrase']")
	private WebElement NoResult;
	
	@FindBy(xpath="//span[text()='Proceed']")
	private WebElement ProceedValidation;
	
	@FindBy(xpath="//h3[text()='Your cart is currently empty']")
	private WebElement EmptyCart;
	
	@FindBy(xpath="//button[text()='Come Find Yours']")
	private WebElement ComeFindYours;
	
	@FindBy(xpath="(//div[@class='opt-box option-3'])[1]")
	private WebElement FirstSecondOption;
	
	@FindBy(xpath="(//div[@class='opt-box option-1'])[3]")
	private WebElement ThirdFourOption;
	
	@FindBy(xpath="(//span[@id='next'])[1]")
	private WebElement Next1;
	
	public WebElement getNext1() {
		return Next1;
	}
	@FindBy(xpath="(//span[@id='next'])[2]")
	private WebElement Next2;
	
	public WebElement getNext2() {
		return Next2;
	}
	@FindBy(xpath="(//span[@id='next'])[3]")
	private WebElement Next3;
	
	public WebElement getNext3() {
		return Next3;
	}
	@FindBy(xpath="(//span[@id='next'])[4]")
	private WebElement Next4;
	
	public WebElement getNext4() {
		return Next4;
	}
	@FindBy(xpath="(//button[text()=' SHOP COLLECTION '])[1]")
	private WebElement ShopCollectionValidation;
	
	public WebElement getShopCollectionValidation() {
		return ShopCollectionValidation;
	}
	public WebElement getThirdFourOption() {
		return ThirdFourOption;
	}
	public WebElement getFirstSecondOption() {
		return FirstSecondOption;
	}
	
	public WebElement getComeFindYours() {
		return ComeFindYours;
	}
	public WebElement  getEmptyCart() {
		return EmptyCart;
	}
	public WebElement getProceedValidation() {
		return ProceedValidation;
	}
	
	
	public WebElement getNoResult() {
		return NoResult;
	}
	
	public WebElement getTonerClick() {
		return TonerClick;
	}
	public WebElement getDecreaseButton() {
		return DecreaseButton;
		
	}
	
	public WebElement getCandlesProduct() {
		return CandlesProduct;
		
	}
	public WebElement getCandles() {
		return Candles;
	}
	public WebElement getHomepage() {
	return HomePage;
	}
	public WebElement getDelete() {
		return Delete;
	}
	
	public WebElement getAddtoCart2() {
		return AddtoCart2;
	}
	public WebElement getBathAndShower() {
		return BathAndShower;
	
	}
	public WebElement getSearchText() {
		return SearchText;
	}

	public WebElement getBestSellerProduct() {
		return BestSellerProduct;
	}

	public WebElement getBestSellersButton() {
		return BestSellersButton;
	}

	public WebElement getBathoilProductClick() {
		return BathoilProductClick;

	}

	public WebElement getIncreaseQuantity() {
		return IncreaseQuantity;

	}

	public WebElement getAddToCart() {
		return AddToCart;

	}

	public WebElement getCheckout() {
		return Checkout;

	}

	public WebElement getEmail() {
		return Email;

	}

	public WebElement getPincode() {
		return Pincode;

	}

	public WebElement getLastname() {
		return Lastname;

	}

	public WebElement getCity() {
		return City;

	}

	public WebElement getPhone() {
		return Phone;

	}

	public WebElement getProceedClick() {
		return ProceedClick;

	}

	public WebElement getProceedToPay() {
		return ProceedToPay;

	}
	public WebElement getAddtoCart1() {
		return AddtoCart1;

	}
	public WebElement getAddress() {
		return Address;

	}
	public WebElement getSearchInput() {
		return SearchInput;

	}

}