package com.travelocity.tasks.vuelos;

import com.travelocity.userinterfaces.vuelos.DetalleVuelos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarDestinoHospedaje implements Task {

    private String destino;

    private int dias;

    public SeleccionarDestinoHospedaje(String destino, int dias){
        this.destino = destino;
        this.dias = dias;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DetalleVuelos.BUT_DESTINO),
                Enter.theValue(this.destino).into(DetalleVuelos.IN_DESTINO).thenHit(Keys.ENTER),
                Click.on(DetalleVuelos.SELECT_DATE_REGRESO),
                Click.on(DetalleVuelos.DATE_REGRESO),
                Click.on(DetalleVuelos.BUTTON_LISTO),
                Click.on(DetalleVuelos.CHECKBOX_HOSPEDAJE),
                Click.on(DetalleVuelos.BUT_BUSCAR)
        );
    }

    public static Performable destinoYHospedaje(String destino, int dias){
       return instrumented(SeleccionarDestinoHospedaje.class, destino, dias);
    }

}
