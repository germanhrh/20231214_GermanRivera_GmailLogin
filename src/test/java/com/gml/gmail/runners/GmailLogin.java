package com.gml.gmail.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com/gml/gmail/stepsdefinitions",
        features = "src/test/resources/features/gmail_login.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class GmailLogin {
}
