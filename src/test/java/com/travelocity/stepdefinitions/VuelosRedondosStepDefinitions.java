package com.travelocity.stepdefinitions;


import com.travelocity.tasks.vuelos.SeleccionarDestinoViajes;
import com.travelocity.tasks.vuelos.SeleccionarOrigenVuelos;
import com.travelocity.userinterfaces.vuelos.VuelosEncontrados;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;


public class VuelosRedondosStepDefinitions {

    @Dado("{string} esta en {string}")
    public void viajeOrigen(Actor actor, String origen) {
        actor.attemptsTo(
                SeleccionarOrigenVuelos.para(origen)
        );
    }

    @Cuando ("quiera viajar a {string} por {int} dias")
    public void viajeDestinoConDias(String destino, Integer cantidadDias) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarDestinoViajes.destinoYDias(destino, cantidadDias));
    }

    @Entonces ("debe obtener alguna opcion de vuelo")
    public void viajeObtenerAlgunaOpcion() {
        Ensure.that(VuelosEncontrados.LIST_VUELOS_ENCONTRADOS).values().hasSizeGreaterThan(0);
    }


   // @Cuando("quiera viajar a {string} agregando un {string}")
   // public void viajeConAuto(String destino) {
    //    OnStage.theActorInTheSpotlight().attemptsTo(
    //            SeleccionarDestinoAuto.destinoYAuto(destino)
    //    );
   // }

   // @Entonces("debe obtener alguna opcion de auto")
    //public void viajeObtenerVuelosAuto(){
      //  Ensure.that(VuelosEncontrados.LIST_VUELOS_AUTO).values().hasSizeGreaterThan(0);
    //}


}