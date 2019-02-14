package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import app1.AddToCartPage;
import app1.CartSummary;
import app1.HomePage;
import app1.LoginPage;
import app1.ProductPage;
import app1.TshirtPage;

import config.BaseTest;
import config.LaunchBrowser;
import config.PageObject;

public class TC1 extends LaunchBrowser {

	@Test
	@Parameters({ "username", "password" })
	public void tc1(String userName, String password) throws Exception {
		 HomePage homePage=new HomePage();
		 homePage.clickSignInLink();
		 Thread.sleep(3000);
		 
		 LoginPage loginPage=new LoginPage();
		 loginPage.enterUserName(userName);
		 loginPage.enterPassword(password);
		 loginPage.clickSubmitButton();
		 Thread.sleep(3000);
		 
		 ProductPage productPage=new ProductPage();
		 productPage.clickTshirtMenuItem();
		 Thread.sleep(3000);
		 
		 TshirtPage tshirtPage=new TshirtPage();
		 tshirtPage.clickOnFadedTshirt();
		 Thread.sleep(3000);
		 
		 AddToCartPage addToCartPage=new AddToCartPage();
		 addToCartPage.clickAddToCartButton();
		 Thread.sleep(3000);
		 
		 CartSummary cartSummary=new CartSummary();
		 cartSummary.verifyThatProductAddedSuccessFully("Product successfully added to your shopping cart");
		 cartSummary.verifyProductTitle("Faded Short Sleeve T-shirts");
		 cartSummary.verifyProductPrice("$16.51");
		 cartSummary.verifyProductQuantity("1");
		 cartSummary.verifyProductAttributes("Orange, S");
		 Thread.sleep(3000);
	}
}
