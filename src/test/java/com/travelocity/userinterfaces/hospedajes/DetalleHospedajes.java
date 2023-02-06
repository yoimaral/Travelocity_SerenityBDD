package com.travelocity.userinterfaces.hospedajes;

import net.serenitybdd.screenplay.targets.Target;

public class DetalleHospedajes {

    public static final Target BUT_DESTINO = Target.the("button de destino").locatedBy("//button[@aria-label='Destino']");
    public static final Target IN_DESTINO = Target.the("input de destino").locatedBy("//input[@id='location-field-destination']");

    public static final Target SELECT_DATE_SALIDA = Target.the("selector de fecha salida").locatedBy("//button[@id='d2-btn']");

    public static final Target DATE_SALIDA = Target.the("calendar fecha salida").locatedBy("//button[@data-day='23']");

     public static final Target BUTTON_LISTO = Target.the("boton listo").locatedBy("//button[@data-stid='apply-date-picker']");

    public static final Target BUT_BUSCAR = Target.the("boton buscar hospedaje").locatedBy("//button[@data-testid='submit-button']");

    public static final Target CHECKBOX_AUTO = Target.the("boton check auto").locatedBy("//input[@id='add-car-switch']");
}
