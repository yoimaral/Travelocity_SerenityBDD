package com.travelocity.userinterfaces.autos;

import net.serenitybdd.screenplay.targets.Target;

public class DetalleAutos {

    public static final Target BUT_ENTREGA = Target.the("button de entrega").locatedBy("//button[@data-stid='location-field-locn-menu-trigger']");
    public static final Target BUT_SELECT_DEVOLUCION = Target.the("clien en el lugar de devolucion").locatedBy("//div[@xpath='1']/button[1]");

    public static final Target IN_ENTREGA = Target.the("input de entrega").locatedBy("//input[@id='location-field-locn']");

    public static final Target BUT_DEVOLUCION = Target.the("button de devolucion").locatedBy("//button[@data-stid='location-field-loc2-menu-trigger']");

    public static final Target IN_DEVOLUCION = Target.the("input de devolucion").locatedBy("#location-field-loc2");

    public static final Target SELECT_DATE_DEVOLUCION = Target.the("selector de fecha devolucion").locatedBy("//button[@id='d2-btn']");

    public static final Target DATE_DEVOLUCION = Target.the("calendar fecha devolucion").locatedByFirstMatching("//button[@data-day='17']");

    public static final Target BUTTON_LISTO = Target.the("boton listo").locatedBy("//button[@data-stid='apply-date-picker']");

    public static final Target BUT_BUSCAR = Target.the("boton buscar vuelos").locatedBy("//button[@data-testid='submit-button']");

    public static final Target BUT_SELECT_ENTREGA = Target.the("clien en el lugar de entrega").locatedBy("//div[@xpath='1']/button[1]");
}
