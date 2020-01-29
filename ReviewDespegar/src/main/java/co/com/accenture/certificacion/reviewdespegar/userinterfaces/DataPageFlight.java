package co.com.accenture.certificacion.reviewdespegar.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DataPageFlight extends PageObject{

	public static final Target ICON= Target.the("Select the option flight").locatedBy("//*[@class='shifu-icon-product shifu-3-icon-flights']");
	public static final Target ORIGINCITY= Target.the("Select the origin city").locatedBy("//div[@class='sbox-3-input -md sbox-3-validation -top-right -icon-left sbox-origin-container places-inline sbox-bind-error-flight-roundtrip-origin-empty']//input[@placeholder='Ingresa desde d�nde viajas']");
	public static final Target CHOOSEORIGINCITY=Target.the("Choose origin city").locatedBy("//*[@class='item -active']");
	public static final Target DESTINATIONCITY= Target.the("Select the destination city").locatedBy("//div[@class='sbox-3-input -md sbox-3-validation -top-right -icon-left sbox-destination-container sbox-bind-error-flight-roundtrip-destination-empty sbox-bind-error-flight-roundtrip-equal-destination']//input[@placeholder='Ingresa hacia d�nde viajas']");
	public static final Target CHOOSEDESTINATIONCITY=Target.the("Choose origin city").locatedBy("//*[@class='item -active']");
	public static final Target ORIGINDATE=Target.the("Select the origin date").locatedBy("//div[@class='input-container sbox-bind-event-click-start-date']//input[@placeholder='Ida']");
	public static final Target CHOOSEORIGINDATE=Target.the("Select the origin date").locatedBy("(//*[@class='_dpmg2--date-number'])[contains(text(),'{0}')]");
	public static final Target CHOOSEDESTINATIONDATE=Target.the("Select the destination date").locatedBy("(//*[@class='_dpmg2--date-number'])[contains(text(),'{0}')]");
	public static final Target SEARCHBUTTON=Target.the("Select the search button").locatedBy("//div[@class='sbox-button -ml3-l -mt5-l']//a[@class='sbox-3-btn -primary -md sbox-search']");
	public static final Target CHOOSEFLIGTH=Target.the("Select the flight").locatedBy("//*[@id=\"clusters\"]/span[1]/span/cluster/div/div/div[2]/fare/span/span/div/buy-button/a");
	public static final Target CHOOSEPAKCAGE=Target.the("Select package").locatedBy("//*[@id=\"upselling-baggage-popup-position\"]/upselling-baggage-popup/div/div[3]/div/div/button");
	

}

