package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestJoinPage extends PageObject{

    public static final Target JOIN_BUTTON=
            Target.the("")
                    .located(By.xpath("//div[@class='unauthenticated-nav-bar__links navbar-right hidden-sm hidden-xs']//a[contains(text(),'Join Today')]"));

    public static final Target INPUT_FIRST_NAME =
            Target.the("")
                    .located(By.id("firstName"));

    public static final Target INPUT_LAST_NAME =
            Target.the("")
                    .located(By.id("lastName"));

    public static final Target INPUT_EMAIL =
            Target.the("")
                    .located(By.id("email"));

    public static final Target INPUT_MONTH=Target.the("").
            located(By.id("birthMonth"));

    public static final Target INPUT_DATE=Target.the("").
            located(By.id("birthDay"));

    public static final Target INPUT_YEAR=Target.the("").
            located(By.id("birthYear"));

    public static final Target INPUT_LANGUAGE=Target.the("").
            located(By.xpath("//div[@id='languages']//input[@type='search']"));

}
