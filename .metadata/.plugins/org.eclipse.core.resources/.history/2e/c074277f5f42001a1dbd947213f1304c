package co.com.accenture.certificacion.reviewdespegar.tasks;

import java.util.List;

import co.com.accenture.certificacion.reviewdespegar.userinterfaces.DataPageFlight;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class InsertData implements Task{

	private List<List<String>> dataflight;

	

	public InsertData(List<List<String>> dataflight) {
		
		this.dataflight = dataflight;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(DataPageFlight.ICON),	Click.on(DataPageFlight.ORIGINCITY), 
				Enter.theValue(dataflight.get(1).get(0)).into(DataPageFlight.ORIGINCITY),
				Click.on(DataPageFlight.CHOOSEORIGINCITY),
				Click.on(DataPageFlight.DESTINATIONCITY),
				Enter.theValue(dataflight.get(1).get(1)).into(DataPageFlight.DESTINATIONCITY),
				Click.on(DataPageFlight.CHOOSEDESTINATIONCITY),
				Click.on(DataPageFlight.ORIGINDATE),Click.on(DataPageFlight.CHOOSEORIGINDATE.of(dataflight.get(1).get(2))),
				Click.on(DataPageFlight.CHOOSEDESTINATIONDATE.of(dataflight.get(1).get(3))),
				Click.on(DataPageFlight.SEARCHBUTTON), Click.on(DataPageFlight.CHOOSEPAKCAGE));		
		
	}
	
	public static InsertData inthePage(List<List<String>> dataFlight) {
		return Tasks.instrumented(InsertData.class, dataFlight);
	}
	
	
	
}
