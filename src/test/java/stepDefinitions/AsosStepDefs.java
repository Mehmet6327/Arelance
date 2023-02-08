package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import pages.AsosMainPage;
import pages.ResultPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import static org.junit.Assert.*;

public class AsosStepDefs {
    @Given("the user is on the Asos page")
    public void the_user_is_on_the_Asos_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        String expectedUrl = ConfigurationReader.get("url");
        String actualUrl = Driver.get().getCurrentUrl();
        assertEquals(expectedUrl,actualUrl);
    }
    @When("the user searches for {string}")
    public void the_user_searches_for(String expectedShoesForMen) throws InterruptedException {
        AsosMainPage asosMainPage = new AsosMainPage();
        asosMainPage.searchBox.sendKeys(expectedShoesForMen);
        asosMainPage.searchButton.click();
        Thread.sleep(3000);
        ResultPage resultPage = new ResultPage();
        asosMainPage.adressPopUp.click();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        resultPage.firstShoeForMen.click();

    }
    }
