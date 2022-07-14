import locator.*;
import org.junit.Test;
import org.my.second.BaseUITest;
import static org.junit.Assert.*;

public class TestScooter extends BaseUITest {

    @Test
    public void QuestionsAboutImportant1() {

        String info = new QuestionsAboutImportant(driver).
               open().
               skrolQuestion().
                waitForLoadHomePage().
               checkAnswer(0);
               assertEquals("Некорректный текст выпадающего списка в вопросе Сколько это стоит? И как оплатить?","Сутки — 400 рублей. Оплата курьеру — наличными или картой.",info);
    }

    @Test
    public void QuestionsAboutImportant2() {

        String info = new QuestionsAboutImportant(driver).
                open().
                waitForLoadHomePage().
                skrolQuestion().
                checkAnswer(1);
        assertEquals("Некорректный текст выпадающего списка в вопросе Хочу сразу несколько самокатов! Так можно?","Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.",info);
    }

    @Test
    public void QuestionsAboutImportant3() {

        String info = new QuestionsAboutImportant(driver).
                open().
                waitForLoadHomePage().
                skrolQuestion().
                checkAnswer(2);
        assertEquals("Некорректный текст выпадающего списка в вопросе Как рассчитывается время аренды?","Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",info);
    }


    @Test
    public void QuestionsAboutImportant4() {

        String info = new QuestionsAboutImportant(driver).
                open().
                waitForLoadHomePage().
                skrolQuestion().
                checkAnswer(3);
        assertEquals("Некорректный текст выпадающего списка в вопросе Можно ли заказать самокат прямо на сегодня?","Только начиная с завтрашнего дня. Но скоро станем расторопнее.",info);
    }

    @Test
    public void QuestionsAboutImportant5() {

        String info = new QuestionsAboutImportant(driver).
                open().
                waitForLoadHomePage().
                skrolQuestion().
                checkAnswer(4);
        assertEquals("Некорректный текст выпадающего списка в вопросе Можно ли продлить заказ или вернуть самокат раньше?",
                "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",info);
    }
    @Test
    public void QuestionsAboutImportant6() {

        String info = new QuestionsAboutImportant(driver).
                open().
                waitForLoadHomePage().
                skrolQuestion().
                checkAnswer(5);
        assertEquals("Некорректный текст выпадающего списка в вопросе Вы привозите зарядку вместе с самокатом??",
                "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",info);
    }
    @Test
    public void QuestionsAboutImportant7() {

        String info = new QuestionsAboutImportant(driver).
                open().
                waitForLoadHomePage().
                skrolQuestion().
                checkAnswer(6);
        assertEquals("Некорректный текст выпадающего списка в вопросе Можно ли отменить заказ?",
                "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.",info);
    }

    @Test
    public void QuestionsAboutImportant8() {

        String info = new QuestionsAboutImportant(driver).
                open().
                waitForLoadHomePage().
                skrolQuestion().
                checkAnswer(7);
        assertEquals("Некорректный текст выпадающего списка в вопросе Я жизу за МКАДом, привезёте??",
                "Да, обязательно. Всем самокатов! И Москве, и Московской области.",info);
    }


    @Test
   public void Order_button_1() {

       boolean order = new OrderPage(driver).
               open().
               OrderButton_1().
               enterOrderForm("Анна","Партрутская","Черкизова","89081152555").
               enterNextButton().
               enterDate("14.07.2022").
               enterRental().
               enterColorScoter().
               enterComment("dfsdfs").
               enterOrder().
               enterYesButton().
               isOrderHasBeenPlaced();

       assertTrue("Order not found image is not displayed",order);
    }

    @Test
    public void Order_button_2() {
        boolean order = new OrderPage(driver).
                open().
                skrolButton().
                OrderButton_2().
                enterOrderForm("Иван","Партрутский","Черкизова","89081172555").
                enterNextButton().
                enterDate("14.07.2022").
                enterRental().
                enterColorScoter().
                enterComment("dfsdfs").
                enterOrder().
                enterYesButton().
                isOrderHasBeenPlaced();

        assertTrue("Order not found image is not displayed",order);
    }
}
