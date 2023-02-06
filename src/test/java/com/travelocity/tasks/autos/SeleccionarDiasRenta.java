package com.travelocity.tasks.autos;

import com.travelocity.userinterfaces.autos.DetalleAutos;
import com.travelocity.userinterfaces.vuelos.DetalleVuelos;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarDiasRenta implements Task {
private String devolucion;
private int dias;

    public SeleccionarDiasRenta (int dias,String devolucion){
        this.devolucion = devolucion;
        this.dias = dias;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DetalleAutos.BUT_DEVOLUCION),
                Enter.theValue(this.devolucion).into(DetalleAutos.IN_DEVOLUCION).thenHit(Keys.ENTER),
                Click.on(DetalleAutos.SELECT_DATE_DEVOLUCION),
                Click.on(DetalleAutos.DATE_DEVOLUCION),
                Click.on(DetalleAutos.BUTTON_LISTO),
                Click.on(DetalleAutos.BUT_BUSCAR)
        );
    }

    public static Performable diasRenta(int dias, String devolucion){
        return instrumented(SeleccionarDiasRenta.class, dias, devolucion);
    }
}
