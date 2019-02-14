package app1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import config.BaseTest;
import config.PageObject;

public class CartSummary extends PageObject {
	public CartSummary() {
		super(BaseTest.driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='layer_cart']//h2")
	private WebElement cart;

	public void verifyThatProductAddedSuccessFully(String expectedValue) {
		Assert.assertEquals(cart.getText(), expectedValue);
	}

	//@FindBy(id = "layer_cart_product_title")
	@FindBy(css="#layer_cart_product_title")
	private WebElement title;

	public void verifyProductTitle(String expectedValue) {
		Assert.assertEquals(title.getText(), expectedValue);
	}

	//@FindBy(id = "layer_cart_product_price")
	@FindBy(css="#layer_cart_product_price")
	private WebElement price;

	public void verifyProductPrice(String expectedValue) {
		Assert.assertEquals(price.getText(), expectedValue);
	}

	//@FindBy(id = "layer_cart_product_quantity")
	@FindBy(css="#layer_cart_product_quantity")
	private WebElement quantity;

	public void verifyProductQuantity(String expectedValue) {
		Assert.assertEquals(quantity.getText(), expectedValue);
	}

	//@FindBy(id = "layer_cart_product_attributes")
	@FindBy(css="#layer_cart_product_attributes")
	private WebElement attributes;

	public void verifyProductAttributes(String expectedValue) {
		Assert.assertEquals(attributes.getText(), expectedValue);
	}
}
