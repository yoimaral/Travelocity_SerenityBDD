package travelocity.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class SeleccionarOrigenVuelos {

    public static Performable para(String origenName) {
        return Task.where("{0} abre travelocity en vuelosy seleccionaorigen {1}",
                Open.browserOn().the(TravelocityHomePage.class),

                );

    }
}
