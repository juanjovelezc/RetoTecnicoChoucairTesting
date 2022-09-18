package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import userinterface.UTestStepThree;

public class StepThree implements Task {
    private String strComputer;
    private String strVersion;
    private String strLanguage;
    private String strMobilDevice;
    private String strModel;
    private String strOS;

    public StepThree(String strComputer, String strVersion, String strLanguage, String strMobilDevice, String strModel, String strOS) {
        this.strComputer = strComputer;
        this.strVersion = strVersion;
        this.strLanguage = strLanguage;
        this.strMobilDevice = strMobilDevice;
        this.strModel = strModel;
        this.strOS = strOS;
    }

    public static StepThree SignUp(String strComputer, String strVersion, String strLanguage, String strMobilDevice, String strModel, String strOS) {
        return Tasks.instrumented(StepThree.class, strComputer, strVersion, strLanguage, strMobilDevice, strModel, strOS);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestStepThree.SELECT_COMPUTER),
                Enter.theValue(strComputer).into(UTestStepThree.COMPUTER),
                Click.on(UTestStepThree.SELECT_VERSION),
                Enter.theValue(strVersion).into(UTestStepThree.VERSION),
                Click.on(UTestStepThree.SELECT_LANGUAGE),
                Enter.theValue(strLanguage).into(UTestStepThree.LANGUAGE),
                Click.on(UTestStepThree.SELECT_MOBIL_DEVICE),
                Enter.theValue(strMobilDevice).into(UTestStepThree.MOBIL_DEVICE),
                Hit.the(Keys.ARROW_DOWN).into(UTestStepThree.MOBIL_DEVICE),
                Hit.the(Keys.ENTER).into(UTestStepThree.MOBIL_DEVICE),
                Click.on(UTestStepThree.SELECT_MODEL),
                Enter.theValue(strModel).into(UTestStepThree.MODEL),
                Hit.the(Keys.ARROW_DOWN).into(UTestStepThree.MODEL),
                Hit.the(Keys.ENTER).into(UTestStepThree.MODEL),
                Click.on(UTestStepThree.SELECT_OS),
                Enter.theValue(strOS).into(UTestStepThree.OS),
                Hit.the(Keys.ARROW_DOWN).into(UTestStepThree.OS),
                Hit.the(Keys.ENTER).into(UTestStepThree.OS),
                Click.on(UTestStepThree.BUTTON_STEPFOUR)

                );
    }
}
