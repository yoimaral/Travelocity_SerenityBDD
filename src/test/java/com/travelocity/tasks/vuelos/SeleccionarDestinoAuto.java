package com.travelocity.tasks.vuelos;

import com.travelocity.userinterfaces.vuelos.DetalleVuelos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarDestinoAuto implements Task {
private String destino;

    public SeleccionarDestinoAuto(String destino){
        this.destino = destino;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(DetalleVuelos.BUT_DESTINO),
                Enter.theValue(this.destino).into(DetalleVuelos.IN_DESTINO).thenHit(Keys.ENTER),
                Click.on(DetalleVuelos.BUTTON_LISTO),
                Click.on(DetalleVuelos.CHECKBOX_AUTO),
                Click.on(DetalleVuelos.BUT_BUSCAR)
        );
    }

    public static Performable destinoYAuto(String destino){
        return instrumented(SeleccionarDestinoAuto.class, destino);
    }

}
