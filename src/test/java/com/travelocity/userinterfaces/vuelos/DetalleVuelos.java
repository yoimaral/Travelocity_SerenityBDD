package com.travelocity.userinterfaces.vuelos;

import net.serenitybdd.screenplay.targets.Target;

public class DetalleVuelos {

    public static final Target CLASE_DE_VUELO = Target.the("button de clase").locatedBy("//button[@id='preferred-class-input-trigger']");
    public static final Target SELECT_CLASE = Target.the("select clase").locatedBy("//div[@role='menu']/a[2]");
    public static final Target BUT_ORIGEN = Target.the("button de origen").locatedBy("//button[@data-stid='location-field-leg1-origin-menu-trigger']");
    public static final Target IN_ORIGEN = Target.the("input de origen").locatedBy("//input[@id='location-field-leg1-origin']");
    public static final Target BUT_DESTINO = Target.the("button de destino").locatedBy("//button[@data-stid='location-field-leg1-destination-menu-trigger']");
    public static final Target IN_DESTINO = Target.the("input de destino").locatedBy("//input[@id='location-field-leg1-destination']");

    public static final Target SELECT_DATE_REGRESO = Target.the("selector de fecha regreso").locatedBy("//button[@id='d2-btn']");
    public static final Target BUTTON_LISTO = Target.the("boton listo").locatedBy("//button[@data-stid='apply-date-picker']");
    public static final Target CHECKBOX_HOSPEDAJE = Target.the("boton check hospedaje").locatedBy("//input[@id='add-hotel-checkbox']");
    public static final Target CHECKBOX_AUTO = Target.the("boton check auto").locatedBy("//input[@id='add-car-checkbox']");
    public static final Target DATE_REGRESO = Target.the("calendar fecha regreso").locatedByFirstMatching("//button[@data-day='17']");
    public static final Target BUT_BUSCAR = Target.the("boton buscar vuelos").locatedBy("//button[@data-testid='submit-button']");
}
