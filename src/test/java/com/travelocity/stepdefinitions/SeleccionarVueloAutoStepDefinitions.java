package com.travelocity.stepdefinitions;

import com.travelocity.tasks.autos.SeleccionarDiasRenta;
import com.travelocity.tasks.autos.SeleccionarOrigenAuto;
import com.travelocity.tasks.hospedaje.SeleccionarDiasHospedaje;
import com.travelocity.tasks.hospedaje.SeleccionarHospedajes;
import com.travelocity.userinterfaces.hospedajes.HospedajesEncontrados;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

public class SeleccionarVueloAutoStepDefinitions {


    @Dado("{actor} esta buscando auto en {string}")
    public void autos(Actor actor, String destino) {
        actor.attemptsTo(
                SeleccionarOrigenAuto.destino(destino));
    }

    @Cuando("quiere rentarlo {int} dias y regresarlo a {string}")
    public void rentaDias(Integer dias, String devolucion){
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarDiasRenta.diasRenta(dias, devolucion));
    }

    @Entonces("debe obtener alguna opcion de renta")
    public void debeObtenerAutos(){
        Ensure.that(HospedajesEncontrados.LIST_HOTEL_ENCONTRADO).values().hasSizeGreaterThan(0);
    }

}
