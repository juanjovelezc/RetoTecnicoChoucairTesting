package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class WhyUTest extends PageObject {
    public static final Target PLATFORM_NAME = Target.the("Name of the platform").located(By.xpath("//h2[contains(text(),'The uTest Academy')]"));
}
