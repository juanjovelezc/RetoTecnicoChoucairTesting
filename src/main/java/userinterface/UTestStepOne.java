package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UTestStepOne extends PageObject {
    public static final Target INPUT_FIRST_NAME = Target.the("where do we write the first name").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("where do we write the last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the email").located(By.id("email"));
    public static final Target SELECT_BIRTH_MONTH = Target.the("where do we write the birth month").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[1]/select/option[11]"));
    public static final Target SELECT_BIRTH_DAY = Target.the("where do we write the birth day").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[2]/select/option[22]"));
    public static final Target SELECT_BIRTH_YEAR = Target.the("where do we write the birth year").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[3]/select/option[9]"));
    public static final Target BUTTON_STEPTWO = Target.the("continue the form to step two").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a"));





}
