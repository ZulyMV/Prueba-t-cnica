package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestJoinPage extends PageObject{

    public static final Target JOIN_BUTTON=
            Target.the("Button to access the record")
                    .located(By.xpath("//div[@class='unauthenticated-nav-bar__links navbar-right hidden-sm hidden-xs']//a[contains(text(),'Join Today')]"));

    public static final Target INPUT_FIRST_NAME =
            Target.the("Locate the input to write the name")
                    .located(By.id("firstName"));

    public static final Target INPUT_LAST_NAME =
            Target.the("Locate the input to write the last name")
                    .located(By.id("lastName"));

    public static final Target INPUT_EMAIL =
            Target.the("Locate the input to write the email")
                    .located(By.id("email"));

    public static final Target INPUT_MONTH=
            Target.the("Locate the select to choose the month of birth").
            located(By.id("birthMonth"));

    public static final Target INPUT_DAY=
            Target.the("Locate the select to choose the day of birth").
            located(By.id("birthDay"));

    public static final Target INPUT_YEAR=
            Target.the("Locate the select to choose the year of birth").
            located(By.id("birthYear"));

    public static final Target INPUT_LANGUAGE=Target.the("Locate the input to write other language").
            located(By.xpath("//div[@id='languages']//input[@type='search']"));

}
