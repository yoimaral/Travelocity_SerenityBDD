package travelocity.pageobjects;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable theWikipediaHomePage() {
        return Task.where("{0} opens the Wikipedia home page",
                Open.browserOn().the(WikipediaHomePage.class));
    }

    public static Performable theExitoHomePage() {
        return Task.where("{0} opens the Exito home page",
                Open.browserOn().the(ExitoHomePage.class));
    }

    public static Performable theVuelosRedondosHomePage() {
        return Task.where("{0} opens the vuelos redondos home page",
                Open.browserOn().the(TravelocityHomePage.class));
    }
}
