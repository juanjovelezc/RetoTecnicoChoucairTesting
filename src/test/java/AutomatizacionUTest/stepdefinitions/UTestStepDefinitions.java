package AutomatizacionUTest.stepdefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.Before;
import model.UTestData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.*;

import java.util.List;

public class UTestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^The user seeks to register on the platform$")
    public void the_user_seeks_to_register_on_the_platform() {
        OnStage.theActorCalled("User").wasAbleTo(OpenUp.thePage());

    }

    @When("^The user clicks on the option to register and proceeds to complete the form$")
    public void the_user_clicks_on_the_option_to_register(List<UTestData> uTestData) throws Exception{
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(Register.onThePage(), StepOne.SignUp(uTestData.get(0).getStrFirstName(), uTestData.get(0).getStrLastName(),uTestData.get(0).getStrEmail()), (StepTwo.SignUp(uTestData.get(0).getStrCity(),uTestData.get(0).getStrZip(),uTestData.get(0).getStrCountry())), (StepThree.SignUp(uTestData.get(0).getStrComputer(),uTestData.get(0).getStrVersion(), uTestData.get(0).getStrLanguage(), uTestData.get(0).getStrMobilDevice(),uTestData.get(0).getStrModel(), uTestData.get(0).getStrOS())), (StepFour.SignUp(uTestData.get(0).getStrPass(), uTestData.get(0).getStrConfirmPass())));
    }

    @Then("^He registers correctly,now$")
    public void he_proceeds_to_complete_the_register(List<UTestData> uTestData) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(uTestData.get(0).getStrPlatformName())));
    }

}
