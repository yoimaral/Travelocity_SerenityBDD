package com.travelocity.stepdefinitions;

import com.travelocity.tasks.hospedaje.SeleccionarDiasHospedaje;
import com.travelocity.tasks.hospedaje.SeleccionarDiasHospedajeAuto;
import com.travelocity.tasks.hospedaje.SeleccionarHospedajes;
import com.travelocity.userinterfaces.hospedajes.HospedajesEncontrados;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

public class SeleccionarHospedajesStepDefinitions {

    @Dado("que {actor} quiero hospedarme en el {string}")
    public void hospedaje(Actor actor,String destino) {
        actor.attemptsTo(
                SeleccionarHospedajes.para(destino));
    }

    @Cuando("quiero reservar por {int} dias")
    public void hospedajeDias(Integer dias){
        OnStage.theActorInTheSpotlight().attemptsTo(
               SeleccionarDiasHospedaje.hospedajeDias(dias));
    }

    @Entonces("debo visualizar el hotel")
    public void debeObtenerHospedajes(){
        Ensure.that(HospedajesEncontrados.LIST_HOTEL_ENCONTRADO).values().hasSizeGreaterThan(0);
    }


    @Entonces("debo visualizar opciones de hospedaje en Nickelodeon Hotels & Resorts All Inclusive Riviera Maya")
    public void debeObtenerHotel(){
        Ensure.that(HospedajesEncontrados.HOTEL).values().hasSizeGreaterThan(0);
    }



    @Cuando("quiero reservar por {int} dias con opcion de agregar auto")
    public void hospedajeDiasAuto(Integer dias){
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarDiasHospedajeAuto.DiasHospedajeAuto(dias));
    }

    @Entonces("debo visualizar opciones de hospedaje y auto")
    public void debeObtenerHotelYAuto(){
        Ensure.that(HospedajesEncontrados.HOTEL_AUTO).values().hasSizeGreaterThan(0);
    }

}
