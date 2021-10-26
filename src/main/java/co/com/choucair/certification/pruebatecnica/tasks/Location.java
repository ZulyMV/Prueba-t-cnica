package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.userinterface.UtestLocationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class Location implements Task {

    private String strcity;
    private String strzip;
    private String strcountry;

    public Location(String strcity, String strzip, String strcountry) {
        this.strcity = strcity;
        this.strzip = strzip;
        this.strcountry = strcountry;
    }

    public static Location onThePage(String strcity, String strzip, String strcountry) {
        return Tasks.instrumented(Location.class, strcity, strzip, strcountry);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestLocationPage.LOCATION_BUTTON),
                Enter.theValue(strcity).into(UtestLocationPage.INPUT_CITY),
                Enter.theValue(strzip).into(UtestLocationPage.INPUT_ZIP),
                Click.on(UtestLocationPage.BUTTON_COUNTRY),
                Enter.theValue(strcountry).into(UtestLocationPage.INPUT_COUNTRY),
                        Hit.the(Keys.ENTER).keyIn(UtestLocationPage.INPUT_COUNTRY));
    }

}

