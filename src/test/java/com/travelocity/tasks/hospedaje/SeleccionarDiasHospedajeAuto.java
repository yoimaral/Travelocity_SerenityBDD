package com.travelocity.tasks.hospedaje;

import com.travelocity.userinterfaces.hospedajes.DetalleHospedajes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarDiasHospedajeAuto implements Task {

    private Integer dias;

    public SeleccionarDiasHospedajeAuto(Integer dias){
       this.dias = dias;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DetalleHospedajes.SELECT_DATE_SALIDA),
                Click.on(DetalleHospedajes.DATE_SALIDA),
                Click.on(DetalleHospedajes.BUTTON_LISTO),
                Click.on(DetalleHospedajes.CHECKBOX_AUTO),
                Click.on(DetalleHospedajes.BUT_BUSCAR)

        );
    }

    public static Performable DiasHospedajeAuto(Integer dias){
        return instrumented(SeleccionarDiasHospedajeAuto.class, dias);
    }



}
