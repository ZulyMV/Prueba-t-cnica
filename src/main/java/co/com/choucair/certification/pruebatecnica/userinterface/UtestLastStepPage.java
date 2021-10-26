package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestLastStepPage extends PageObject{

    public static final Target LASTSTEP_BUTTON=
            Target.the("")
                    .located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(),'Next: Last Step')]"));

    public static final Target INPUT_PASSWORD =
            Target.the("")
                    .located(By.id("password"));

    public static final Target INPUT_CONFIRM =
            Target.the("")
                    .located(By.id("confirmPassword"));

    public static final Target STAY_INFORMED=
            Target.the("").
            located(By.name("newsletterOptIn"));

    public static final Target TERM_USE=
            Target.the("").
            located(By.name("termOfUse"));

    public static final Target PRIVACY_SECURITY=
            Target.the("").
            located(By.name("privacySetting"));

    public static final Target COMPLETE_BUTTON=
            Target.the("")
                    .located(By.xpath("//A[@class='btn btn-blue']//span[contains(text(),'Join Today')]"));

    public static final Target SUCCESSFULLY_SIGNUP =Target.the("").
            located(By.id("mainContent"));



}
