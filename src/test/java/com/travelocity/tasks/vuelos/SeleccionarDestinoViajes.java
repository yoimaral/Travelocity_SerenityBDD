package com.travelocity.tasks.vuelos;

import com.travelocity.userinterfaces.vuelos.DetalleVuelos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarDestinoViajes implements Task {

    private String destino;
    private Integer diasViaje;

    public SeleccionarDestinoViajes(String destino, Integer diasViaje){
        this.destino = destino;
        this.diasViaje = diasViaje;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DetalleVuelos.CLASE_DE_VUELO),
                Click.on(DetalleVuelos.SELECT_CLASE),
                Click.on(DetalleVuelos.BUT_DESTINO),
                Enter.theValue(this.destino).into(DetalleVuelos.IN_DESTINO).thenHit(Keys.ENTER),
                Click.on(DetalleVuelos.SELECT_DATE_REGRESO),
                Click.on(DetalleVuelos.DATE_REGRESO),
                Click.on(DetalleVuelos.BUTTON_LISTO),
                Click.on(DetalleVuelos.BUT_BUSCAR)
        );
    }

    public static Performable destinoYDias(String destino, Integer diasViaje){
        return instrumented(SeleccionarDestinoViajes.class, destino, diasViaje);
    }


}
