package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class FAQPage {

    private static final By COOKIE_BUTTON = By.id("rcc-confirm-button");


    private static WebDriver driver;
    public FAQPage(WebDriver driver) {

        this.driver = driver;
    }
    public static void quqClick() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(COOKIE_BUTTON));
        driver.findElement(COOKIE_BUTTON).click();
    }

    public static void openQuestion(int index) {

        driver.findElement(By.id("accordion__heading-" + index)).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("accordion__panel-" + index)));
    }

    public static String getQuestionAnswer(int index) {
        WebElement panel = driver.findElement(By.id("accordion__panel-" + index));
        String actualText = panel.getText();
        return actualText;
    }


}