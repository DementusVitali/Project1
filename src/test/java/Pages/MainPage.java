package Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@DefaultUrl("http://automationpractice.com/index.php")
public class MainPage extends BasePage {

    @FindBy(css = "a.login")
    private WebElement signInButton;

    @FindBy(id = "email")
    private WebElement emailField;

    public MainPage(WebDriver driver) {
        super(driver);
    }
        public void openMainPage(){
        open();
    }
    public void clickSigninButton() {
             element(signInButton).click();

     }
    public void fillEmailAddress(String email){
      element(emailField).sendKeys(email);
    }

}
