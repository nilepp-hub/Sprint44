package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderPage {
    //кнопка заказать в шапке
    private static final By UP_ZAKAZ_BUTTON = By.className("Button_Button__ra12g");

    private static WebDriver driver;
    public HeaderPage(WebDriver driver) {

        this.driver = driver;
    }
    public static void upZakazClick() {

        driver.findElement(UP_ZAKAZ_BUTTON).click();
    }


}
