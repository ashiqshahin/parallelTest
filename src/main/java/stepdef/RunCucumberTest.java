package stepdef;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/main/java/feature/"}, // Path to your feature files
        glue= {"stepdef"}, // Path to your step definitions
        tags="@Ashiq", // This will run the feature file tagged as @Ashiq
        plugin= {"pretty","html:target/cucumberreport.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        monochrome=true
        //,dryRun=true
        //,strict=true
        //,stepNotifications=true
        //,snippets= CucumberOptions.SnippetType.CAMELCASE}
        )
public class RunCucumberTest {
}
