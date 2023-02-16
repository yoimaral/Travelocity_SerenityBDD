package com.travelocity.tasks.vuelos;

import com.travelocity.userinterfaces.vuelos.DetalleVuelos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import com.travelocity.pageobjects.TravelocityHomePage;
import com.travelocity.userinterfaces.vuelos.MenuTravelocity;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOrigenVuelos implements Task {

    private String origen;

    public SeleccionarOrigenVuelos (String origen){
        this.origen = origen;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(TravelocityHomePage.class),
                Click.on(MenuTravelocity.A_VUELOS),
                Click.on(DetalleVuelos.BUT_ORIGEN),
                Enter.theValue(this.origen).into(DetalleVuelos.IN_ORIGEN).thenHit(Keys.ENTER)

        );
    }

    public static Performable origen(String origen) {
        return instrumented(SeleccionarOrigenVuelos.class, origen);
    }
}
