package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import userinterface.UTestStepOne;

public class StepOne implements Task {



    private String strFirstName;
    private String strLastName;
    private String strEmail;
    public StepOne(String strFirstName, String strLastName, String strEmail) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
    }
    public static StepOne SignUp(String strFirstName, String strLastName, String strEmail) {
        return Tasks.instrumented(StepOne.class, strFirstName, strLastName, strEmail);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strFirstName).into(UTestStepOne.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(UTestStepOne.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(UTestStepOne.INPUT_EMAIL),
                Click.on(UTestStepOne.SELECT_BIRTH_MONTH),
                Click.on(UTestStepOne.SELECT_BIRTH_DAY),
                Click.on(UTestStepOne.SELECT_BIRTH_YEAR),
                Click.on(UTestStepOne.BUTTON_STEPTWO)
                );
    }
}
