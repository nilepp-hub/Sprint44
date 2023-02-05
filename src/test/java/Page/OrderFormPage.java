package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderFormPage {
    private static final By NAME = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Form__17u6u > div:nth-child(1) > input");
    private static final By FAM = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Form__17u6u > div:nth-child(2) > input");
    private static final By ADRES = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Form__17u6u > div:nth-child(3) > input");
    private static final By METRO = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Form__17u6u > div:nth-child(4) > div > div > input");
    private static final By STATION = By.className("select-search__row");
    private static final By PHONE = By.className("Input_Input__1iN_Z Input_Error__1Tx5d Input_Responsible__1jDKN");
    //private static final By DALEE = By.className("Button_Button__ra12g Button_Middle__1CSJM");
    private static WebDriver driver;
    public OrderFormPage(WebDriver driver) {

        this.driver = driver;
    }
    public  static void vvodName1() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(NAME));
        driver.findElement(NAME).clear();
        driver.findElement(NAME).sendKeys("Борис");
    }
    public  static void vvodName2() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(NAME));
        driver.findElement(NAME).clear();
        driver.findElement(NAME).sendKeys("Anna");
    }
    public  static void vvodFam1() {
        driver.findElement(FAM).clear();
        driver.findElement(FAM).sendKeys("Борисов");
    }
    public  static void vvodFam2() {
        driver.findElement(FAM).clear();
        driver.findElement(FAM).sendKeys("Annovna");
    }
    public  static void vvodAdres1() {
        driver.findElement(ADRES).clear();
        driver.findElement(ADRES).sendKeys("Борисова 1");
    }
    public  static void vvodAdres2() {
        driver.findElement(ADRES).clear();
        driver.findElement(ADRES).sendKeys("Annovnikov 1");
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
    public  static void vvodPhone1() {
        driver.findElement(PHONE).clear();
        driver.findElement(PHONE).sendKeys("+79899507744");
    }
    public  static void vvodPhone2() {
        driver.findElement(PHONE).clear();
        driver.findElement(PHONE).sendKeys("+798995077444");
    }
    //public  static void clickDalee() {
      //  new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(DALEE));
      //  driver.findElement(DALEE).click();
   // }
}