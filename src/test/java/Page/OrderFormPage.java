package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderFormPage {
    private static final By NAME = By.xpath("//input[@placeholder=\"* Имя\"]");
    private static final By FAM = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Form__17u6u > div:nth-child(2) > input");
    private static final By ADRES = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Form__17u6u > div:nth-child(3) > input");
    private static final By METRO = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Form__17u6u > div:nth-child(4) > div > div > input");
    private static final By STATION = By.className("select-search__row");
    private static final By PHONE = By.xpath("//input[@placeholder=\"* Телефон: на него позвонит курьер\"]");
    private static final By DALEE = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button");
    private static WebDriver driver;
    public OrderFormPage(WebDriver driver) {

        this.driver = driver;
    }


    public static void fillOrderUpZakaz() {
        driver.findElement(NAME).sendKeys("Борис");
        driver.findElement(FAM).sendKeys("Борисов");
        driver.findElement(ADRES).sendKeys("Борисова 1");
        driver.findElement(PHONE).sendKeys("+79899507744");
    }
    public static void fillOrderDownZakaz() {
        driver.findElement(NAME).sendKeys("Anna");
        driver.findElement(FAM).sendKeys("Annovna");
        driver.findElement(ADRES).sendKeys("Annovnikov 1");
        driver.findElement(PHONE).sendKeys("+798995077444");
    }
    public  static void vvodMetro1() {
        driver.findElement(METRO).clear();
        driver.findElement(METRO).sendKeys("цветной");
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(STATION));
        driver.findElement(STATION).click();
    }
    public  static void vvodMetro2() {
        driver.findElement(METRO).clear();
        driver.findElement(METRO).sendKeys("черкизовская");
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(STATION));
        driver.findElement(STATION).click();
    }
    public  static void clickDalee() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(DALEE));
      driver.findElement(DALEE).click();
    }
}