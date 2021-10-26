package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestDevicesPage extends PageObject{

    public static final Target DEVICES_BUTTON=
            Target.the("")
                    .located(By.xpath("//a[@class='btn btn-blue pull-right']"));

    public static final Target BUTTON_COMPUTER =
            Target.the("")
                    .located(By.xpath("//div[@class='ui-select-match' and @placeholder='Select OS']"));

    public static final Target INPUT_COMPUTER =
            Target.the("")
                    .located(By.xpath("//input[@type='search' and @placeholder='Select OS']"));

    public static final Target BUTTON_VERSION=Target.the("").
            located(By.xpath("//div[@class='ui-select-match' and @placeholder='Select a Version']"));

    public static final Target INPUT_VERSION=Target.the("").
            located(By.xpath("//input[@type='search' and @placeholder='Select a Version']"));

    public static final Target BUTTON_LANGUAGE=Target.the("").
            located(By.xpath("//div[@class='ui-select-match' and @placeholder='Select OS language']"));

    public static final Target INPUT_LANGUAGE=Target.the("").
            located(By.xpath("//input[@type='search' and @placeholder='Select OS language']"));

    public static final Target BUTTON_MOBILE=Target.the("").
            located(By.xpath("//div[@class='ui-select-match' and @placeholder='Select Brand']//span[@class='btn btn-default form-control ui-select-toggle']"));

    public static final Target INPUT_MOBILE=Target.the("").
            located(By.xpath("//input[@type='search' and @placeholder='Select Brand']"));

    public static final Target BUTTON_MODEL=Target.the("").
            located(By.xpath("//div[@class='ui-select-match' and @placeholder='Select a Model']"));

    public static final Target INPUT_MODEL=Target.the("").
            located(By.xpath("//input[@type='search' and @placeholder='Select a Model']"));

    public static final Target BUTTON_SYSTEM=Target.the("").
            located(By.name("handsetOSId"));

    public static final Target INPUT_SYSTEM=Target.the("").
            located(By.xpath("//div[@name='handsetOSId']//input[@type='search' and @placeholder='Select OS']"));


}
