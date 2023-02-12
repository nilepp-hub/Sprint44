package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderForm2 {
    private static final By KOGDA = By.xpath("//input[@placeholder=\"* Когда привезти самокат\"]");
    private static final By SROK = By.className("Dropdown-placeholder");
    private static final By DAY = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[2]");
    private static final By COLOR = By.id("black");
    private static final By KOMENT = By.xpath("//input[@placeholder=\"Комментарий для курьера\"]");
    private static final By NAZAD = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button[1]");
    private static final By ZAKAZ = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button[2]");
    private static final By DA = By.xpath("//*[@id=\"root\"]/div/div[2]/div[5]/div[2]/button[2]");
    private static WebDriver driver;
    public OrderForm2(WebDriver driver) {

        this.driver = driver;
    }
    public  static void vvodKogda() {
        driver.findElement(KOGDA).sendKeys("16.02.23");
        driver.findElement(KOGDA).sendKeys(Keys.ENTER);
    }
    public  static void vvodSrok() {
        driver.findElement(SROK).click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(DAY));
        driver.findElement(DAY).click();
    }
    public  static void vvodColor() {
        driver.findElement(COLOR).click();
    }
    public  static void vvodKoment() {
        driver.findElement(KOMENT).sendKeys("КОНЯ! HORSE");
    }
    public  static void clickNazad() {
        driver.findElement(NAZAD).click();
    }
    public  static void clickZakaz() {
        driver.findElement(ZAKAZ).click();
    }
    public  static void clickDa() {
        driver.findElement(DA).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("Order_Text__2broi")));
        String orderNumber = driver.findElement(By.className("Order_Text__2broi")).getText().split(" ")[2];
        System.out.println("Номер заказа: " + orderNumber);
    }
}
