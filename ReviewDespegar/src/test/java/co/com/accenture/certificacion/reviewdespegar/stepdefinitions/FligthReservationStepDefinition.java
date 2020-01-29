package co.com.accenture.certificacion.reviewdespegar.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.accenture.certificacion.reviewdespegar.tasks.InsertData;
import co.com.accenture.certificacion.reviewdespegar.tasks.NavegationPage;
import co.com.accenture.certificacion.reviewdespegar.userinterfaces.Page;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


import java.util.List;

public class FligthReservationStepDefinition {
	
	 @Managed(driver = "chrome")
	    private WebDriver hisBrowser = null;


	    @Before
	    public void setUp() {
	        OnStage.setTheStage(new OnlineCast());
	        OnStage.theActorCalled("Jessica").can(
	                BrowseTheWeb.with(hisBrowser));
	    }
	
	    @Given("^that the Autor looking for a flight reservation$")
	    public void thatTheAutorLookingForAFlightReservation() throws Throwable {
	        theActorInTheSpotlight().wasAbleTo(NavegationPage.in(Page.Despegar));
	       
	    }

	    @When("^the Actor insert the data from flight$")
	    public void theActorInsertTheDataFromFlight(List<List<String>> dataflight) throws Exception {
	  
	        theActorInTheSpotlight().attemptsTo(InsertData.inthePage(dataflight));
	    }
	    
	  
	    @And("^the Actor insert the personal data$")
	    public void theActorInsertThePersonalData() throws Throwable {
	      
	    }

	    @Then("^the Actor should see the personal data on screen$")
	    public void theActorShouldSeeThePersonalDataOnScreen() throws Throwable {
	        
	    }

	    //scenario with error message
	    
	    //@When("^the Actor insert data from flight (.+) ,(.+) and (.+) on screen$")
	    ///public void theActorInsertDataFromFlight AndOnScreen(String origincity, String departuredate, String returndate) throws Throwable {
	   // 	theActorInTheSpotlight().attemptsTo(InsertLessData.withTheFollowingData(origincity, date));
	    //}

	   // @Then("^the Actor should see a error message ingresa un destino$")
	   // public void theActorShouldSeeAErrorMessageIngresaUnDestino() throws Throwable {
	        
	    //}


}
