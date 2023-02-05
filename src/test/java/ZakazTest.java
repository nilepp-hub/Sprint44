import Page.FAQPage;
import Page.HeaderPage;
import Page.OrderFormPage;
import Page.RoadMapPage;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
        OrderFormPage.vvodName1();
        OrderFormPage.vvodFam1();
        OrderFormPage.vvodAdres1();
        OrderFormPage.vvodMetro1();
        OrderFormPage.vvodPhone1();
        //Page.OrderFormPage.clickDalee();
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
        OrderFormPage.vvodName2();
        OrderFormPage.vvodFam2();
        OrderFormPage.vvodAdres2();
        OrderFormPage.vvodMetro2();
        OrderFormPage.vvodPhone2();
       // OrderFormPage.clickDalee();
    }

    @After
    public void cleanUp(){

       // driver.quit();
    }
}
