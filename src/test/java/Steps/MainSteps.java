package Steps;

import Pages.MainPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class MainSteps extends ScenarioSteps {

    private MainPage onPage;

    @Step
    public void ClickOnSignInButton(){
        onPage.clickSigninButton();
    }

    @Step
    public void openMainpage(){
        onPage.openMainPage();

    }
    @Step
    public void fillInEmailAddress(String email){
        onPage.fillEmailAddress(email);
    }
}
