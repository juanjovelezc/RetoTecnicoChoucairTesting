package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UTestStepFour extends PageObject {
    public static final Target INPUT_PASSWORD = Target.the("Write your password").located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Confirm your password").located(By.id("confirmPassword"));
    public static final Target CHECKMARK_ONE = Target.the("Check Mark  Terms").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECKMARK_TWO = Target.the("Check Mark  Privacy").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_COMPLETE = Target.the("Complete the registration").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));

}
