package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.userinterface.UtestDevicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class Devices implements Task {

    private String strcomputer;
    private String strversion;
    private String strlanguage;
    private String strmobile;
    private String strmodel;
    private String strsystem;

    public Devices(String strcomputer, String strversion, String strlanguage, String strmobile, String strmodel, String strsystem) {
        this.strcomputer = strcomputer;
        this.strversion = strversion;
        this.strlanguage = strlanguage;
        this.strmobile = strmobile;
        this.strmodel = strmodel;
        this.strsystem = strsystem;
    }

    public static Devices onThePage(String strcomputer, String strversion, String strlanguage, String strmobile, String strmodel, String strsystem) {
        return Tasks.instrumented(Devices.class, strcomputer, strversion, strlanguage, strmobile, strmodel, strsystem);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestDevicesPage.DEVICES_BUTTON),
                Click.on(UtestDevicesPage.BUTTON_COMPUTER),
                Enter.theValue(strcomputer).into(UtestDevicesPage.INPUT_COMPUTER),
                Click.on(UtestDevicesPage.BUTTON_VERSION),
                Enter.theValue(strversion).into(UtestDevicesPage.INPUT_VERSION),
                Click.on(UtestDevicesPage.BUTTON_LANGUAGE),
                Enter.theValue(strlanguage).into(UtestDevicesPage.INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).keyIn(UtestDevicesPage.INPUT_LANGUAGE),
                Click.on(UtestDevicesPage.BUTTON_MOBILE),
                Enter.theValue(strmobile).into(UtestDevicesPage.INPUT_MOBILE),
                Hit.the(Keys.ENTER).keyIn(UtestDevicesPage.INPUT_MOBILE),
                Click.on(UtestDevicesPage.BUTTON_MODEL),
                Enter.theValue(strmodel).into(UtestDevicesPage.INPUT_MODEL),
                Hit.the(Keys.ENTER).keyIn(UtestDevicesPage.INPUT_MODEL),
                Click.on(UtestDevicesPage.BUTTON_SYSTEM),
                Enter.theValue(strsystem).into(UtestDevicesPage.INPUT_SYSTEM),
                Hit.the(Keys.ENTER).keyIn(UtestDevicesPage.INPUT_SYSTEM));
    }
}
