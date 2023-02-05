import Page.FAQPage;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaqTest {
    private WebDriver driver;

    @Test
    public void test(){
        driver = new ChromeDriver();
        // Открываем сервис
        driver.get("https://qa-scooter.praktikum-services.ru/");

        // Создаем экземпляр класса Page.FAQPage
        FAQPage faqPage = new FAQPage(driver);

        FAQPage.quqClick();

        String[] expectedText = {
                "Сутки — 400 рублей. Оплата курьеру — наличными или картой.",
                "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.",
                "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",
                "Только начиная с завтрашнего дня. Но скоро станем расторопнее.",
                "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",
                "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",
                "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."
        };

        for (int i = 0; i < expectedText.length; i++) {
            if (driver.findElement(By.id("accordion__heading-" + i)).isDisplayed()) {
            FAQPage.openQuestion(i);
            String actualText = FAQPage.getQuestionAnswer(i);
                if (!actualText.equals(expectedText[i])) {
                    System.out.println("Ожидаем текст ответа " + (i + 1) + ": " + expectedText[i] + " ' получаем отличный текст '" + actualText + "'");
                }
                if (!driver.findElement(By.id("accordion__panel-" + i)).isDisplayed()) {
                    System.out.println("Error: Ответна вопрос " + (i + 1) + " не отображается");
                }
            } else {
                System.out.println("Error: вопрос" + (i + 1) + " не отображен");
            }
            }
        }

    @After
    public void cleanUp(){

        driver.quit();
    }
}
