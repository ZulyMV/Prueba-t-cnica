package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestDevicesPage extends PageObject{

    public static final Target DEVICES_BUTTON=
            Target.the("Locate the button to continue the registration")
                    .located(By.xpath("//a[@class='btn btn-blue pull-right']"));

    public static final Target BUTTON_COMPUTER =
            Target.the("locate field to write computer")
                    .located(By.xpath("//div[@class='ui-select-match' and @placeholder='Select OS']"));

    public static final Target INPUT_COMPUTER =
            Target.the("locate field to write computer")
                    .located(By.xpath("//input[@type='search' and @placeholder='Select OS']"));

    public static final Target BUTTON_VERSION=Target.the("locate field to write the computer version").
            located(By.xpath("//div[@class='ui-select-match' and @placeholder='Select a Version']"));

    public static final Target INPUT_VERSION=Target.the("locate field to write the computer version").
            located(By.xpath("//input[@type='search' and @placeholder='Select a Version']"));

    public static final Target BUTTON_LANGUAGE=Target.the("locate field to write the computer language").
            located(By.xpath("//div[@class='ui-select-match' and @placeholder='Select OS language']"));

    public static final Target INPUT_LANGUAGE=Target.the("locate field to write the computer language").
            located(By.xpath("//input[@type='search' and @placeholder='Select OS language']"));

    public static final Target BUTTON_MOBILE=Target.the("locate field to write the mobile").
            located(By.xpath("//div[@class='ui-select-match' and @placeholder='Select Brand']//span[@class='btn btn-default form-control ui-select-toggle']"));

    public static final Target INPUT_MOBILE=Target.the("locate field to write the mobile").
            located(By.xpath("//input[@type='search' and @placeholder='Select Brand']"));

    public static final Target BUTTON_MODEL=Target.the("locate field to write the mobile model").
            located(By.xpath("//div[@class='ui-select-match' and @placeholder='Select a Model']"));

    public static final Target INPUT_MODEL=Target.the("locate field to write the mobile model").
            located(By.xpath("//input[@type='search' and @placeholder='Select a Model']"));

    public static final Target BUTTON_SYSTEM=Target.the("locate field to write the mobile Operating System").
            located(By.name("handsetOSId"));

    public static final Target INPUT_SYSTEM=Target.the("locate field to write the mobile Operating System").
            located(By.xpath("//div[@name='handsetOSId']//input[@type='search' and @placeholder='Select OS']"));


}
