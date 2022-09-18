package AutomatizacionUTest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/RegistroUTest.feature",
        tags="@stories",
        glue= "AutomatizacionUTest.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class RunnerTags {

}
