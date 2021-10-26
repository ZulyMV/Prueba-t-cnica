package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.userinterface.UtestLastStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class LastStep implements Task {

    private String strpasword;

    public LastStep(String strpasword) {
        this.strpasword = strpasword;
    }

    public static LastStep onThePage(String strpasword) {
        return Tasks.instrumented(LastStep.class, strpasword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestLastStepPage.LASTSTEP_BUTTON),
                        Enter.theValue(strpasword).into(UtestLastStepPage.INPUT_PASSWORD),
                        Enter.theValue(strpasword).into(UtestLastStepPage.INPUT_CONFIRM),
                        Click.on(UtestLastStepPage.STAY_INFORMED),
                        Click.on(UtestLastStepPage.TERM_USE),
                        Click.on(UtestLastStepPage.PRIVACY_SECURITY),
                        Click.on(UtestLastStepPage.COMPLETE_BUTTON),
                        WaitUntil.the(UtestLastStepPage.SUCCESSFULLY_SIGNUP, WebElementStateMatchers.isVisible()).forNoMoreThan(40).seconds());
    }
}
