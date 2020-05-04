package Tests;

import org.junit.Test;

public class LoginTest extends Simpletest {

    @Test
    public void loginTest(){
        user.mainPages.openMainpage();
        user.mainPages.ClickOnSignInButton();
        user.mainPages.fillInEmailAddress("automationstep@fmail.com");
    }
}
