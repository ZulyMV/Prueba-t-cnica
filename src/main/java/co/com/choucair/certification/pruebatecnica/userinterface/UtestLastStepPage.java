package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestLastStepPage extends PageObject{

    public static final Target SUCCESSFULLY_SIGNUP =Target.the("Verify that the registration is successful").
            located(By.xpath("//*[@id=''laddaBtn']/span[1]"));

    public static final Target LASTSTEP_BUTTON=
            Target.the("Locate the button to continue the registration")
                    .located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(),'Next: Last Step')]"));

    public static final Target INPUT_PASSWORD =
            Target.the("Locate the input to write the password")
                    .located(By.id("password"));

    public static final Target INPUT_CONFIRM =
            Target.the("Locate the input to write the password confirmation")
                    .located(By.id("confirmPassword"));

    public static final Target STAY_INFORMED=
            Target.the("Locate the checkbox to accept stay informed").
            located(By.name("newsletterOptIn"));

    public static final Target TERM_USE=
            Target.the("Locate the checkbox to accept terms of use").
            located(By.name("termOfUse"));

    public static final Target PRIVACY_SECURITY=
            Target.the("Locate the checkbox to accept the security and privacy policies").
            located(By.name("privacySetting"));

    public static final Target COMPLETE_BUTTON=
            Target.the("Locate the button to finish the registration")
                    .located(By.xpath("//div[@class='pull-right next-step']//a[@aria-label='Complete Setup']"));




}
