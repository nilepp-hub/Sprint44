package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RoadMapPage {
    private static final By DOWN_ZAKAZ_BUTTON = By.cssSelector("#root > div > div.Home_HomePage__ZXKIX > div.Home_ThirdPart__LSTEE > div.Home_RoadMap__2tal_ > div.Home_FinishButton__1_cWm > button");

    private static WebDriver driver;
    public RoadMapPage(WebDriver driver) {

        this.driver = driver;
    }
    public static void downZakazClick() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(DOWN_ZAKAZ_BUTTON));
        driver.findElement(DOWN_ZAKAZ_BUTTON).click();
    }
}
