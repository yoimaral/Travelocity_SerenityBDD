package com.travelocity.userinterfaces.vuelos;

import net.serenitybdd.screenplay.targets.Target;


public class VuelosEncontrados {
    public static final Target LIST_VUELOS_ENCONTRADOS = Target.the("lista vuelos encontrados")
            .locatedBy("//ul[@data-test-id='listings']");

    public static final Target LIST_VUELOS_AUTO = Target.the("lista vuelos con auto")
            .locatedBy("//div[@class='uitk-price-subtext-padded']/div[2]");

    public static Target LIST_VUELOS_HOSPEDAJE = Target.the("Lista vuelos con hospedaje")
            .locatedBy("//div[@xpath='1']");


}
