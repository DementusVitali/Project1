package Tests;

import Pages.BasePage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
@RunWith(SerenityRunner.class)
public abstract class Simpletest {

        @Managed(driver = "chrom",uniqueSession = true)
        private WebDriver driver;



        @Steps
        public User user;


        @After
        public void tearDown() {
            driver.quit();
        }
}
