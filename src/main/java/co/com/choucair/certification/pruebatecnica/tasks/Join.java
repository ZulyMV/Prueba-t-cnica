package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.userinterface.UtestJoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Join implements Task {
    private String strfirstname;
    private String strlastname;
    private String stremailadress;
    private String strmonth;
    private String strday;
    private String stryear;
    private String strlanguageuser;

  public Join(String strfirstname, String strlastname, String stremailadress, String strmonth,
              String strday, String stryear, String strlanguageuser) {
    this.strfirstname = strfirstname;
    this.strlastname = strlastname;
    this.stremailadress = stremailadress;
    this.strmonth = strmonth;
    this.strday = strday;
    this.stryear = stryear;
    this.strlanguageuser=strlanguageuser;
  }

    public static Join onThePage (String strfirstname, String strlastname, String stremailadress,
                                  String strmonth, String strday, String stryear, String strlanguageuser) {
        return Tasks.instrumented(Join.class,strfirstname,strlastname,stremailadress,strmonth,strday,stryear, strlanguageuser);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestJoinPage.JOIN_BUTTON),
                Enter.theValue(strfirstname).into(UtestJoinPage.INPUT_FIRST_NAME),
                Enter.theValue(strlastname).into(UtestJoinPage.INPUT_LAST_NAME),
                Enter.theValue(stremailadress).into(UtestJoinPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strmonth).from(UtestJoinPage.INPUT_MONTH),
                SelectFromOptions.byVisibleText(strday).from(UtestJoinPage.INPUT_DATE),
                SelectFromOptions.byVisibleText(stryear).from(UtestJoinPage.INPUT_YEAR),
                Enter.theValue(strlanguageuser).into(UtestJoinPage.INPUT_LANGUAGE));
    }
}
