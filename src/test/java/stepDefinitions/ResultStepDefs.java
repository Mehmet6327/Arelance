package stepDefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.ResultPage;
import utilities.ConfigurationReader;
import utilities.Driver;


public class ResultStepDefs {
    ResultPage resultPage;
    String shoeName;
    @When("the user selects first shoe appearing")
    public void the_user_selects_first_shoe_appearing() throws InterruptedException {
        resultPage = new ResultPage();
        shoeName = resultPage.firstShoeText.getText();
        Thread.sleep(3000);
    }
    @When("the user adds the shoe to the Cart with quantity {string}")
    public void the_user_adds_the_shoe_to_the_Cart_with_quantity(String quantity) throws InterruptedException {

        resultPage.selectSize.click();

        try {
            Select selectShoe = new Select(resultPage.selectShoe);
            selectShoe.selectByIndex(4);
        } catch (Exception e) {
            System.out.println("noSize");
        }
        Thread.sleep(3000);
        resultPage.addToCart.click();

   }
    @When("the user opens the cart")
    public void the_user_opens_the_cart() {
        resultPage.Cart.click();
        resultPage.verBolsa.click();
        String shoppingCartUrl = Driver.get().getCurrentUrl();
        Assert.assertTrue(shoppingCartUrl.contains(ConfigurationReader.get("shoppingCartUrl")));
    }
}
