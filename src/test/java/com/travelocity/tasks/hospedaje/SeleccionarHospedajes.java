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

public class SeleccionarHospedajes {

    public static Performable para(String destino) {
       return Task.where("{0} abre travelocity en hospedaje y selecciona destino {1}",
                Open.browserOn().the(TravelocityHomePage.class),
                Click.on(DetalleHospedajes.BUT_DESTINO),
                Enter.theValue(destino).into(DetalleHospedajes.IN_DESTINO).thenHit(Keys.ENTER)
        );
    }
}