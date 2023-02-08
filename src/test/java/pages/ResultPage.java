package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends BasePage {
    @FindBy(xpath = "//article[@id='product-203813897']/a[1]")
    public WebElement firstShoeForMen;
    @FindBy(xpath = "//div[@id='pdp-react-critical-app']//h1[1]")
    public WebElement firstShoeText;
    @FindBy(xpath = "//h1[text()='Zapatos Oxford de vestir negros lisos con cordones de New Look']")
    public WebElement firstShoeTextDetail;
    @FindBy(xpath = "//div[@class='colour-size-select']//select[1]")
    public WebElement selectSize;
    @FindBy(tagName = "select")
    public WebElement selectShoe;
    @FindBy(xpath = "//span[text()='Añadir a mi bolsa']")
    public WebElement addToCart;
    @FindBy(className = "_1z5n7CN")
    public WebElement Cart;

    @FindBy(xpath = "//span[text()='Ver Bolsa']")
    public WebElement verBolsa;

}