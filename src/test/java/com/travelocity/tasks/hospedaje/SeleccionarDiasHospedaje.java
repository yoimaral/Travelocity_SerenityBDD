package com.travelocity.tasks.hospedaje;

import com.travelocity.userinterfaces.hospedajes.DetalleHospedajes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import javax.swing.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarDiasHospedaje implements Task {

    private Integer dias;

    public SeleccionarDiasHospedaje(Integer dias){
        this.dias = dias;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(DetalleHospedajes.SELECT_DATE_SALIDA),
                Click.on(DetalleHospedajes.DATE_SALIDA),
                Click.on(DetalleHospedajes.BUTTON_LISTO),
                Click.on(DetalleHospedajes.BUT_BUSCAR)
        );
    }

    public static Performable hospedajeDias(Integer dias){

        return instrumented(SeleccionarDiasHospedaje.class,dias);
    }

}
