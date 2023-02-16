package com.travelocity.tasks.autos;

import com.travelocity.pageobjects.TravelocityHomePage;
import com.travelocity.userinterfaces.autos.DetalleAutos;
import com.travelocity.userinterfaces.autos.MenuAutos;
import com.travelocity.userinterfaces.vuelos.DetalleVuelos;
import com.travelocity.userinterfaces.vuelos.MenuTravelocity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class SeleccionarOrigenAuto implements Task{

    private String destino;

    public SeleccionarOrigenAuto (String destino){
        this.destino = destino;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(TravelocityHomePage.class),
                Click.on(MenuAutos.A_AUTOS),
                Click.on(DetalleAutos.BUT_ENTREGA),
                Enter.theValue(this.destino).into(DetalleAutos.IN_ENTREGA),
                //WaitUntil.the(DetalleAutos.BUT_SELECT_ENTREGA, isEnabled()).forNoMoreThan(Duration.ofSeconds(100)),
                Click.on(DetalleAutos.BUT_SELECT_ENTREGA)

        );
    }

    public static Performable destino(String destino){

        return  instrumented(SeleccionarOrigenAuto.class, destino);
    }

}
