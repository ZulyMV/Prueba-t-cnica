package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestLocationPage extends PageObject{

    public static final Target LOCATION_BUTTON=
            Target.the("")
                    .located(By.xpath("//a[@class='btn btn-blue']"));

    public static final Target INPUT_CITY =
            Target.the("")
                    .located(By.id("city"));

    public static final Target INPUT_ZIP =
            Target.the("")
                    .located(By.id("zip"));

   public static final Target BUTTON_COUNTRY=Target.the("locate field to write country").
            located(By.xpath("//div[@class='ui-select']"));

    public static final Target INPUT_COUNTRY=Target.the("locate field to write country").
            located(By.xpath("//input[@type='search' and @placeholder='Select a country']"));


}
