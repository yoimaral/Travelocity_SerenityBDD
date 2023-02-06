package com.travelocity.userinterfaces.autos;

import net.serenitybdd.screenplay.targets.Target;

public class AutosEncontrados {

    public static final Target LIST_AUTOS_ENCONTRADOS = Target.the("lista autos encontrados")
            .locatedBy("//ol[@class='results-list no-bullet']");

}
