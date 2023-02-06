package com.travelocity.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/autos/auto_renta.feature",
        glue = {"com.travelocity.stepdefinitions"}
)
public class autosRunner {
}
