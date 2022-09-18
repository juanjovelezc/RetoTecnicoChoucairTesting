package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UTestWelcome extends PageObject {
    public static final Target PLATFORM_NAME = Target.the("Name of platform").located(By.xpath("//strong[contains(text(),'Participate in the uTest Academy')]"));
}
