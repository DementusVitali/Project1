package Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends PageObject {

    protected BasePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

}
