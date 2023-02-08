package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

public class AsosMainPage extends BasePage {
    @FindBy(xpath = "//input[contains(@class,'Cyuazsm _1LCOtZ3')]")
    public WebElement searchBox;
    @FindBy(xpath = "//button[@class='kH5PAAC _1KRfEms']")
    public WebElement searchButton;
    @FindBy(xpath = "//button[text()='De acuerdo']")
    public WebElement adressPopUp;
    @FindBy(xpath = "(//div[@id='onetrust-button-group']//button)[2]")
    public WebElement acuerdoPopUp;


    public void dismissPopUp(){
        try {
            if (adressPopUp.isEnabled()){
                adressPopUp.click();
            }else{
                acuerdoPopUp.click();
            }
        }
        catch (Exception e){
        }
    }
}
