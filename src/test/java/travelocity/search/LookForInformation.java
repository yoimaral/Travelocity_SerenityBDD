package travelocity.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import net.serenitybdd.screenplay.targets.Target;

public class LookForInformation {

    public static Performable about(String searchTerm) {
        return Task.where("{0} searches for '" + searchTerm + "'",
                Enter.theValue(searchTerm)
                        .into(SearchForm.SEARCH_FIELD)
                        .thenHit(Keys.ENTER)
        );
    }

    public static Performable about(String searchTerm, Target target) {
        return Task.where("{0} searches for '" + searchTerm + "'",
                Enter.theValue(searchTerm)
                        .into(target)
                        .thenHit(Keys.ENTER)
        );
    }

    public static Performable intoSearchForm(String searchTerm) {
        return Task.where("{0} searches for '" + searchTerm + "'",
                Click.on(VuelosRedondos.SEARCH_BUTTON),
                Enter.theValue(searchTerm)
                        .into(VuelosRedondos.SEARCH_FIELD)
                        .thenHit(Keys.ENTER)
        );
    }
}
