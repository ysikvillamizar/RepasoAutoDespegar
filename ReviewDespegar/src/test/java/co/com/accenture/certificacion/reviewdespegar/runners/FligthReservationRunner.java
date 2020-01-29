package co.com.accenture.certificacion.reviewdespegar.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
		features="src\\test\\resources\\features\\flight_reservation.feature",
		glue="co.com.accenture.certificacion.reviewdespegar.stepdefinitions",
		snippets= SnippetType.CAMELCASE
		)
public class FligthReservationRunner {

}
