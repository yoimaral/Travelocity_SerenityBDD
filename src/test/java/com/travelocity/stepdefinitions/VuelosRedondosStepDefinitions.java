package com.travelocity.stepdefinitions;

import com.travelocity.tasks.vuelos.SeleccionarDestinoAuto;
import com.travelocity.tasks.vuelos.SeleccionarDestinoHospedaje;
import com.travelocity.tasks.vuelos.SeleccionarDestinoViajes;
import com.travelocity.tasks.vuelos.SeleccionarOrigenVuelos;
import com.travelocity.userinterfaces.vuelos.VuelosEncontrados;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;


public class VuelosRedondosStepDefinitions {

    @Dado("{actor} esta en {string}")
    public void viajeOrigen(Actor actor, String origen) {
        actor.attemptsTo(
                SeleccionarOrigenVuelos.origen(origen)
        );
    }

    @Cuando ("quiera viajar a {string} por {int} dias")
    public void viajeDestinoConDias(String destino, Integer cantidadDias) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarDestinoViajes.destinoYDias(destino, cantidadDias));
    }

    @Entonces ("debe obtener alguna opcion de vuelo")
    public void viajeObtenerAlgunaOpcion() {
        Ensure.that(VuelosEncontrados.LIST_VUELOS_ENCONTRADOS).values().hasSizeGreaterThan(1);
    }


    @Cuando("quiera viajar a {string} agregando un auto")
    public void viajeConAuto(String destino) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarDestinoAuto.destinoYAuto(destino));
    }

    @Entonces("debe obtener alguna opcion de auto")
    public void viajeObtenerVuelosAuto(){
        Ensure.that(VuelosEncontrados.LIST_VUELOS_AUTO).values().hasSizeGreaterThan(0);
    }



    @Cuando("quiera viajar a {string} agregando un hospedaje por {int} dias")
    public void viajeHospedaje(String destino, int cantidadDias){
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarDestinoHospedaje.destinoYHospedaje(destino, cantidadDias));
    }

    @Entonces("debe obtener varias opcion de vuelo y hospedaje")
    public void viajeObtenerVuelos(){
        Ensure.that(
                VuelosEncontrados.LIST_VUELOS_HOSPEDAJE).values().hasSizeGreaterThan(0);
    }


}