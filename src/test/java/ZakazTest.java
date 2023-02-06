import Page.*;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ZakazTest {
    private WebDriver driver;

    @Test
    public void testUpZakaz(){
        driver = new ChromeDriver();
        // Открываем сервис
        driver.get("https://qa-scooter.praktikum-services.ru/");
        // Создаем экземпляр класса Page.FAQPage
        HeaderPage headerPage = new HeaderPage(driver);
        HeaderPage.upZakazClick();
        OrderFormPage orderFormPage = new OrderFormPage(driver);
        OrderFormPage.fillOrderUpZakaz();
        OrderFormPage.vvodMetro1();
        OrderFormPage.clickDalee();
        OrderForm2 orderForm2 = new OrderForm2(driver);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        OrderForm2.vvodKogda();
        OrderForm2.vvodSrok();
        OrderForm2.vvodColor();
        OrderForm2.vvodKoment();
        OrderForm2.clickNazad();
        OrderFormPage.clickDalee();
        OrderForm2.clickZakaz();
        OrderForm2.clickDa();
        }


    @Test
    public void testDownZakaz(){
        driver = new ChromeDriver();
        // Открываем сервис
        driver.get("https://qa-scooter.praktikum-services.ru/");
        FAQPage faqPage = new FAQPage(driver);
        FAQPage.quqClick();
        // Создаем экземпляр класса Page.FAQPage
        RoadMapPage roadMapPage = new RoadMapPage(driver);
        RoadMapPage.downZakazClick();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        OrderFormPage orderFormPage = new OrderFormPage(driver);
        OrderFormPage.fillOrderDownZakaz();
        OrderFormPage.vvodMetro2();
        OrderFormPage.clickDalee();
    }

    @After
    public void cleanUp(){
       // driver.quit();
    }
}
