package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UTestStepTwo extends PageObject {
    public static final Target INPUT_CITY = Target.the("Where do we write the city").located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("Where do we write the postal code").located(By.id("zip"));
    public static final Target SELECT_COUNTRY = Target.the("container of the country").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public static final Target COUNTRY = Target.the("Where do we select the country").located((By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]")));
    public static final Target BUTTON_STEPTHREE = Target.the("continue the form to step three").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

}
