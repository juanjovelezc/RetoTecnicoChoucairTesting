package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.UTestStepTwo;

public class StepTwo implements Task {
    private String strCity;
    private String strZip;
    private String strCountry;

    public StepTwo(String strCity, String strZip, String strCountry) {
        this.strCity = strCity;
        this.strZip = strZip;
        this.strCountry = strCountry;
    }

    public static StepTwo SignUp(String strCity, String strZip, String strCountry) {
        return Tasks.instrumented(StepTwo.class, strCity, strZip, strCountry);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strCity).into(UTestStepTwo.INPUT_CITY),
                        Enter.theValue(strZip).into(UTestStepTwo.INPUT_ZIP),
                        Click.on(UTestStepTwo.SELECT_COUNTRY),
                        Enter.theValue(strCountry).into(UTestStepTwo.COUNTRY),
                        Click.on(UTestStepTwo.BUTTON_STEPTHREE)
        );
    }
}
