package com.travelocity.userinterfaces.hospedajes;

import net.serenitybdd.screenplay.targets.Target;

public class HospedajesEncontrados {

    public static final Target LIST_HOTEL_ENCONTRADO = Target.the("hotel encontrado")
            .locatedBy("//input[@value='Hotel Dann Carlton Bogota']");

    public static final Target HOTEL = Target.the("hotel encontrado")
            .locatedBy("//div[@data-stid='property-listing-results']");

    public static final Target HOTEL_AUTO = Target.the("hotel encontrado")
            .locatedBy("//div[@data-stid='property-listing-results']");


}
