package com.travelocity.search;

import net.serenitybdd.screenplay.targets.Target;

public class ExitoSection {

    public static final Target SEARCH_BAR =  Target.the("search bar").locatedBy("/html/body/div[2]/div/div[1]/div/div[1]/div[1]/div/div[2]/div/div[1]/div/div/div/div/div[4]/div/div/div/div/div[1]/div/div/div/div/div[1]/div/label/div/input");

    public static final Target TITLE_SECTION = Target.the("search bar").locatedBy("/html/body/div[2]/div/div[1]/div/div[2]/div/div[8]/section/div[2]/div/div[1]/div/div/div/span/a");
}
