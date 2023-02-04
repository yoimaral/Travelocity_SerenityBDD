package com.travelocity.userinterfaces.vuelos;

import net.serenitybdd.screenplay.targets.Target;


public class VuelosEncontrados {
    public static final Target LIST_VUELOS_ENCONTRADOS = Target.the("lista vuelos encontrados")
            .locatedBy("//ul[@data-test-id='listings']");

   /// public static final Target LIST_VUELOS_AUTO = Target.the("lista vuelos encontrados")
         ///   .locatedBy("//div[text()='vuelo y auto incluidos']");
}
