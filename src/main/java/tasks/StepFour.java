package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.UTestStepFour;

public class StepFour implements Task {
    private String strPass;
    private String strConfirmPass;

    public StepFour(String strPass, String strConfirmPass) {
        this.strPass = strPass;
        this.strConfirmPass = strConfirmPass;
    }

    public static StepFour SignUp(String strPass, String strConfirmPass) {
        return  Tasks.instrumented(StepFour.class, strPass, strConfirmPass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strPass).into(UTestStepFour.INPUT_PASSWORD),
                Enter.theValue(strConfirmPass).into(UTestStepFour.INPUT_CONFIRM_PASSWORD),
                Click.on(UTestStepFour.CHECKMARK_ONE),
                Click.on(UTestStepFour.CHECKMARK_TWO),
                Click.on(UTestStepFour.BUTTON_COMPLETE)
        );
    }
}
