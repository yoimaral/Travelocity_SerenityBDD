package travelocity.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import travelocity.pageobjects.NavigateTo;
import travelocity.search.ExitoSection;
import travelocity.search.LookForInformation;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ExitoStepDefinitions {

    @Given("{actor} is searching for a section")
    public void searchSection(Actor actor){
        actor.wasAbleTo(
                NavigateTo.theExitoHomePage(),
                WaitUntil.the(ExitoSection.SEARCH_BAR, isEnabled()).forNoMoreThan(Duration.ofSeconds(10))
        );
    }

    @When("{actor} looks up for the section {string}")
    public void searchesFor(Actor actor, String term) {
        actor.attemptsTo(
                LookForInformation.about(term, ExitoSection.SEARCH_BAR),
                WaitUntil.the(ExitoSection.TITLE_SECTION, isEnabled()).forNoMoreThan(Duration.ofSeconds(10))
        );
    }

    @Then("{actor} should see information about the section {string}")
    public void should_see_information_about(Actor actor, String term) {
        actor.attemptsTo(
                Ensure.that(ExitoSection.TITLE_SECTION).hasText(term)
        );
    }

}
