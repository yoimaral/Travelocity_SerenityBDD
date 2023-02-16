package com.travelocity.tasks.hospedaje;

import com.travelocity.pageobjects.TravelocityHomePage;
import com.travelocity.tasks.vuelos.SeleccionarDestinoViajes;
import com.travelocity.userinterfaces.hospedajes.DetalleHospedajes;
import com.travelocity.userinterfaces.vuelos.DetalleVuelos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarHospedajes implements Task {

    private String destino;

    public SeleccionarHospedajes (String destino){
        this.destino = destino;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(TravelocityHomePage.class),
                Click.on(DetalleHospedajes.BUT_DESTINO),
                Enter.theValue(destino).into(DetalleHospedajes.IN_DESTINO).thenHit(Keys.ENTER)

        );
    }

    public static Performable dias(String destino){
        return instrumented(SeleccionarHospedajes.class, destino);
    }
}
