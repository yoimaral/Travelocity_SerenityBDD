package com.travelocity.tasks.autos;

import com.travelocity.pageobjects.TravelocityHomePage;
import com.travelocity.userinterfaces.autos.DetalleAutos;
import com.travelocity.userinterfaces.autos.MenuAutos;
import com.travelocity.userinterfaces.vuelos.DetalleVuelos;
import com.travelocity.userinterfaces.vuelos.MenuTravelocity;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class SeleccionarOrigenAuto {

    public static Performable para(String entrega) {
        return Task.where("{0} abre travelocity en autos y selecciona entrega {1}",
                Open.browserOn().the(TravelocityHomePage.class),
                Click.on(MenuAutos.A_AUTOS),
                Click.on(DetalleAutos.BUT_ENTREGA),
                Enter.theValue(entrega).into(DetalleAutos.IN_ENTREGA),
                WaitUntil.the(DetalleAutos.BUT_SELECT_ENTREGA, isEnabled()).forNoMoreThan(Duration.ofSeconds(100)),
                Click.on(DetalleAutos.BUT_SELECT_ENTREGA)
        );

    }
}
